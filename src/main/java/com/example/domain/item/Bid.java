package com.example.domain.item;

public class Bid implements Offer {
    
    private String size = "";
    private Integer bid = 0;
    
    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        
        return this.bid;
    }

    @Override
    public int compareTo(Offer oferta) {
       return Integer.compare(oferta.value(), this.bid);
       
    }
    
    @Override
    public String toString() {
        return this.size() + " " + this.value() + "\n";
    }
}
