# Padrões de Projeto com Spring Boot e Java 25

Este é um projeto prático desenvolvido para explorar a aplicação de padrões de projeto (Design Patterns) consagrados no ecossistema **Spring Boot**. A aplicação consiste em um ecossistema simples de gerenciamento de clientes, integrando uma API externa para enriquecimento de dados de endereço.

## 🚀 Tecnologias Utilizadas

* **Java 25** (Utilizando recursos modernos da linguagem)
* **Spring Boot 4.1.2**
* **Spring Data JPA** (Persistência de dados)
* **Spring Cloud OpenFeign** (Cliente HTTP declarativo)
* **Springdoc OpenAPI 2.6.0** (Documentação interativa com Swagger UI)
* **Banco de Dados H2** (Banco em memória para testes rápidos)

## 🧩 Padrões de Projeto Implementados

O projeto foi evoluído além do escopo inicial da aula, demonstrando a aplicação prática de quatro padrões de projeto arquiteturais e de código:

1. **Singleton:** O próprio Spring Boot gerencia as instâncias das classes anotadas com `@Service`, `@RestController` e `@Repository` como Singletons nativos dentro do container do Spring (Injeção de Dependências).
2. **Strategy:** Utilizado para definir algoritmos de manipulação de dados de clientes através da interface `ClienteService`, permitindo que diferentes implementações possam ser injetadas de forma desacoplada.
3. **Facade:** A classe `ClienteRestController` atua como uma Facade (Fachada), abstraindo a complexidade das integrações com o Banco de Dados (H2) e a API externa de CEP, oferecendo ao usuário uma interface de consumo REST limpa e simples.
4. **Factory (Evolução do Projeto):** Implementado para centralizar e isolar a lógica de criação dos provedores de consulta de CEP. Essa abordagem desacopla a camada de serviço da implementação direta do cliente HTTP, tornando o sistema altamente extensível e permitindo trocar ou adicionar novos provedores (como APILayer, Postman ou Correios) no futuro sem impactar as regras de negócio vigentes.

## 🔌 Integração com API Externa

A aplicação consome a API pública do **ViaCEP** utilizando o **OpenFeign**. Ao cadastrar ou atualizar um cliente informando apenas o CEP, a fábrica de provedores resolve a integração correspondente, e o sistema busca os dados de endereço faltantes de forma automatizada e transparente antes de salvar o registro.

---

## 🛠️ Como Executar o Projeto

### Pré-requisitos
* **JDK 25** instalado no seu sistema.
* **Maven** configurado (ou integrado à sua IDE de preferência).

### Passos para execução
1. Clone o repositório para a sua máquina local:
   ```bash
   git clone https://github.com
   ```
2. Abra o projeto na sua IDE (IntelliJ IDEA, Eclipse ou VS Code).
3. Aguarde o Maven baixar todas as dependências declaradas no arquivo `pom.xml`.
4. Execute a classe principal do projeto (`LabDesignPatternsApplication`).

---

## 📖 Documentação da API (Swagger UI)

A API possui documentação totalmente interativa gerada pelo Swagger. Com a aplicação rodando localmente, você pode acessar e testar todos os endpoints (POST, GET, PUT, DELETE) utilizando o endereço abaixo no seu navegador:

🔗 **[http://127.0.0](http://127.0.0)**

### Exemplo de JSON para Envio (POST /clientes)
Para testar a criação de um cliente e o funcionamento da integração do CEP, utilize o modelo abaixo:
```json
{
  "nome": "Venilton",
  "endereco": {
    "cep": "79826150"
  }
}
```

## 🗄️ Console do Banco de Dados H2

Para visualizar as tabelas do banco de dados em tempo real na memória do servidor, acesse o painel do H2:

🔗 **[http://127.0.0](http://127.0.0)**
* **JDBC URL:** `jdbc:h2:mem:testdb`
* **User Name:** `sa`
* **Password:** *(deixe em branco)*

---
Análise, refatoração e desenvolvimento estruturado por [Seu Nome]. Sinta-se livre para clonar e expandir!
