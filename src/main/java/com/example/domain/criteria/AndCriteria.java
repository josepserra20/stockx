package com.example.domain.criteria;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.example.domain.item.Item;
import com.example.domain.item.Offer;
import com.example.domain.item.Sale;

public class AndCriteria implements Criteria {

    private Criteria critera;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otheCriteria) {
        this.critera = criteria;
        this.otherCriteria = otheCriteria;

    }
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
    return null;

    }
    
}
