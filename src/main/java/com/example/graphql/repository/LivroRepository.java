package com.example.graphql.repository;

import com.example.graphql.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
