package com.novart.crm.novart.controller;

import com.novart.crm.novart.model.Setor;
import com.novart.crm.novart.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("setor")
public class SetorController {

    @Autowired
    private SetorService setorService;

    @GetMapping
    public List<Setor> getTest(){
        return setorService.findSetor();
    }
}
