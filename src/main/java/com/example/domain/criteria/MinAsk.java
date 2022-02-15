package com.example.domain.criteria;

import java.util.List;
import java.util.Optional;

import com.example.domain.item.Ask;
import com.example.domain.item.Item;
import com.example.domain.item.Offer;

public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        
        Optional<Offer> minAsk = sneaker.offers().stream().filter(o -> o instanceof Ask)
        .min(Offer::compareTo);
        return minAsk.isPresent() ? List.of(minAsk.get()) : List.of();
    }
    
}
