package com.exemplo.jdbc.core;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    //Construtor declarado como privado. Evitando assim criar instâncias da fábrica.
    private ConnectionFactory() {
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection() {

        // 1 - Declarar objeto conexão (irá receber uma conexão após executar os passos abaixo)
        Connection connection = null;

        // 2 - Carregar arquivo de propriedades para pegar parâmetros necessários para se comunicar com o banco de dados
        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("connection.properties")) {

            // 3 - Definir parâmetros para se conectar ao banco de dados PostgresSQL.
            Properties prop = new Properties();
            prop.load(input);

            String driver = prop.getProperty("db.postgres.driver");
            String dataBaseAddress = prop.getProperty("db.postgres.address");
            String dataBaseName = prop.getProperty("db.postgres.dbname");
            String user = prop.getProperty("db.postgres.user.login");
            String password = prop.getProperty("db.postgres.user.password");

            // 4 - Construção da string de conexão.
            StringBuilder sb = new StringBuilder("jdbc:")
                    .append(driver).append("://")
                    .append(dataBaseAddress).append("/")
                    .append(dataBaseName);

            String connectionUrl = sb.toString(); //sb.toString() == "jdbc:postgresql://localhost/treinamento"

            // 5 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
            try {
                connection = DriverManager.getConnection(connectionUrl, user, password);
            } catch (SQLException e) {
                System.out.println("FALHA ao tentar criar conexão");
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            System.out.println("FALHA ao tentar carregar aquivos de propriedades");
            e.printStackTrace();
        }

        return connection;
    }
}
