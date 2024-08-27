package com.redua.teste_01.controllers

import com.redua.teste_01.dominios.Pedido
import com.redua.teste_01.services.ServicePedido
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pedidos")
class PedidoController(val servicePedido: ServicePedido) {

    @GetMapping
    fun getPedidos(): List<Pedido> = servicePedido.findAllPedidos()

    @GetMapping("{id}")
    fun getPedidosById(@PathVariable id: Long): Pedido? = servicePedido.findPedidoById(id)

    @PostMapping
    fun postPedidos(@RequestBody pedido: Pedido) {
        servicePedido.save(pedido)
    }
}