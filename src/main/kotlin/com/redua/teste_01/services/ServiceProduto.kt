package com.redua.teste_01.services

import com.redua.teste_01.dominios.Produto
import com.redua.teste_01.repositores.ProdutoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ServiceProduto(){

    lateinit var produtoRepository: ProdutoRepository

    fun save(produto:Produto){
        produtoRepository.save(produto)
    }

    fun findAllClientes(): List<Produto> = produtoRepository.findAll().toList()
    fun findClienteById(id: Long): Produto? = produtoRepository.findByIdOrNull(id)
}