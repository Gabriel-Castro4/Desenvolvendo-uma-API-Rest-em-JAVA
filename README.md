---

# API Rest em Java com Spring Boot

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-orange.svg)](https://www.mysql.com/)
[![Postman](https://img.shields.io/badge/Postman-Testado-orange.svg)](https://www.postman.com/)

## Sobre o Projeto

Este repositório documenta meu aprendizado no curso **"Spring Boot 3: desenvolva uma API Rest em Java"** da Alura. O projeto consiste no desenvolvimento completo de uma API RESTful para gerenciamento de cadastro de médicos, utilizando as melhores práticas do ecossistema Spring.

O foco principal é construir uma aplicação robusta e bem estruturada, aplicando conceitos fundamentais como injeção de dependências, camadas de controle, serviço e persistência, além de expor endpoints RESTful devidamente testados com o **Postman**.

## Tecnologias Utilizadas

- **Java 17** - Linguagem de programação
- **Spring Boot 3** - Framework principal para desenvolvimento da API
- **Spring Web** - Módulo para criação de endpoints REST
- **Spring Data JPA** - Camada de persistência e acesso a dados
- **MySQL 8.0** - Banco de dados relacional
- **Maven** - Gerenciamento de dependências e build do projeto
- **Lombok** - Biblioteca para redução de código boilerplate
- **Postman** - Ferramenta para teste e validação de endpoints

## Estrutura do Projeto

O projeto segue uma arquitetura em camadas bem definida:

- **Camada de Controle (Controller)** - Responsável por receber as requisições HTTP e direcioná-las para a camada de serviço.
- **Camada de Domínio (Domain)** - Contém as entidades e regras de negócio, organizadas em pacotes como `medico` e `endereco`.
- **Camada de Repositório (Repository)** - Interfaces que estendem o JPA Repository para operações com o banco de dados.
- **Camada de Serviço (Service)** - Onde ficam as regras de negócio e a lógica de aplicação.
- **Recursos (Resources)** - Arquivos de configuração da aplicação, como o `application.properties`.

## Configuração e Execução

### Pré-requisitos

Para executar o projeto, você precisará ter instalado em sua máquina:
- JDK 17 ou superior
- Maven 3.6 ou superior
- MySQL 8.0
- Postman (para realizar os testes)

### Passo a Passo

1. **Clone o repositório** para sua máquina local.
2. **Configure o banco de dados MySQL:** crie um schema para a aplicação e ajuste as credenciais de acesso no arquivo de configuração.
3. **Compile o projeto** utilizando o Maven para baixar as dependências e gerar o pacote da aplicação.
4. **Execute a aplicação** através do Maven ou da sua IDE preferida.
5. A aplicação estará disponível para acesso no endereço local, na porta padrão configurada.

## Testando a API com Postman

O Postman é a ferramenta utilizada para testar e validar os endpoints da API. Durante o desenvolvimento, foram configuradas requisições para todos os endpoints implementados.

### Configuração Inicial no Postman

- **Collection:** organize todas as requisições em uma coleção chamada "API Médicos" para facilitar o gerenciamento.
- **Variáveis de Ambiente:** configure uma variável para a URL base da API, permitindo alternar facilmente entre ambientes (desenvolvimento, homologação, produção).
- **Headers Padrão:** defina o header `Content-Type: application/json` para todas as requisições que enviam dados no corpo.

### Endpoints Implementados e Testados

**1. Teste de Conexão (Hello World)**
Este endpoint é um teste básico para verificar se a API está ativa e respondendo. Uma requisição do tipo GET retorna uma mensagem de saudação.

**2. Cadastrar Médico**
Endpoint do tipo POST que permite cadastrar um novo médico no sistema. O corpo da requisição deve conter todos os dados do médico, como nome, email, telefone, CRM, especialidade e endereço. Uma resposta com status 201 é retornada em caso de sucesso.

**3. Listar Médicos**
Endpoint do tipo GET que retorna uma lista com todos os médicos cadastrados. A resposta contém os principais dados de cada médico.

**4. Atualizar Médico**
Endpoint do tipo PUT que permite atualizar os dados de um médico existente. É necessário enviar o identificador do médico e os campos que serão atualizados no corpo da requisição.

**5. Excluir Médico (Exclusão Lógica)**
Endpoint do tipo DELETE que realiza uma exclusão lógica, ou seja, o médico é apenas inativado no sistema, mas seus dados permanecem no banco de dados para fins históricos. A resposta é um status 204 sem conteúdo.

### Dicas para Testar no Postman

- **Organização:** mantenha suas requisições organizadas em pastas dentro da collection, separando por recurso.
- **Documentação:** utilize o recurso de salvar respostas para documentar exemplos de retorno da API.
- **Testes Automatizados:** crie scripts simples no Postman para validar automaticamente os status codes e a estrutura das respostas, agilizando a verificação de cada endpoint.

## Funcionalidades Implementadas

- Estrutura inicial do projeto com Spring Boot
- Criação de pacotes e organização de código por domínio
- Definição de entidades utilizando Records e Enums
- Endpoint para teste de conexão
- Endpoint para cadastro de médicos
- Endpoint para listagem de médicos
- Endpoint para atualização de dados de médicos
- Endpoint para exclusão lógica de médicos
- Configuração de segurança com o arquivo `.gitignore` para proteger dados sensíveis
- Testes completos de todos os endpoints utilizando o Postman

## Lições Aprendidas

Durante o desenvolvimento deste projeto, foram aplicados e consolidados diversos conceitos fundamentais para o desenvolvimento de APIs com Spring Boot, incluindo:

- **Injeção de Dependências:** compreensão de como o Spring gerencia os objetos e suas dependências.
- **Arquitetura em Camadas:** separação clara das responsabilidades entre controle, serviço e persistência.
- **Uso de Records e Enums:** aplicação de recursos modernos do Java para representar dados imutáveis e constantes.
- **Exclusão Lógica:** estratégia para manter o histórico de dados sem removê-los fisicamente do banco.
- **Boas Práticas de Commits:** escrita de mensagens claras e semânticas para cada alteração no código.
- **Testes de API:** utilização do Postman como ferramenta essencial para validação e documentação dos endpoints.
- **Segurança em Versionamento:** proteção de informações sensíveis, como credenciais de banco de dados, através do arquivo `.gitignore`.

## Referências

- Documentação oficial do Spring Boot
- Curso da Alura - Spring Boot 3: desenvolva uma API Rest em Java
- Melhores práticas para design de APIs RESTful
- Documentação oficial do Postman

## Autor

**Gabriel Castro**
- GitHub: Gabriel-Castro4

---
