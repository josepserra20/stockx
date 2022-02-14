package com.example.domain.criteria;

import com.example.domain.item.Item;
import com.example.domain.item.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item sneaker);
}
