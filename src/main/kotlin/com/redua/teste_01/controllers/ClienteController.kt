package com.redua.teste_01.controllers

import com.redua.teste_01.dominios.Cliente
import com.redua.teste_01.services.ServiceCliente
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/clientes")
class ClienteController(val serviceCliente: ServiceCliente) {

    @GetMapping
    fun getClintes(): List<Cliente> = serviceCliente.findAllClientes()

    @GetMapping("{id}")
    fun getClienteById(@PathVariable id: Long): Cliente? = serviceCliente.findClienteById(id)

    @PostMapping
    fun postCliente(@RequestBody cliente: Cliente) {
        serviceCliente.save(cliente)
    }
}