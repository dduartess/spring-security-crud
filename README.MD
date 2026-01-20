# 🛡️ Spring Security CRUD API com JWT

API REST desenvolvida com **Spring Boot**, implementando **autenticação Stateless via JWT** e **CRUD de Products**, utilizando **Spring Security**, **Spring Data JPA**, **MySQL em Docker** e boas práticas de desenvolvimento backend.

O projeto tem foco em **aprendizado sólido**, **organização de código**, **arquitetura limpa**, **segurança** e preparação para aplicações reais em produção.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Versão |
|-----------|--------|
| Java | 25 |
| Spring Boot | 3.x |
| Spring Web | ✔️ |
| Spring Security | ✔️ |
| Spring Data JPA | ✔️ |
| JWT (Stateless) | ✔️ |
| MySQL | Docker Container |
| Docker & Docker Compose | ✔️ |
| Maven | ✔️ |

---

## 🔐 Segurança & Autenticação

- Autenticação **Stateless** com **JWT**
- Registro de usuários (`/auth/register`)
- Login com geração de token (`/auth/login`)
- Token enviado via header `Authorization: Bearer <token>`
- Filtro de autenticação com `OncePerRequestFilter`
- Sessão desabilitada (`SessionCreationPolicy.STATELESS`)
- Senhas criptografadas com **BCrypt**
- Usuários não possuem CRUD exposto (boa prática de segurança)

---

## 📦 Funcionalidades

✔️ Registro de usuários  
✔️ Login com geração de **JWT**  
✔️ Autenticação Stateless  
✔️ Proteção de rotas com Spring Security  
✔️ CRUD completo de **Products**  
✔️ API REST seguindo padrão HTTP  
✔️ Persistência com MySQL  
✔️ Infraestrutura Dockerizada  
✔️ Commits padronizados (Conventional Commits)

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com.example.demo
            ├── controllers/
            │   ├── AuthenticationController.java
            │   └── ProductController.java
            │
            ├── infra/security/
            │   ├── SecurityConfigurations.java
            │   ├── SecurityFilter.java
            │   └── TokenService.java
            │
            ├── models/entities/
            │   ├── products/
            │   │   └── Product.java
            │   │
            │   └── users/
            │       ├── AuthenticationDTO.java
            │       ├── LoginResponseDTO.java
            │       ├── RegisterDTO.java
            │       ├── User.java
            │       └── UserRole.java
            │
            ├── repositories/
            │   ├── ProductRepository.java
            │   └── UserRepository.java
            │
            ├── services/
            │   └── AuthorizationService.java
            │
            └── DemoApplication.java
```

---

## 🐳 Rodando com Docker (Recomendado)

```bash
cd Docker
docker compose up
```

---

## ▶️ Rodando localmente

```bash
./mvnw spring-boot:run
```

---

## 🔑 Autenticação

### Registro
POST `/auth/register`

### Login
POST `/auth/login`

---

## 📄 Licença

MIT License © 2026  
Desenvolvido por **dduartess**
