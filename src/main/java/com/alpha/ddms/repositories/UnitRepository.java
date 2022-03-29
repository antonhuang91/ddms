package com.alpha.ddms.repositories;

import com.alpha.ddms.domains.UnitModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnitRepository extends JpaRepository<UnitModel, String> {
}
