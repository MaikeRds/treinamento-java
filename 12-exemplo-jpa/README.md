# Projeto

Exemplo básico sobre JPA

## Pré requisitos

- Java Development Kit (JDK) – 1.8 ou superior
- IntelliJ IDEA (É recomendável seguir com essa IDE, porém pode ser selecionada outra)
- Gradle 7.1 (É utilizado para baixar o Driver JDBC. Se quiser, pode ser instalado manualmente ou com o Maven)
- Docker e Docker compose (É ultilizado para inicializar o banco usado no exemplo.)

## Banco de dados - PostgresSQL

1. Instalação do banco de dados
   ```bash
   # Create volume do banco de dados
   docker volume create --name=jdbc-dbdata
   ```
    ```bash
   # Inicialização do container
    docker-compose up
    ```


2. Acessar banco de dados.

    ```text
   db.postgres.driver=postgresql
   db.postgres.address=127.0.0.1
   db.postgres.port=5432
   db.postgres.user.login=treinamento
   db.postgres.user.password=treinamento
   db.postgres.dbname=treinamento
    ```

3. Criar uma tabela no banco de dados

   ```roomsql
   CREATE TABLE aluno (
      id SERIAL PRIMARY KEY,
      nome VARCHAR(80) NOT NULL,
      idade INT NOT NULL,
      estado CHARACTER(2) NOT NULL
   );
   ```

4. Adicionar alguns exemplos

    ```roomsql
    INSERT INTO aluno(nome, idade, estado) VALUES ('Pedro', 20, 'RJ');
    INSERT INTO aluno(nome, idade, estado) VALUES ('Maria', 35, 'AC');
    INSERT INTO aluno(nome, idade, estado) VALUES ('Joao', 10, 'SC');
    INSERT INTO aluno(nome, idade, estado) VALUES ('Ana', 51, 'GO');
    ```

## Configurar dependências

No gradle deve-se adicionar no "build.gradle" (na parte de "dependencies") a linha abaixo

```groovy
dependencies {
   implementation group: 'org.postgresql', name: 'postgresql', version: '42.2.14'
}
```