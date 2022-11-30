/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rakshaisrani
 */
public class DatabaseConnection {

    private static Statement statement;

    private static void setConnection() throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(Constants.connectionUrl);
            statement = connection.createStatement();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ResultSet getData(String query) throws SQLException {
        setConnection();

        ResultSet resultSet = null;
        // Create and execute a SELECT SQL statement.
        query = "SELECT * from demo";
        resultSet = statement.executeQuery(query);

        return resultSet;
    }

}
