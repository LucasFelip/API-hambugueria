INSERT INTO cliente (nome, email, senha, telefone, endereco, cpf)
VALUES ('João Silva', 'joao.silva@gmail.com', '123456', '(11) 1234-5678', 'Rua A, 123', '12345678900'),
       ('Maria Santos', 'maria.santos@gmail.com', 'abcdef', '(11) 9876-5432', 'Rua B, 456', '98765432100');

# INSERT INTO pedido (num_pedido, tipo_pedido, status_pedido, codigo_pessoa)
# VALUES (1, 1, 1, 1),
#        (2, 2, 2, 2),
#        (3, 1, 2, 1);

INSERT INTO comida (nome, disponibilidade, descricao, preco, ingredientes, tipo_comida)
VALUES ('Pizza Margherita', 1, 'Pizza com mussarela, tomate e manjericão', 30, 'Farinha de trigo, água, fermento, mussarela, tomate, manjericão', 1),
       ('Hambúrguer com batata frita', 0, 'Pão, carne bovina, alface, tomate, queijo, batata frita', 20, 'Pão, carne bovina, alface, tomate, queijo, batata, óleo', 2),
       ('Sushi', 1, 'Salmão, arroz, nori, pepino, cream cheese', 50, 'Salmão, arroz, nori, pepino, cream cheese', 3);

# INSERT INTO comida_pedido (codigo_comida, codigo_pedido)
# VALUES (1, 1),
#        (2, 1),
#        (3, 2);

INSERT INTO funcionario (nome, email, senha, telefone, endereco, cpf, funcao_funcionario)
VALUES ('Carlos Souza', 'carlos.souza@gmail.com', 'qwerty', '(11) 4321-8765', 'Rua C, 789', '45678912300', 1),
       ('Ana Paula Ferreira', 'ana.paula@gmail.com', 'zxcvbn', '(11) 8765-4321', 'Rua D, 321', '98765432100', 2);