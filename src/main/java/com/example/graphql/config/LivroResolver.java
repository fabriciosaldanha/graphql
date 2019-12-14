package com.example.graphql.config;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.entity.Livro;
import com.example.graphql.repository.LivroRepository;

public class LivroResolver implements GraphQLResolver<Livro> {
    private final LivroRepository livroRepository;

    public LivroResolver(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }


}
