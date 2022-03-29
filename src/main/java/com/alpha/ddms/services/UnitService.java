package com.alpha.ddms.services;

import com.alpha.ddms.repositories.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UnitService {
    @Autowired
    UnitRepository unitRepository;
}
