package com.example.graphql.config;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.entity.Livro;
import com.example.graphql.repository.LivroRepository;

public class Mutation implements GraphQLMutationResolver {
    private final LivroRepository livroRepository;

    public Mutation(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro writeLivro(String titulo) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        return livroRepository.save(livro);
    }

}
