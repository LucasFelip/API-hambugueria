create table comida
(
    codigo_comida   int auto_increment
        primary key,
    descrição       varchar(255) null,
    disponibilidade bit          null,
    ingredientes    varchar(255) null,
    nome            varchar(100) null,
    preco           int          null,
    tipo_comida     smallint     null
);

create table pessoa
(
    dtype              varchar(31)  not null,
    codigo_pessoa      int auto_increment
        primary key,
    email              varchar(45)  null,
    endereco           varchar(100) null,
    nome               varchar(100) null,
    senha              varchar(16)  null,
    telefone           varchar(30)  null,
    cpf                varchar(11)  null,
    funcao_funcionario smallint     null
);

create table pedido
(
    codigo_pedido int auto_increment
        primary key,
    num_pedido    int      null,
    status_pedido smallint null,
    tipo_pedido   smallint null,
    codigo_pessoa int      null,
    constraint FK4dhr5kenp44aa71cfnpysob3j
        foreign key (codigo_pessoa) references pessoa (codigo_pessoa),
    constraint FKrw0qiw1udnisls4jhv6612twu
        foreign key (codigo_pedido) references pessoa (codigo_pessoa)
);

create table comida_pedido
(
    codigo_comida int not null,
    codigo_pedido int not null,
    constraint `PRIMARY`
        primary key (codigo_comida, codigo_pedido),
    constraint FK32tl6h99r1ya84p3y2w0djibf
        foreign key (codigo_pedido) references comida (codigo_comida),
    constraint FKae5ms1s5pqdjo45tthdgu5wmj
        foreign key (codigo_comida) references pedido (codigo_pedido)
);