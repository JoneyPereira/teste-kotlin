package com.redua.teste_01.services

import com.redua.teste_01.dominios.Pedido
import com.redua.teste_01.repositores.PedidoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ServicePedido(){

    lateinit var pedidoRepository: PedidoRepository

    fun save(pedido:Pedido){
        pedidoRepository.save(pedido)
    }

    fun findAllPedidos(): List<Pedido> = pedidoRepository.findAll().toList()
    fun findPedidoById(id: Long): Pedido? = pedidoRepository.findByIdOrNull(id)
}