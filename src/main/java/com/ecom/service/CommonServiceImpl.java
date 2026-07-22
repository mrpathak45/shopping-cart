/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecom.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author hp
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Override
    public void removeSessionMessage() {
       HttpServletRequest request= ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest();
      HttpSession session= request.getSession();
      session.removeAttribute("succMsg");
      session.removeAttribute("errorMsg");
    }
    
}
