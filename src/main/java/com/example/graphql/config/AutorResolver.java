package com.example.graphql.config;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.entity.Autor;
import com.example.graphql.repository.AutorRepository;
import com.example.graphql.repository.LivroRepository;

public class AutorResolver implements GraphQLResolver<Autor> {
    private final AutorRepository autorRepository;

    public AutorResolver(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }



}
