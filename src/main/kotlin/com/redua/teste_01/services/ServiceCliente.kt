package com.redua.teste_01.services

import com.redua.teste_01.dominios.Cliente
import com.redua.teste_01.dominios.Pedido
import com.redua.teste_01.repositores.ClienteRepository
import com.redua.teste_01.repositores.PedidoRepository
import com.redua.teste_01.repositores.ProdutoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ServiceCliente(){

    lateinit var clienteRepository: ClienteRepository

    fun save(cliente:Cliente){
        clienteRepository.save(cliente)
    }

    fun findAllClientes(): List<Cliente> = clienteRepository.findAll().toList()
    fun findClienteById(id: Long): Cliente? = clienteRepository.findByIdOrNull(id)
}