package com.imagegrafia.springwebflux.service;

import com.imagegrafia.springwebflux.model.Stock;
import com.imagegrafia.springwebflux.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class StockService {

    private StockRepository stockRepository;

    public Flux<Stock> getAllStock() {
        return stockRepository.findAll();
    }

    public Mono<Stock>  saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Mono<Stock> findStockById(String id){
        return stockRepository.findById(id);
    }
}
