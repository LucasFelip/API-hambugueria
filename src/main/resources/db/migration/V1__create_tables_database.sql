CREATE TABLE cliente
(
    codigo_pessoa INT AUTO_INCREMENT NOT NULL,
    nome          VARCHAR(100) NULL,
    email         VARCHAR(45) NULL,
    senha         VARCHAR(16) NULL,
    telefone      VARCHAR(30) NULL,
    endereco      VARCHAR(100) NULL,
    cpf           VARCHAR(11) NULL,
    CONSTRAINT pk_cliente PRIMARY KEY (codigo_pessoa)
);

CREATE TABLE pedido
(
    codigo_pedido INT AUTO_INCREMENT NOT NULL,
    num_pedido    INT NULL,
    tipo_pedido   INT NULL,
    status_pedido INT NULL,
    codigo_pessoa INT NULL,
    CONSTRAINT pk_pedido PRIMARY KEY (codigo_pedido)
);

CREATE TABLE comida
(
    codigo_comida   INT AUTO_INCREMENT NOT NULL,
    nome            VARCHAR(100) NULL,
    disponibilidade BIT(1) NULL,
    descricao     VARCHAR(255) NULL,
    preco           INT NULL,
    ingredientes    VARCHAR(255) NULL,
    tipo_comida     INT NULL,
    CONSTRAINT pk_comida PRIMARY KEY (codigo_comida)
);

CREATE TABLE comida_pedido
(
    codigo_comida INT NOT NULL,
    codigo_pedido INT NOT NULL,
    CONSTRAINT pk_comida_pedido PRIMARY KEY (codigo_comida, codigo_pedido)
);

CREATE TABLE funcionario
(
    codigo_pessoa      INT AUTO_INCREMENT NOT NULL,
    nome               VARCHAR(100) NULL,
    email              VARCHAR(45) NULL,
    senha              VARCHAR(16) NULL,
    telefone           VARCHAR(30) NULL,
    endereco           VARCHAR(100) NULL,
    cpf                VARCHAR(11) NULL,
    funcao_funcionario INT NULL,
    CONSTRAINT pk_funcionario PRIMARY KEY (codigo_pessoa)
);

ALTER TABLE pedido
    ADD CONSTRAINT FK_PEDIDO_ON_CODIGO_PESSOA FOREIGN KEY (codigo_pessoa) REFERENCES cliente (codigo_pessoa);

ALTER TABLE comida_pedido
    ADD CONSTRAINT fk_comped_on_comida FOREIGN KEY (codigo_pedido) REFERENCES comida (codigo_comida);

ALTER TABLE comida_pedido
    ADD CONSTRAINT fk_comped_on_pedido FOREIGN KEY (codigo_comida) REFERENCES pedido (codigo_pedido);

ALTER TABLE pedido
    ADD CONSTRAINT FK_PEDIDO_ON_CODIGO_PEDIDO FOREIGN KEY (codigo_pedido) REFERENCES cliente (codigo_pessoa);