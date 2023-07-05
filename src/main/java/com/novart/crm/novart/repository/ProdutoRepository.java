package com.novart.crm.novart.repository;

import com.novart.crm.novart.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
