package com.redua.teste_01.repositores

import com.redua.teste_01.dominios.Produto
import org.springframework.data.jpa.repository.JpaRepository

interface ProdutoRepository: JpaRepository<Produto, Long> {
}