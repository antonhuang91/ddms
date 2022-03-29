package com.alpha.ddms.repositories;

import com.alpha.ddms.domains.DealerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealerRepository extends JpaRepository<DealerModel, String> {
}
