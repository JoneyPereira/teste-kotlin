package com.redua.teste_01.repositores

import com.redua.teste_01.dominios.Pedido
import org.springframework.data.jpa.repository.JpaRepository

interface PedidoRepository: JpaRepository<Pedido, Long> {
}