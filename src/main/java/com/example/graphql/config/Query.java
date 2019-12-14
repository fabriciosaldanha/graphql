package com.example.graphql.config;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.entity.Autor;
import com.example.graphql.entity.Editora;
import com.example.graphql.entity.Livro;
import com.example.graphql.repository.AutorRepository;
import com.example.graphql.repository.EditoraRepository;
import com.example.graphql.repository.LivroRepository;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;
    private final EditoraRepository editoraRepository;

    public Query(LivroRepository livroRepository, AutorRepository autorRepository, EditoraRepository editoraRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
        this.editoraRepository = editoraRepository;
    }

    public List<Livro> livros() {
        return livroRepository.findAll();
    }

    public List<Autor> autores() {
        return autorRepository.findAll();
    }

    public List<Editora> editoras() {
        return editoraRepository.findAll();
    }
}
