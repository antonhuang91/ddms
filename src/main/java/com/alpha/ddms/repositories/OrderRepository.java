package com.alpha.ddms.repositories;

import com.alpha.ddms.domains.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel,String> {
}
