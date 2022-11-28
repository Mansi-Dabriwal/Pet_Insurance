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

/**
 *
 * @author rakshaisrani
 */
public class DatabaseConnection {
    
    private static Connection connection;
    
    private static void setConnection() throws SQLException{
      connection = (Connection) DriverManager.getConnection(Constants.jdbcUrl,
                        Constants.username, Constants.password);

    }
    
    public static ResultSet getData(String query) throws SQLException{
        setConnection();
        PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement(query);
        ResultSet rs = st.executeQuery();
        return rs;
    }
    
}
