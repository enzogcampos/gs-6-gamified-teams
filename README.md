🚀 GS – Gamified Teams API

API desenvolvida em Java + Spring Boot, criada para representar soluções gamificadas que promovem motivação, engajamento e colaboração entre equipes híbridas.
Este projeto compõe a Global Solution – Microservices and Web Engineering.

👤 Autor
Nome	RM
Enzo Gabriel Campos	552006
🎯 Tema da Global Solution

6 — Soluções gamificadas para motivação em equipes híbridas
Repositório oficial obrigatório: gs-6-gamified-teams

📝 Descrição da API

Esta API expõe dados sobre o tema gamificado da solução, permitindo retornar informações do projeto, do autor e do contexto proposto.
O endpoint principal (/info) fornece a descrição da solução gamificada e identifica o responsável pelo desenvolvimento.

🧰 Tecnologias Utilizadas

Java 17

Spring Boot

Maven

Docker

Swagger (Springdoc OpenAPI)

GitHub Actions (CI • CD • Versionamento Automático)

🖥️ Como executar a aplicação
▶️ Execução local (Maven)
mvn spring-boot:run


A API ficará disponível em:

Endpoint principal:
👉 http://localhost:8081/info

Swagger UI:
👉 http://localhost:8081/swagger-ui.html

🐳 Executando com Docker
🔨 Build da imagem
docker build -t gs-6-gamified-teams .

▶️ Executar o container
docker run -d --name gs6-api -p 8081:8081 gs-6-gamified-teams


Acessar no navegador:

👉 http://localhost:8081/swagger-ui.html

📦 Imagem no Docker Hub

URL da imagem publicada:
👉 https://hub.docker.com/r/enzog14/gs-6-gamified-teams

🔁 Workflows CI/CD – GitHub Actions

A solução implementa três workflows automatizados:

🛠️ 1. CI – Continuous Integration

Disparado em push nas branches:

feature/**

release

hotfix

Executa:

✔️ Build da aplicação
✔️ Testes unitários
✔️ Build da imagem Docker (sem publicar)

🚀 2. CD – Continuous Delivery

Disparado em Pull Request direcionado para a branch develop.

Executa:

✔️ Build da imagem Docker
✔️ Login no Docker Hub
✔️ Publicação da imagem atualizada

🏷️ 3. Versionamento Automático (Tag + Release)

Disparado em push para a branch main.

Executa:

✔️ Geração automática de tag (vX.Y.Z)
✔️ Criação de Release no GitHub

📄 Prints das Execuções – CI, CD e Versioning
🔹 CI – Workflow
<img width="1360" height="580" alt="image" src="https://github.com/user-attachments/assets/fedd4354-d1d0-4119-8d11-805b8da9b164" />
🔹 CD – Workflow
<img width="1363" height="563" alt="image" src="https://github.com/user-attachments/assets/b26200f9-8f89-40d6-9754-0f46d243d8c4" />
🔹 Publicação no Docker Hub
<img width="1365" height="638" alt="image docker hub" src="https://github.com/user-attachments/assets/8bc738a5-c27e-44c2-a55f-a4c04de22d5a" />
🔗 Endpoint Principal
GET /info

Retorna detalhes sobre o tema e informações do desenvolvedor.

📌 Exemplo de resposta
{
  "tema": "Soluções gamificadas para motivação em equipes híbridas",
  "membro1": "Enzo Gabriel Campos - RM 552006",
  "descricao": "API criada para representar iniciativas de gamificação aplicadas ao ambiente corporativo híbrido, fomentando motivação, colaboração e desempenho das equipes."
}
