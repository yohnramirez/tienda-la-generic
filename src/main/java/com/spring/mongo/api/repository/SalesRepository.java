package com.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Sale;

public interface SalesRepository extends MongoRepository<Sale, Integer>{

}
