package com.example.domain.criteria;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.domain.item.Bid;
import com.example.domain.item.Item;
import com.example.domain.item.Offer;


public class Bids implements Criteria {

    // public Bids() {};
     
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream()
        .filter(o -> o instanceof Bid)
        .sorted(Offer::compareTo)
        .collect(Collectors.toList());
    }
    
}
