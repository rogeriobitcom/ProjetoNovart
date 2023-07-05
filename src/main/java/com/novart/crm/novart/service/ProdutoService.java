package com.novart.crm.novart.service;

import com.novart.crm.novart.model.Produto;
import com.novart.crm.novart.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public List<Produto> findProdutos(){
        return produtoRepository.findAll();
    }

}
