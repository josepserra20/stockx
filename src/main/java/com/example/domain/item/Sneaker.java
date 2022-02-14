package com.example.domain.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Sneaker implements Item {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

    private List<Offer> offers = new ArrayList<>();


    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;

    }

    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getBid() {
        
        return bid;
    }

    @Override
    public int getAsk() {
        
        return this.ask;
    }

    @Override
    public int getSale() {
        
        return this.sale;
    }

    @Override
    public void add(Offer offert) {
        this.offers.add(offert);
        
    }

    @Override
    public List<Offer> offers() {
        return this.offers;  
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
        
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
        
    }

    public String toString() {
        return getName() +"\n" + "\t\t" + getStyle() + "\n\t\t";
    }
    
}
