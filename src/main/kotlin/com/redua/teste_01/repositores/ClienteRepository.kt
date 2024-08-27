package com.redua.teste_01.repositores

import com.redua.teste_01.dominios.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository: JpaRepository<Cliente, Long> {
}