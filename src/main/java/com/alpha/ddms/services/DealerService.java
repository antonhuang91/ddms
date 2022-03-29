package com.alpha.ddms.services;

import com.alpha.ddms.repositories.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DealerService {
    @Autowired
    DealerRepository dealerRepository;

    public void  saveDealer (String dealerId,String dealerName, String dealerClass, String telpNumber,String alamat, String dealerExtCode, String  dealerStatus){

    }
}
