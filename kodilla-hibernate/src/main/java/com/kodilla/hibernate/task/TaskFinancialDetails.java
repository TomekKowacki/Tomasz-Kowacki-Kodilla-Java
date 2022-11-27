package com.kodilla.hibernate.task;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TASK_FINANCIAL")
public class TaskFinancialDetails {

    private int id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails(){
    }

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "PAID")
    public boolean isPaid() {
        return paid;
    }

    private void setPaid(boolean paid) {
        this.paid = paid;
    }


}
