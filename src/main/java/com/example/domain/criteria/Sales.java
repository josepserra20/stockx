package com.example.domain.criteria;

import java.util.List;
import java.util.stream.Collectors;

import com.example.domain.item.Item;
import com.example.domain.item.Offer;
import com.example.domain.item.Sale;

public class Sales implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream().filter(o -> o instanceof Sale)
        .collect(Collectors.toList());
        
    }
    
}
