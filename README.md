GS – Gamified Teams API

API desenvolvida em Java + Spring Boot, criada para representar soluções gamificadas que promovem motivação, engajamento e colaboração em equipes híbridas.
Este projeto faz parte da Global Solution – Microservices and Web Engineering.

👤 Autor

Enzo Gabriel Campos
RM 552006

📘 Tema Oficial

6 — Soluções gamificadas para motivação em equipes híbridas
Repositório oficial obrigatório: gs-6-gamified-teams

🔧 Tecnologias utilizadas

Java 17

Spring Boot

Springdoc OpenAPI (Swagger)

Docker

GitHub Actions (CI/CD)

🚀 Como executar a aplicação
🖥️ Execução local (Maven)
mvn spring-boot:run


Endpoint disponível em:
👉 http://localhost:8081/info

Swagger UI em:
👉 http://localhost:8081/swagger-ui.html

🐳 Executando com Docker

📌 Build da imagem

docker build -t gs-6-gamified-teams .


📌 Executar o container

docker run -d --name gs6-api -p 8081:8081 gs-6-gamified-teams


Acessar no navegador:
👉 http://localhost:8081/swagger-ui.html

📦 Imagem no Docker Hub

(Adicione sua URL após publicar)
https://hub.docker.com/r/enzog14/gs-6-gamified-teams

🔁 Workflows CI/CD – GitHub Actions
🛠️ 1. CI – Continuous Integration

Disparado automaticamente em push nas branches:

feature/**

release

hotfix

Executa:
✔️ Build da aplicação
✔️ Testes unitários
✔️ Verificação do build Docker

🚚 2. CD – Continuous Delivery

Disparado em pull requests direcionados à branch develop.

Executa:
✔️ Build da imagem Docker
✔️ Autenticação no Docker Hub
✔️ Publicação da imagem atualizada

🏷️ 3. Versionamento Automático

Disparado em push para a branch main.

Gera automaticamente:

Tag de versão (vX.Y.Z)

Release no GitHub

📄 Observações importantes

Toda a execução dos workflows pode ser acompanhada na aba Actions do GitHub.

O nome do repositório deve seguir exatamente o padrão solicitado:
gs-6-gamified-teams

Prints das execuções CI, CD e Versioning devem ser anexados na entrega.



🔗 Endpoint principal
GET /info

<img width="1360" height="580" alt="image" src="https://github.com/user-attachments/assets/fedd4354-d1d0-4119-8d11-805b8da9b164" />

<img width="1363" height="563" alt="image" src="https://github.com/user-attachments/assets/b26200f9-8f89-40d6-9754-0f46d243d8c4" />



<img width="1365" height="638" alt="image docker hub" src="https://github.com/user-attachments/assets/8bc738a5-c27e-44c2-a55f-a4c04de22d5a" />


Retorna detalhes do tema e informações do membro responsável.

📌 Exemplo de resposta:
{
"tema": "Soluções gamificadas para motivação em equipes híbridas",
"membro1": "Enzo Gabriel Campos - RM 552006",
"descricao": "API criada para representar iniciativas de gamificação aplicadas ao ambiente corporativo híbrido, fomentando motivação, colaboração e desempenho das equipes."
}
