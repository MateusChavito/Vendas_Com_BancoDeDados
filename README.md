# 🛠️ Vendas com Banco de Dados

Este repositório contém um sistema de gerenciamento de vendas com banco de dados usando Java e JDBC, integrado com PostgreSQL. A aplicação realiza operações CRUD em um banco de dados de clientes.

## 📦 Estrutura de Pacotes

- **`JDBC`**: Conexão com o banco de dados utilizando `ConnectionFactory`.
- **`dao.JBDC`**: Interface e implementação DAO para operações com a entidade Cliente.
- **`domain`**: Representação da entidade Cliente.
- **`tests`**: Testes unitários das operações DAO e serviços de clientes.

## 🚀 Funcionalidades

- **Cadastrar Cliente**: Adiciona um novo cliente ao banco de dados.
- **Atualizar Cliente**: Atualiza informações de um cliente existente.
- **Buscar Cliente**: Recupera um cliente específico pelo código.
- **Excluir Cliente**: Remove um cliente da base de dados.
- **Buscar Todos os Clientes**: Lista todos os clientes cadastrados.

## 🛠️ Tecnologias

- **Java 17**
- **PostgreSQL**
- **JUnit** para testes

## ⚙️ Configuração
- Certifique-se de que o PostgreSQL esteja instalado e rodando na sua máquina.
- Atualize a string de conexão no arquivo ConnectionFactory.java com suas credenciais do banco de dados.
- Execute os testes para validar as funcionalidades.
