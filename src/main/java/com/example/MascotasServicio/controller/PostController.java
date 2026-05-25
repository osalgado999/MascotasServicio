package com.example.MascotasServicio.controller;

import com.example.MascotasServicio.model.Pets;
import com.example.MascotasServicio.service.PostService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;






import java.util.List;

// Este controlador escucha peticiones HTTP en /api/posts
@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;
    @GetMapping
    public List<Pets> getPosts() {
        // Cuando alguien visita /api/posts, respondemos con la lista de posts obtenida desde la API externa
        return postService.obtenerPosts();
    }
}
