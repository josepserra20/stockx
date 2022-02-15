package com.example.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.domain.Stockx;
import com.example.domain.item.Ask;
import com.example.domain.item.Bid;
import com.example.domain.item.Sneaker;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SneakerTest
{
    /**
     * Rigorous Test :-)
     */
    Sneaker sneaker = null;
     @Before
     public void setup() 
     {
        this.sneaker = new Sneaker("555088-105", "Jordan 1");
     }
    @Test
    public void constructor()
    {
        assertEquals("555088-105", sneaker.getStyle());
        assertEquals("Jordan 1", sneaker.getName());
    }

    @Test
    public void addOfferBid() 
    {
        Bid bid = new Bid("9.5", 282);
        sneaker.add(bid);
        assertEquals(1, sneaker.offers().size());
    }

    @Test
    public void addOfferAsk() 
    {
        Ask ask = new Ask("9.5", 282);
        sneaker.add(ask);
        sneaker.add(new Ask("13", 222));

        assertEquals(2, sneaker.offers().size());
    }

    


}
