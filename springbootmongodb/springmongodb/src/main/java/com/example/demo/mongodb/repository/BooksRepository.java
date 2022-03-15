package com.example.demo.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.mongodb.model.Books;

public interface BooksRepository extends MongoRepository<Books,Integer> {

}
