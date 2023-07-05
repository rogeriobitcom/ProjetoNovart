package com.novart.crm.novart.service;

import com.novart.crm.novart.model.Setor;
import com.novart.crm.novart.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {
    @Autowired
    private SetorRepository setorRepository;


    public List<Setor> findSetor(){
        return setorRepository.findAll();
    }
}
