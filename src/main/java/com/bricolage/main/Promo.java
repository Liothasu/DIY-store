package com.bricolage.main;

import java.math.BigInteger;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Promo {

    @Id
    @GeneratedValue
    private BigInteger id;
    private double percent;
    private LocalDate dateBegin;
    private LocalDate dateEnd;

    @ManyToMany
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;


    public Promo(double percent, LocalDate dateBegin, LocalDate dateEnd) {
        this.percent = percent;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public LocalDate getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }
}
