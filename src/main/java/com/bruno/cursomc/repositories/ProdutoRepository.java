package com.bruno.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
