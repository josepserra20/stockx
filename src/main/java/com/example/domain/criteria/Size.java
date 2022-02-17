package com.example.domain.criteria;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.domain.item.Item;
import com.example.domain.item.Offer;
import com.example.domain.item.Sale;

public class Size implements Criteria{

    private String size;

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream()
        .filter(o -> o.size().equals(this.size))
        .collect(Collectors.toList());

        
    }
    
    // testing
    public String getSize() {
        return this.size;
    }
}
