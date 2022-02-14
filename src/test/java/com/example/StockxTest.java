package com.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.domain.Stockx;
import com.example.domain.item.Sneaker;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StockxTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAppHasADraw()
    {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertNotNull("app debe tener un draw", Stockx.draw(sneaker));
    }
}
