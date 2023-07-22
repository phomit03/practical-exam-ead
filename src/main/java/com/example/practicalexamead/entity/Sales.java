package com.example.practicalexamead.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@Table(name = "sales")
public class Sales implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SlNo;
    private Long SalesmanID;

    @ManyToOne
    @JoinColumn(name = "ProdID")
    private Product productSales;

    private String SalesmanName;
    private Date DOS;

    public Sales(){}
    public Sales(Long slNo, Long salesmanID, Product productSales, String salesmanName, Date DOS) {
        SlNo = slNo;
        SalesmanID = salesmanID;
        this.productSales = productSales;
        SalesmanName = salesmanName;
        this.DOS = DOS;
    }

    public Long getSlNo() {
        return SlNo;
    }

    public void setSlNo(Long slNo) {
        SlNo = slNo;
    }

    public Long getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(Long salesmanID) {
        SalesmanID = salesmanID;
    }

    public Product getProductSales() {
        return productSales;
    }

    public void setProductSales(Product productSales) {
        this.productSales = productSales;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public Date getDOS() {
        return DOS;
    }

    public void setDOS(Date DOS) {
        this.DOS = DOS;
    }
}
