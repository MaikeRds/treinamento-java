package com.exemplo.jdbc.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) {

        // 1 - NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR!

        // 2 - Definir parâmetros para se conectar ao banco de dados Postgres.
        String driver = "postgresql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "treinamento";
        String user = "treinamento";
        String password = "treinamento";

        // 3 - Construção da string de conexão.
        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String connectionUrl = sb.toString(); //sb.toString() == "jdbc:postgres://localhost/treinamento"

        //Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!!!)
        //Class.forName("com.postgres.jdbc.Driver");

        // 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("SUCESSO ao se conectar ao banco PostgresSQL!");
        } catch (Exception e) {
            System.out.println("FALHA ao se conectar ao banco PostgresSQL!");
            e.printStackTrace();
        }

    }
}
