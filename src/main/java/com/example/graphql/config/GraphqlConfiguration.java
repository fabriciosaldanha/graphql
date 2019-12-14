package com.example.graphql.config;

import com.example.graphql.repository.AutorRepository;
import com.example.graphql.repository.EditoraRepository;
import com.example.graphql.repository.LivroRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfiguration {

    @Bean
    public LivroResolver livroResolver(LivroRepository livroRepository) {
        return new LivroResolver(livroRepository);
    }

    @Bean
    public AutorResolver autorResolver(AutorRepository autorRepository) {
        return new AutorResolver( autorRepository);
    }

    @Bean
    public Query query(LivroRepository livroRepository, AutorRepository autorRepository, EditoraRepository editoraRepository) {
        return new Query(livroRepository, autorRepository, editoraRepository);
    }

    @Bean
    public Mutation mutation(LivroRepository livroRepository) {
        return new Mutation(livroRepository);
    }
}
