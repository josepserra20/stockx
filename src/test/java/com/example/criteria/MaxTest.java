package com.example.criteria;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import com.example.domain.criteria.Bids;
import com.example.domain.criteria.Criteria;
import com.example.domain.criteria.Max;
import com.example.domain.criteria.Size;
import com.example.domain.item.Bid;
import com.example.domain.item.Offer;
import com.example.domain.item.Sneaker;

import org.junit.Before;
import org.junit.Test;

public class MaxTest {
    
    
    @Test
    public void checkMaxTest() {
        Sneaker sneaker = new Sneaker("33333","Jordan");
        sneaker.add(new Bid("13",550));
        sneaker.add(new Bid("13",456));
        sneaker.add(new Bid("13",345));
        sneaker.add(new Bid("13",123));
        sneaker.add(new Bid("13",800));

        Criteria size = new Size("13");
        Criteria bids = new Bids();
        Criteria max = new Max(size,bids);

        List<Offer> filteredBids = max.checkCriteria(sneaker);
         
        assertEquals(800, filteredBids.get(0).value());

    } 
}
