# LojaBrinquedosJava

Este é um projeto de demonstração desenvolvido em Java usando Spring Boot para a criação de uma API RESTful que gerencia uma loja de brinquedos. O projeto inclui operações CRUD (Create, Read, Update, Delete) para gerenciar os brinquedos disponíveis na loja.

## Tecnologias Utilizadas
![image](https://github.com/user-attachments/assets/fece59a3-c156-40fb-a3ad-65455a42d0c3)
- Java 21
- Spring Boot 3.3.3
- Spring Data JPA
- IntelliJ IDEA (IDE utilizada para desenvolvimento)
- Maven (para gerenciamento de dependências)

## Estrutura do Projeto
O projeto está organizado da seguinte forma:
```
LojaBrinquedo/
│
├── src/
│  └── main/
│      ├── java/
│      │     └── com//example/LojaBrinquedo/
│      │               ├── Controller/
│      │               │   └── BrinquedoController.java
│      │               ├── Model/
│      │               │   └── Brinquedo.java
│      │               ├── Repository/
│      │               │   └── BrinquedoRepository.java
│      │               └── Service/
│      │                   └── BrinquedoService.java
│      └── resources/
│          └── application.properties
└── pom.xml
```

- Entidade Brinquedo:
A classe Brinquedo.java define a entidade Brinquedo, que representa os brinquedos disponíveis na loja.

- Controller:
A classe BrinquedoController.java expõe os endpoints da API para realizar as operações CRUD.

- Repository:
A interface BrinquedoRepository.java estende JpaRepository e fornece métodos para manipular a entidade Brinquedo no banco de dados.

- Service:
A classe BrinquedoService.java implementa a lógica de negócios da aplicação, utilizando o BrinquedoRepository para interagir com o banco de dados.

## Endpoints da API CRUD

- GET /brinquedos: Retorna a lista de todos os brinquedos.
- POST /brinquedos: Cria um novo brinquedo.
- PUT /brinquedos/{id}: Atualiza um brinquedo existente.
- DELETE /brinquedos/{id}: Remove um brinquedo existente.

## Exemplos de Requisições
# Criar um Brinquedo
  
Requisição:

```http 
POST /Brinquedo
```

Corpo:

```json 
{
  "nome": "Buzz Ligthyear",
  "tipo": "Boneco",
  "classificação": "Brinquedo Toy Story",
  "tamanho": "medio",
  "preco": 95.0
}
```

Resposta:

```json
{
  "id": 2,
  "nome": "Buzz Ligthyear",
  "tipo": "Boneco",
  "classificação": "Brinquedo Toy Story",
  "tamanho": "medio",
  "preco": 95.0
}

```

# Listar Brinquedos
  
Requisição:

```http
GET /Brinquedo
```

Resposta:

```json
[
  {
    "id": 1,
    "nome": "Woody",
    "tipo": "Boneco",
    "classificação": "Brinquedo Toy Story",
    "tamanho": "medio",
    "preco": 87.0
  }
  {
  "id": 2,
  "nome": "Buzz Ligthyear",
  "tipo": "Boneco",
  "classificação": "Brinquedo Toy Story",
  "tamanho": "medio",
  "preco": 95.0
}
]
```

# Listar Brinquedos por ID
  
Requisição:

```http
GET /Brinquedo/1
```

Resposta:

```json
{
    "id": 1,
    "nome": "Woody",
    "tipo": "Boneco",
    "classificação": "Brinquedo Toy Story",
    "tamanho": "medio",
    "preco": 87.0
  }

```
