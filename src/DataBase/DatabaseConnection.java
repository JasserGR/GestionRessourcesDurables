
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/GestionRessourcesDurables";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Méthode statique pour obtenir la connexion
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}