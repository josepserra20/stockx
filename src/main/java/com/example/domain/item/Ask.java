package com.example.domain.item;

public class Ask implements Offer {

    private String size;
    private Integer ask;
    
    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        // TODO Auto-generated method stub
        return this.size;
    }

    @Override
    public int value() {
        // TODO Auto-generated method stub
        return this.ask;
    }

    @Override
    public int compareTo(Offer oferta) {
        // this.ask.compareTo(oferta);
        return 0;
    }
    
    public String toString() {
        return this.size() + " " + this.value() + "\n";
    }
}
