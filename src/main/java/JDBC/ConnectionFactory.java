package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static ConnectionFactory connection;

    private ConnectionFactory(Connection connection) {

    }

    public static Connection getConnection() {
        if (connection == null) {
            connection = (ConnectionFactory) initConnection();
        }
        return (Connection) connection;
    }

    private static Connection initConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:1432/vendas_online_2", "postgres", "darkichigo");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
