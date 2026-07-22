/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ecom.repository;

import com.ecom.model.ProductOrder;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hp
 */
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer>{

    public List<ProductOrder> findByUserId(Integer userId);

    public ProductOrder findByOrderId(String orderId);
    
}
