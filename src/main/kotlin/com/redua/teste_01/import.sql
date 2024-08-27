select * from Pedido p
inner join Item_Pedido ip
inner join Produto po
where p.id = 1421
and ip.pedido_id =1421
and po.produto_id = ip.produto_id