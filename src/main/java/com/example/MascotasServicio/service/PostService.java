package com.example.MascotasServicio.service;

import com.example.MascotasServicio.model.Pets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.MascotasServicio.config.RestTemplateConfig;

import java.util.Arrays;
import java.util.List;

// Esta clase contiene la lógica para hacer la llamada a la API externa
@Service
public class PostService {

    private static final String API_URL = "https://jsonplaceholder.typicode.com/posts";

    @Autowired
    private RestTemplate restTemplate;

    public List<Pets> obtenerPosts() {
        // Hacemos una petición GET a la API externa y convertimos el JSON recibido en un array de objetos Post
        Pets[] posts = restTemplate.getForObject(API_URL, Pets[].class);

        // Convertimos el array en una lista para trabajar más cómodamente
        return Arrays.asList(posts);
    }
}


