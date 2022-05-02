package com.company;

import com.company.Card;

public class Customer {
    public String dni;
    public String name;
    public String surname;
    public int age;
    public String phone;
    public String favoriteColorCar;
    public String favoriteBrandCar;
    public Card card;

    // empty constructor
    public Customer() {

    }

    //constructor with card
    public Customer (String dni, String name, String surname, int age, String phone, String favoriteColorCar, String favoriteBrandCar, Card card){
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.favoriteColorCar = favoriteColorCar;
        this.favoriteBrandCar = favoriteBrandCar;
        this.card = card;
    }

    //constructor without card
    public Customer(String dni, String name, String surname, int age, String phone, String favoriteColorCar, String favoriteBrandCar) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.favoriteColorCar = favoriteColorCar;
        this.favoriteBrandCar = favoriteBrandCar;
    }

    //set phone number
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //set customer favorite color car
    public void setFavoriteColorCar(String favoriteColorCar) {
        this.favoriteColorCar = favoriteColorCar;
    }

    //set customer favorite brand Car
    public void setFavoriteBrandCar(String favoriteBrandCar) {
        this.favoriteBrandCar = favoriteBrandCar;
    }

    //set attributes of Card
    public void setCard(Card card) {

    }

    // check if exist dni
    public boolean checkExistDni(String dni){


        return false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", favoriteColorCar='" + favoriteColorCar + '\'' +
                ", favoriteBrandCar='" + favoriteBrandCar + '\'' +
                ", card=" + card +
                '}';
    }
}
