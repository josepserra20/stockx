package com.example.domain.item;

public class Sale implements Offer {

    private String size;
    private Integer price;
    
    public Sale(String size, int price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        // TODO Auto-generated method stub
        return this.size;
    }

    @Override
    public int value() {
        // TODO Auto-generated method stub
        return this.price;
    }

    @Override
    public int compareTo(Offer oferta) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public String toString() {
        return this.size() + " " + this.value() + "\n";
    }
    
}
