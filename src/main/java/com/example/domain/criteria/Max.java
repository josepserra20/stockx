package com.example.domain.criteria;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.domain.item.Item;
import com.example.domain.item.Offer;

public class Max implements Criteria {

    // SIZE
    private Criteria criteria;
    // BIDS
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otheCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otheCriteria;

    }
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);

        Optional<Offer> optCriteria = andCriteria.checkCriteria(sneaker).stream()
        .max(Offer::compareTo);

        return optCriteria.isPresent() ? List.of(optCriteria.get()) : List.of();
    }
    
}
