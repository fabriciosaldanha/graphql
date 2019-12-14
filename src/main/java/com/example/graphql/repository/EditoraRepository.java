package com.example.graphql.repository;

import com.example.graphql.entity.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EditoraRepository extends JpaRepository<Editora, Long> {
}
