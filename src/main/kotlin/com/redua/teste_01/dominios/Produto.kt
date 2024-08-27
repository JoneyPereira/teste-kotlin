package com.redua.teste_01.dominios

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name="tb_produto")
data class Produto( @Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
                    val produtoId: Long,
                    val nome: String,
                    val categoria: Categoria,
                    val valor: BigDecimal)
