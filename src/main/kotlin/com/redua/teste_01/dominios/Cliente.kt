package com.redua.teste_01.dominios

import jakarta.persistence.*

@Entity
@Table(name="tb_cliente")
data class Cliente( @Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
                    val id: Long,
                    val nome: String)