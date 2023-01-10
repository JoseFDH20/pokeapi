package com.josedimash.pokeapicosoap.db.service;

import com.josedimash.pokeapicosoap.db.entity.Request;
import com.josedimash.pokeapicosoap.db.repository.RequestRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    private final RequestRepository requestRepository;
    protected static final Logger logger = LogManager.getLogger(RequestService.class);

    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<Request> list() {
        return requestRepository.findAll();
    }

    public void insertRequest(Request request) {
        this.requestRepository.save(request);
        logger.info("Save request: " + request);
    }
}
