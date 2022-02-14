package com.example.domain.criteria;

import java.util.List;
import java.util.stream.Collectors;

import com.example.domain.item.Ask;
import com.example.domain.item.Item;
import com.example.domain.item.Offer;

public class Asks implements Criteria {
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream()
        .filter(o -> o instanceof Ask)
        .sorted(Offer::compareTo)
        .collect((Collectors.toList()));
    }
}
