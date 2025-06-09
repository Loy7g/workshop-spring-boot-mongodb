
# 🚀 Workshop MongoDB com Spring Boot

Este projeto é uma API RESTful desenvolvida com **Java**, **Spring Boot** e **MongoDB**, com foco em operações CRUD de usuários, postagens e comentários. Ideal para aprender como integrar Spring Data MongoDB em uma aplicação real.

---

## 🛠️ Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data MongoDB
- Maven
- MongoDB
- IntelliJ IDEA

---

## 📁 Estrutura do Projeto

```text
src/
└── main/
    └── java/
        └── com/
            └── loy/
                ├── config/           # Configuração e classe de instanciador de dados (seeder)
                ├── domain/           # Entidades principais: User, Post
                ├── dto/              # Data Transfer Objects: UserDTO, AuthorDTO, CommentDTO
                ├── repository/       # Repositórios MongoDB
                ├── resources/        # Controladores REST
                │   └── exception/    # Tratamento de exceções
                ├── services/         # Camada de serviço com regras de negócio
                └── util/             # Utilitários
```

---

## ▶️ Como executar o projeto

### Pré-requisitos

- Java 17 ou superior
- MongoDB rodando localmente ou via Docker
- Maven instalado

### Passo a passo

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/workshopmongodb.git
cd workshopmongodb

# Suba o MongoDB via Docker (caso não tenha instalado localmente)
docker run -d -p 27017:27017 --name mongo mongo

# Compile e execute o projeto
./mvnw spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

---

## 📦 Dados de exemplo (seed)

Na inicialização, a classe `Instantiation.java` popula o banco com dados fictícios, incluindo:

- **Usuários**: Maria Brown, Alex Green, Bob Grey
- **Postagens**: Com título, corpo, autor e data
- **Comentários**: Relacionados aos posts, com autor e data

---

## 📌 Principais Endpoints

### 🔹 Usuários

- `GET /users` - Lista todos os usuários
- `GET /users/{id}` - Retorna um usuário específico
- `POST /users` - Cria um novo usuário
- `PUT /users/{id}` - Atualiza um usuário
- `DELETE /users/{id}` - Remove um usuário
- `GET /users/{id}/posts` - Lista posts de um usuário

### 🔹 Postagens

- `GET /posts` - Lista todas as postagens
- `GET /posts/{id}` - Detalha uma postagem
- `GET /posts/titlesearch?text=xyz` - Busca por título
- `GET /posts/fullsearch?text=xyz&minDate=yyyy-MM-dd&maxDate=yyyy-MM-dd` - Busca completa por texto e data

---

## 🧪 Testando com Postman ou REST Client

Você pode usar o [Postman](https://www.postman.com/) ou um arquivo `.http` para testar os endpoints. Exemplo de chamada:

```http
GET http://localhost:8080/users
```

---
