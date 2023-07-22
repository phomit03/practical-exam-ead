package com.example.practicalexamead.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ProdID;
    private String ProdName;
    private String Description;
    private Date DateOfManf;
    private BigDecimal Price;

    //con & get,set
    public Product(){}
    public Product(Long prodID, String prodName, String description, Date dateOfManf, BigDecimal price) {
        ProdID = prodID;
        ProdName = prodName;
        Description = description;
        DateOfManf = dateOfManf;
        Price = price;
    }

    public Long getProdID() {
        return ProdID;
    }

    public void setProdID(Long prodID) {
        ProdID = prodID;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getDateOfManf() {
        return DateOfManf;
    }

    public void setDateOfManf(Date dateOfManf) {
        DateOfManf = dateOfManf;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }
}
