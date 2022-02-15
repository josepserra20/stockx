package com.example.criteria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import com.example.domain.criteria.Criteria;
import com.example.domain.criteria.Sales;
import com.example.domain.criteria.Size;
import com.example.domain.item.Offer;
import com.example.domain.item.Sale;
import com.example.domain.item.Sneaker;

import org.junit.Before;
import org.junit.Test;

public class SizeTest {
    
    @Test
    public void SizeConstructor() {
        Size size = null;
        size = new Size("9.9");

        assertNotNull("Constructor",size);
        assertEquals("9.9", size.getSize());
    }

    @Test 
    public void checkSizes() {

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(new Sale("13", 372));

        Criteria size = new Size("9.5");
        
        List<Offer> tallas9 = size.checkCriteria(sneaker);
        
        // Optional<Offer> checkTalla = Optional.ofNullable(tallas9.get(0));
        assertTrue(tallas9.stream().allMatch((o) -> o.size().equals("9.5")));
        
        
    }
    
}
