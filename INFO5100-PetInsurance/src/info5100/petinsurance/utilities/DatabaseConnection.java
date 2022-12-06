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

    private static Connection connection;

    private static void setConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(Constants.connectionUrl);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ResultSet getData(String query, boolean isDml) throws SQLException {
        setConnection();
        
        PreparedStatement ps;

        ResultSet resultSet = null;
        if (isDml) {
            ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            int affectedTrue = ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();
            return resultSet;
        }
        Statement statement;
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);

        return resultSet;
    }

}
