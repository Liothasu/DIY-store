package com.bricolage.main;

import java.math.BigInteger;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private BigInteger id;

    private LocalDate dateOrder;
    private StatutOrder statut;
    private String paymentMod;
    private double total;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
    
    public Order(LocalDate dateOrder, StatutOrder statut, String paymentMod, double total) {
        this.dateOrder = dateOrder;
        this.statut = statut;
        this.paymentMod = paymentMod;
        this.total = total;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public StatutOrder getStatut() {
        return statut;
    }

    public void setStatut(StatutOrder statut) {
        this.statut = statut;
    }

    public String getPaymentMod() {
        return paymentMod;
    }

    public void setPaymentMod(String paymentMod) {
        this.paymentMod = paymentMod;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
