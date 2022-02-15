package com.example.domain.criteria;

import java.util.List;
import java.util.Optional;

import com.example.domain.item.Item;
import com.example.domain.item.Offer;
import com.example.domain.item.Sale;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> lastSale = sneaker.offers().stream().filter(o -> o instanceof Sale)
        .reduce((first, second) -> second);

        return lastSale.isPresent() ? List.of(lastSale.get()) : List.of();
    }
    
}
