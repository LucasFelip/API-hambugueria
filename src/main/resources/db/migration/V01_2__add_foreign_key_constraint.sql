/*
ALTER TABLE pedido
    ADD CONSTRAINT FK_PEDIDO_ON_CODIGO_PEDIDO FOREIGN KEY (codigo_pedido) REFERENCES usuario (codigo_usuario);

ALTER TABLE pedido
    ADD CONSTRAINT FK_PEDIDO_ON_CODIGO_USUARIO FOREIGN KEY (codigo_usuario) REFERENCES usuario (codigo_usuario);

ALTER TABLE comida_pedido
    ADD CONSTRAINT fk_burped_on_hambuguer FOREIGN KEY (codigo_pedido) REFERENCES comida (codigo_comida);

ALTER TABLE comida_pedido
    ADD CONSTRAINT fk_burped_on_pedido FOREIGN KEY (codigo_comida) REFERENCES pedido (codigo_pedido);
*/