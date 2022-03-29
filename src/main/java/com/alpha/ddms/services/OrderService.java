package com.alpha.ddms.services;

import com.alpha.ddms.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
}
