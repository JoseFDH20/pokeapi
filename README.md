## pokeapi
Servicio web SOAP usando Spring boot. Consume el servicio rest de pokeapi.co

El proyecto ejecutar con Eclipse IDE o usar maven para construir el proyecto y generar el jar.

Crear una base de datos en MySQL con el nombre "pokeapidb"

Dentro de la carpeta del proyecto
 ```
 cd pokeapicosoap
 ```

Para construir el proyecto ejecutar
```
mvn package
 ```

Ejecutar aplicación 
```
java -jar target/pokeapicosoap-0.0.1-SNAPSHOT.jar
```

Para ejecutar una prueba por 
```
curl --header "content-type: text/xml" -d @requestByName.xml http://localhost:8080/ws > output.xml
```
