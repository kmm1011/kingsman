package com.projectFinal.kingsmanOne.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity                          /*Tells the JPA provider that the class should be treated as a table in the database */
@Table(name = "strproducts")       /*Provides the name of the SQL table*/
public class Product {

    @Id                                   /*Primary Key*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Increments automatically
    private int id;

    private String name;  /*Private attributes are only accessible through the Product class */
    private String brand;
    private String category;
    private double price;

    @Column (columnDefinition = "TEXT")
    private String description;
    private Date createdAt;
    private String imageFileName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
