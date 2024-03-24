package co.edu.sena;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Obtener la conexión
            connection = DatabaseConnector.getConnection();
            if (connection  != null){
                System.out.println("eso tilin");
            } else {
                System.out.println("la cagaste tilin");
            }
        } catch (RuntimeException e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
        } finally {
            // Cerrar la conexión
            DatabaseConnector.closeConnection(connection);
        }
    }
}
