package com.imagegrafia.springwebflux.repository;

import com.imagegrafia.springwebflux.model.Stock;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends ReactiveMongoRepository<Stock,String> {
}
