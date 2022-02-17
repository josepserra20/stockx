package com.example.domain.criteria;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.example.domain.item.Item;
import com.example.domain.item.Offer;
import com.example.domain.item.Sale;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;

    }
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        
        List<Offer> FilterSize = criteria.checkCriteria(sneaker);
        List<Offer> OtherCriteriaFilter = otherCriteria.checkCriteria(sneaker);
        
        List<Offer> AndCriteria = new ArrayList<Offer>();
        for (Offer offer : FilterSize) {
            if (OtherCriteriaFilter.contains(offer)) {
                AndCriteria.add(offer);
            }
        }
    return AndCriteria;
    }
    
}
