package com.josedimash.pokeapicosoap.client;

import com.google.gson.Gson;
import com.josedimash.pokeapicosoap.client.entity.PokemonResponse;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class PokeAPIClient {
    private static final Logger LOGGER = LogManager.getLogger(PokeAPIClient.class);
    public static final String URI = "https://pokeapi.co/api/v2/pokemon/";
    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public void close() {
        try {
            httpClient.close();
        } catch (IOException e) {
            LOGGER.info("Error: ", e);
        }
    }

    public PokemonResponse sendGet(String pokemon) throws Exception {
        HttpGet request = new HttpGet(URI + pokemon);
        PokemonResponse pokemonResponse = new PokemonResponse();
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);
            Gson gson = new Gson();
            LOGGER.info("REQUEST: " + request);
            LOGGER.info("RESPONSE: " + response);
            if (response.getStatusLine().getStatusCode() == 200) {
                pokemonResponse = gson.fromJson(result, PokemonResponse.class);
                return pokemonResponse;
            }
        }

        return null;
    }
}
