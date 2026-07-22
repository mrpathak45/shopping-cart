/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ecom.service;

import com.ecom.model.OrderRequest;
import com.ecom.model.ProductOrder;
import java.util.List;
import org.springframework.data.domain.Page;

/**
 *
 * @author hp
 */
public interface OrderService {
    
    public void saveOrder(Integer userid, OrderRequest orderRequest) throws Exception;
    
    public List<ProductOrder> getOrdersByUser(Integer userId);
    
    public ProductOrder updateOrderStatus(Integer id, String status);
    
    public List<ProductOrder> getAllOrders();
    
    public ProductOrder getOrdersByOrderId(String orderId);
    
     public Page<ProductOrder> getAllOrdersPagination(Integer pageNo, Integer pageSize);
}
