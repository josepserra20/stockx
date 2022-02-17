package com.example.criteria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import com.example.domain.criteria.Bids;
import com.example.domain.criteria.Criteria;
import com.example.domain.item.Bid;
import com.example.domain.item.Offer;
import com.example.domain.item.Sneaker;

import org.junit.Test;

public class BidsTest
{
    /**
     * Rigorous Test :-)
     */


    @Test
    public void testAppHasADraw()
    {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("4.5", 380));

        Criteria bids = new Bids();

        List<Offer> filteredBids = bids.checkCriteria(sneaker);
        assertTrue(filteredBids.stream().allMatch(b -> b instanceof Bid));

        Optional<Offer> maxopt = Optional.ofNullable(filteredBids.get(0));

        sneaker.setBid(maxopt.isPresent() ? maxopt.get().value() : 0);
        
        assertEquals(380, maxopt.get().value());

        Optional<Offer> maxsize = Optional.ofNullable(filteredBids.get(0));
        
        assertEquals("4.5", maxsize.get().size());

        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());



    



         
    }
}