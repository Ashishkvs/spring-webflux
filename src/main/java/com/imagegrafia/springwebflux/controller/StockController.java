package com.imagegrafia.springwebflux.controller;

import com.imagegrafia.springwebflux.model.Stock;
import com.imagegrafia.springwebflux.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/{id}")
    public Mono<Stock> getStockById(@PathVariable String id) {

        return stockService.findStockById(id);
    }

    @GetMapping
    public Flux<Stock> getAlStocks() {
        return stockService.getAllStock();
    }

    @PostMapping
    public Mono<Stock> createStock(@RequestBody Stock stock) {
        return stockService.saveStock(stock);
    }
}
