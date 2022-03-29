package com.alpha.ddms.repositories;

import com.alpha.ddms.domains.PpnModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PpnRepository extends JpaRepository<PpnModel, String> {
}
