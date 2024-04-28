# api-reqres-pojo
Cobertura de serviços da API Reqres utilizando testes automatizados em RestAssured

## Projeto de automação de testes funcionais de serviços Rest API.

### Ferramentas utilizadas:
* Java JDK 11
* Git
* IDE Intellij
* maven-surefire-plugin

### Dependências:
* RestAssured
* Junit-jupiter-api
* Json-schema-validator

### Estrutura do projeto:

**./src/test/steps/.java**: são todas as classes com scripts que executam os testes planejados para os serviços.

**./src/test/support/base**: Possui os environments.

**./src/test/support/dominio**: Classes com domínios.

**./src/test/support/utils**: criarmos asserts para validar retornos de cada caso de teste.

### Como rodar os testes:

#### Localmente

Clone o projeto `git clone https://gitlab.com/MatheusDevQA/api-reqres-pojo.git`

No terminal rode o comando `mvn -B clean verify`

#### Pipeline Github Actions

Na aba actions selecione o workflow `Regression Tests APi Reqres` e clique no menu **Run workflow**