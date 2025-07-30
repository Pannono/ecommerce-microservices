# 🛒 Ecommerce Microservices Application – Portfolio Project by Giuseppe Pannone

<img src="./foto_primo_piano_giuseppe_square.png" alt="Giuseppe Pannone" width="72" height="72"/>

## <p><img src="https://twemoji.maxcdn.com/v/latest/svg/1f1ec-1f1e7.svg" width="20" style="vertical-align:middle;"/> <strong>English</strong></p>


## 👋 About me

Hi! I'm Giuseppe Pannone, an Italian full stack web developer and passionate philosophy student.This repository is part of my portfolio and represents my effort to build a real-world project using a modern backend architecture.

I want to showcase both my technical skills and my curiosity to learn by doing — always improving, step by step.

### 📦 Project Overview

This project is a modular Ecommerce Web Application built using a microservices architecture.Each business domain is managed by a dedicated Spring Boot service, and the project is fully containerized with Docker.


## 🧱 Architecture & Technologies

### ✅ Tech Stack

💻 Backend: Java 21, Spring Boot, Spring Web, Spring Data JPA, Lombok

🛢 Database: PostgreSQL

📦 Containers: Docker, Docker Compose

🔐 Planned: Keycloak (for authentication), Spring Security

🌐 Planned: Angular frontend

🧪 Planned: Unit/Integration testing with JUnit/Testcontainers

🧩 Microservices Structure

Service

Description

Status

service-product

Manages product catalog (CRUD)

✅ Ready

service-user

Handles user registration/login/auth

🔜 Planned

service-order

Manages customer orders

🔜 Planned

Each service is:

Built independently with its own dependencies and configuration

Connected to a dedicated schema or database

Dockerized and orchestrated via docker-compose


## 🚀 Getting Started

### 1. Clone the project
```bash
git clone https://github.com/Pannono/ecommerce-microservices
cd ecommerce-microservices
```

### 🛠 Current Features (service-product)

- Product creation, retrieval, update and deletion

- RESTful API with endpoints like:

  - GET /api/products

  - POST /api/products

  - GET /api/products/{id}

- PostgreSQL database with persistence through Docker volumes


### 📍 Roadmap
Initialize project structure

- [x] Build and dockerize product microservice

- [x] Add user microservice with authentication

- [ ] Add order microservice with relational logic

- [ ] Integrate Keycloak for secure access

- [ ] Build frontend (Angular)

- [ ] Deploy to a cloud platform (optional)


### 📫 Contact
📎 [LinkedIn – Giuseppe Pannone](https://www.linkedin.com/in/giuseppe-pannone-abb805194/)
📧 Email: giusepp.pann96@gmail.com


#  !<p><img src="https://twemoji.maxcdn.com/v/latest/svg/1f1ec-1f1e7.svg" width="20" style="vertical-align:middle;"/> <strong>English</strong></p>



# 🛒 Applicazione Ecommerce a Microservizi – Progetto Portfolio di Giuseppe Pannone

<img src="./foto_primo_piano_giuseppe_square.png" alt="Giuseppe Pannone" width="72" height="72"/>


## 👋 Chi sono

Ciao! Mi chiamo **Giuseppe Pannone**, sono uno sviluppatore web full stack italiano e uno studente di filosofia appassionato.  
Questo repository fa parte del mio portfolio e rappresenta il mio impegno nella realizzazione di un progetto reale basato su un’architettura backend moderna.

Attraverso questo progetto voglio mettere in evidenza le mie competenze tecniche e la mia curiosità nel continuare a imparare facendo, migliorando costantemente passo dopo passo.

---

## 📦 Panoramica del Progetto

Questa è un'applicazione web **ecommerce modulare** costruita secondo un'architettura a **microservizi**.  
Ogni dominio applicativo è gestito da un microservizio dedicato realizzato con Spring Boot. Il progetto è completamente **containerizzato con Docker**.

---

## 🧱 Architettura e Tecnologie

### ✅ Stack Tecnologico

- 💻 **Backend:** Java 21, Spring Boot, Spring Web, Spring Data JPA, Lombok
- 🛢 **Database:** PostgreSQL
- 📦 **Containerizzazione:** Docker, Docker Compose
- 🔐 **In programma:** Keycloak (per l'autenticazione), Spring Security
- 🌐 **In programma:** Frontend con Angular
- 🧪 **In programma:** Test unitari e di integrazione con JUnit/Testcontainers

---

## 🧩 Struttura dei Microservizi

| Servizio           | Descrizione                              | Stato       |
|--------------------|-------------------------------------------|-------------|
| `service-product`  | Gestione del catalogo prodotti (CRUD)     | ✅ Completato |
| `service-user`     | Gestione utenti, login, autenticazione    | 🔜 In programma |
| `service-order`    | Gestione degli ordini dei clienti         | 🔜 In programma |

Ogni microservizio è:
- Creato in modo indipendente con le proprie dipendenze e configurazioni
- Collegato a un proprio schema o database
- Dockerizzato e orchestrato tramite `docker-compose`

---

## 🚀 Come iniziare

### 1. Clona il progetto
```bash
git clone https://github.com/Pannono/ecommerce-microservices
cd ecommerce-microservices
```

### 🛠 Funzionalità Attuali (service-product)
- Creazione, lettura, modifica e cancellazione di prodotti

- API RESTful con endpoint come:

  - GET /api/products

  - POST /api/products

  - GET /api/products/{id}

- Persistenza dei dati in PostgreSQL tramite volumi Docker

### 🗺 Roadmap

- [x] Inizializzazione della struttura del progetto

- [x] Costruzione e containerizzazione del microservizio prodotti

- [ ] Aggiunta del microservizio utenti con autenticazione

- [ ] Aggiunta del microservizio ordini con logica relazionale

- [ ] Integrazione di Keycloak per l'autenticazione e la sicurezza

- [ ] Sviluppo del frontend con Angular

- [ ] Deploy su una piattaforma cloud (facoltativo)

## 📫 Contatti
📎 [LinkedIn – Giuseppe Pannone](https://www.linkedin.com/in/giuseppe-pannone-abb805194/)
📧 Email: giusepp.pann96@gmail.com



