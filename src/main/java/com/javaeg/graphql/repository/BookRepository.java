package com.javaeg.graphql.repository;

import com.javaeg.graphql.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}