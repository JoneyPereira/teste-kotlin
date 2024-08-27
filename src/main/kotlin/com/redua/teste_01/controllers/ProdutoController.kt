package com.redua.teste_01.controllers

import com.redua.teste_01.dominios.Produto
import com.redua.teste_01.services.ServiceProduto
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produtos")
class ProdutoController(val serviceProduto: ServiceProduto) {

    @GetMapping
    fun getProdutos(): List<Produto> = serviceProduto.findAllClientes()

    @GetMapping("{id}")
    fun getProdutoById(@PathVariable id: Long): Produto? = serviceProduto.findClienteById(id)

    @PostMapping
    fun postProduto(@RequestBody produto: Produto) {
        serviceProduto.save(produto)
    }
}