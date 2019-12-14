package com.example.graphql.repository;

import com.example.graphql.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
