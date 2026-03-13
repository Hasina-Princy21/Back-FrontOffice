package com.Framework.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Con {

    // Paramètres de connexion
    private static final String URL = "jdbc:mysql://localhost:5432/ma_base"; // Ou jdbc:postgresql://localhost:5432/ma_base
    private static final String USER = "postgres";
    private static final String PASSWORD = "hasina";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Optionnel pour les versions récentes de Java, mais recommandé :
            // Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            System.err.println("Erreur de connexion : " + e.getMessage());
        }
        return connection;
    }
}