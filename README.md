# Service Tasks 📋

## Descrição
Microserviço responsável pelo gerenciamento de tarefas (To-Do).

## Funcionalidades
- CRUD de tarefas
- Integração com config-server e Eureka

## Tecnologias
- Java 17+
- Spring Boot
- Spring Data JPA
- H2 ou PostgreSQL
- Maven

## Como rodar
```bash
git clone https://github.com/Mateus-R-De-Lima/service.tasks.git
cd service.tasks
./mvnw spring-boot:run
```

## Endpoints principais
- `GET /tasks` – lista todas tarefas
- `POST /tasks` – cria nova tarefa
- `PUT /tasks/{id}` – atualiza uma tarefa
- `DELETE /tasks/{id}` – remove uma tarefa
---

## ℹ️ Observações
Este projeto faz parte de um conjunto de estudos sobre arquitetura de microserviços com Java e Spring Boot. O objetivo principal é praticar conceitos como:
- Separação de responsabilidades entre serviços
- Comunicação entre microserviços
- Centralização de configuração
- Escalabilidade e resiliência

Embora funcionais, esses projetos não possuem foco em produção, e podem conter implementações simplificadas com fins exclusivamente didáticos.

## 👨‍💻 Autor
Desenvolvido por [Mateus Lima](https://github.com/Mateus-R-De-Lima)

## 🔗 Projetos Relacionados

Este projeto faz parte de um ecossistema de microserviços criado para estudo. Os repositórios relacionados são:

- [service.main](https://github.com/Mateus-R-De-Lima/service.main) – Serviço principal/orquestrador
- [service.one](https://github.com/Mateus-R-De-Lima/service.one) – Serviço base simples
- [config-server](https://github.com/Mateus-R-De-Lima/config-server) – Servidor de configuração central
- [service.tasks](https://github.com/Mateus-R-De-Lima/service.tasks) – Serviço de gerenciamento de tarefas
- [service.notification](https://github.com/Mateus-R-De-Lima/service.notification) – Serviço de envio de notificações
