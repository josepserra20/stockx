package com.example.domain.criteria;

import java.util.List;
import java.util.Optional;

import com.example.domain.item.Bid;
import com.example.domain.item.Item;
import com.example.domain.item.Offer;

public class MaxBid implements Criteria {

//    public MaxBid() {};
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> maxBid = sneaker.offers().stream().filter(o -> o instanceof Bid)
        .max(Offer::compareTo);

        return maxBid.isPresent() ? List.of(maxBid.get()) : List.of();
   }
}
