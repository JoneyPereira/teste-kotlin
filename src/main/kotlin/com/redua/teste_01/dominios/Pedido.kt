package com.redua.teste_01.dominios

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate

@Entity
@Table(name="tb_pedido")
data class Pedido( @Id
                   @GeneratedValue(strategy = GenerationType.IDENTITY)
                   val pedidoId: Long,
                   val dataCriacao: LocalDate,
                   val status: StatusPedido,
                   val total: BigDecimal,

                   @ManyToMany(fetch = FetchType.EAGER)
                   @JoinTable(name = "tb_pedidos_produtos",
                       joinColumns = [JoinColumn(name = "pedido_id")],
                       inverseJoinColumns = [JoinColumn(name = "produto_id")])
                   val produtos: Set<Produto>,

                   @ManyToOne
                   @JoinColumn(name="id")
                   val cliente: Cliente)
