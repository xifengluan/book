package com.bookmall.pojo;

import java.math.BigDecimal;

/**
 * @author maomeng
 * @create 2021-04-28- 15:21
 */
public class Book {
    private Integer id;
    private String name;
    private String auther;
    private BigDecimal price;
    private Integer sales;
    private Integer stock;
    private String imgpath = "static/img/default.jpg";

    public Book() {
    }

    public Book(Integer id, String name,String auther, BigDecimal price, Integer sales, Integer stock, String imgpath) {
        this.id = id;
        this.name = name;
        this.auther = auther;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
        if (imgpath != null && !"".equals(imgpath)) {
            this.imgpath = imgpath;
        }
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", stock=" + stock +
                ", imgpath='" + imgpath + '\'' +
                '}';
    }
}
