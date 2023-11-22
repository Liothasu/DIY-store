package com.bricolage.main;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private BigInteger id;

    private String reference;
    private String nameProduct;
    private String color;
    private String designation;
    private int quantity;
    private double unitPrice;
    private double priceVAT;
    private double vat;

    @ManyToOne
    @JoinColumn(name = "SUPPLIER_ID")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    public Product(String reference, String nameProduct, String color, String designation, int quantity,
            double unitPrice, double priceVAT, double vat) {
        this.reference = reference;
        this.nameProduct = nameProduct;
        this.color = color;
        this.designation = designation;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.priceVAT = priceVAT;
        this.vat = vat;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getPriceVAT() {
        return priceVAT;
    }

    public void setPriceVAT(double priceVAT) {
        this.priceVAT = priceVAT;
    }

    public double getVAT() {
        return vat;
    }

    public void setVAT(double vat) {
        this.vat = vat;
    }
    
}
