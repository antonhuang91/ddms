package com.alpha.ddms.repositories;

import com.alpha.ddms.domains.SalesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<SalesModel, String> {
}
