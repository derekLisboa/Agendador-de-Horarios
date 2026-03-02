📅 Agendador de Horários

API REST desenvolvida com Java e Spring Boot para gerenciamento de agendamentos de horários.

O sistema permite cadastrar, listar, atualizar e remover agendamentos, seguindo boas práticas de organização em camadas e integração com banco de dados relacional.
------------------------------------------------------------------------------------------------------------------------------------------------------------------------


🚀 Tecnologias Utilizadas

Java

Spring Boot

Spring Web

Spring Data JPA

Hibernate

Banco de Dados Relacional

Maven

---

🏗️ Arquitetura

O projeto está organizado no padrão de arquitetura em camadas:

Controller → Responsável pelos endpoints REST

Service → Regras de negócio

Repository → Comunicação com o banco via JPA

Entity → Representação das tabelas no banco

Essa organização facilita manutenção, evolução e entendimento do sistema.

---

📌 Funcionalidades

Criar agendamento

Listar agendamentos

Buscar agendamento por ID

Atualizar agendamento

Cancelar/remover agendamento

---

📮 Endpoints

POST /appointments → Criar agendamento

GET /appointments → Listar agendamentos

GET /appointments/{id} → Buscar por ID

PUT /appointments/{id} → Atualizar agendamento

DELETE /appointments/{id} → Remover agendamento

---

▶️ Como Executar

Clone o repositório:

git clone https://github.com/derekLisboa/Agendador-de-Horarios.git

Acesse a pasta do projeto:

cd agendador-horarios

Execute a aplicação:

./mvnw spring-boot:run

A API estará disponível em:

http://localhost:8080

---

🎯 Objetivo do Projeto

Projeto desenvolvido para praticar desenvolvimento de APIs REST com Spring Boot, organização em camadas e integração com banco de dados.

---
