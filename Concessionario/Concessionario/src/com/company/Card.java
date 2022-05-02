package com.company;

public class Card {
    public long numberCard;
    public String expiration;
    public String type;
    public int securityCode;

    //constructor without attributes
    public Card() {
    }

    //constructor with all attributes
    public Card(long numberCard, String expiration, String type, int securityCode) {
        this.numberCard = numberCard;
        this.expiration = expiration;
        this.type = type;
        this.securityCode = securityCode;
    }


    @Override
    public String toString() {
        return "Card{" +
                "numberCard=" + numberCard +
                ", expiration='" + expiration + '\'' +
                ", type='" + type + '\'' +
                ", securityCode=" + securityCode +
                '}';
    }
}
