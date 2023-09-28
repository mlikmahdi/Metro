package com.metro;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.metro.models.StationLine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class MetroApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetroApplication.class, args);
        try {
            // Créez un objet ObjectMapper, qui est fourni par Jackson, pour la manipulation JSON.
            ObjectMapper objectMapper = new ObjectMapper();

            // Spécifiez le chemin vers votre fichier JSON.
            File jsonFile = new File("src/main/resources/json/stations.json");

            // Utilisez ObjectMapper pour lire le fichier JSON dans une classe Java.
            StationLine stationLine = objectMapper.readValue(jsonFile, StationLine.class);

            // Maintenant, obj c
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
