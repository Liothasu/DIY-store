package com.bricolage.main;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Supplier {
    @Id
    @GeneratedValue
    private BigInteger id;

    private String nameFactory;
    private int phoneNumber;
    private String email;
    private String numStreet;
    private String city;
    private int postalCode;
    
    public Supplier(String nameFactory, int phoneNumber, String email, String numStreet, String city, int postalCode) {
        this.nameFactory = nameFactory;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.numStreet = numStreet;
        this.city = city;
        this.postalCode = postalCode;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNameFactory() {
        return nameFactory;
    }

    public void setNameFactory(String nameFactory) {
        this.nameFactory = nameFactory;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumStreet() {
        return numStreet;
    }

    public void setNumStreet(String numStreet) {
        this.numStreet = numStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getFullAddress() {
        return numStreet + " " + city + " " + postalCode;
    }
}
