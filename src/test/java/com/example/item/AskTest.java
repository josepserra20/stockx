package com.example.item;

import static org.junit.Assert.assertEquals;

import com.example.domain.item.Ask;

import org.junit.Before;
import org.junit.Test;

public class AskTest {
    
    Ask ask = null;
    @Before
    public void setup() {
        
        this.ask = new Ask("8",300);
    }

    @Test
    public void constructor() {
        assertEquals("8", ask.size());
        assertEquals(300, ask.value());
    }

    
}
