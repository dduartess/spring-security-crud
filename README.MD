# 🛡️ Spring Security CRUD API

API REST desenvolvida com **Spring Boot**, implementando operações **CRUD** para **Users** e **Products**, utilizando **Spring Data JPA**, **MySQL em Docker** e boas práticas de desenvolvimento backend.

O projeto tem foco em **aprendizado**, **organização de código**, **versionamento correto** e preparação para autenticação com **Spring Security**.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Versão |
|-----------|--------|
| Java | 25 |
| Spring Boot | 3.x |
| Spring Web | ✔️ |
| Spring Security | ✔️ |
| Spring Data JPA | ✔️ |
| MySQL | Docker Container |
| Docker & Docker Compose | ✔️ |
| Maven | ✔️ |

---

## 📦 Funcionalidades

✔️ CRUD completo de **Users**  
✔️ CRUD completo de **Products**  
✔️ API REST seguindo padrão HTTP  
✔️ Persistência com MySQL  
✔️ Infraestrutura Dockerizada  
✔️ Commits padronizados (Conventional Commits)

---

## 📁 Estrutura do Projeto

```
demo/
├── Docker/
│   └── docker-compose.yml
├── src/
│   └── main/
│       ├── java/com/example/demo
│       │   ├── controllers/
│       │   │   ├── UserController.java
│       │   │   └── ProductController.java
│       │   ├── models.entities/
│       │   │   ├── User.java
│       │   │   └── Product.java
│       │   ├── repositories/
│       │   │   ├── UserRepository.java
│       │   │   └── ProductRepository.java
│       │   └── DemoApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

---

## 🐳 Rodando com Docker (Recomendado)

> **Pré-requisitos:** Docker e Docker Compose instalados

```bash
cd Docker
docker-compose up
```

O Docker irá:
- subir o container do **MySQL**
- disponibilizar o banco para a aplicação
- manter o ambiente isolado e reproduzível

---

## ▶️ Rodando localmente (sem Docker)

1. Configure o banco no `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/demo
spring.datasource.username=root
spring.datasource.password=senha
```

2. Execute a aplicação:

```bash
./mvnw spring-boot:run
```

---

## 📌 Endpoints Disponíveis

### Users

| Método | Endpoint |
|------|---------|
| GET | `/users` |
| GET | `/users/{id}` |
| POST | `/users` |
| PUT | `/users/{id}` |
| DELETE | `/users/{id}` |

---

### Products

| Método | Endpoint |
|------|---------|
| GET | `/products` |
| GET | `/products/{id}` |
| POST | `/products` |
| PUT | `/products/{id}` |
| DELETE | `/products/{id}` |

---

## 📘 Boas Práticas Aplicadas

✔️ Padrão REST  
✔️ Uso correto de `ResponseEntity`  
✔️ Tratamento de `Optional`  
✔️ Organização de commits  
✔️ Separação de responsabilidades  
✔️ Ambiente Dockerizado

---

## 🔐 Próximos Passos

- Autenticação JWT Stateless
- Criptografia de senha
- DTOs
- Validação de dados
- Swagger / OpenAPI
- Testes automatizados

---

## 📄 Licença

MIT License © 2026  
Desenvolvido por **dduartess**
