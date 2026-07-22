/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.ecom.util;

/**
 *
 * @author hp
 */
public enum OrderStatus {
    IN_PROGRESS(1,"In Progress"),
    ORDER_RECEIVED(2,"Order Received"), 
    PRODUCT_PACKED(3,"Product Packed"),
    OUT_FOR_DELIVERY(4,"Out For Devivery"),
    DELIVERD(5,"Delivered"),
    CANCEL(6,"Cancelled"),
    Success(7,"Success");
    
    private Integer id;
    private String name;

    private OrderStatus(Integer id, String name) {
        this.id = id;
        this.name = name;
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
    
    
}
