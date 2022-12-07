/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.utilities;

import info5100.petinsurance.model.UserAccount;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    
    public static void storeData() {
        try{
            setConnection();
        UserAccount u = new UserAccount(1, "ppp", 
        "ppp", 7, Roles.InsuranceProviderAdmin);
        PreparedStatement ps;

        ResultSet resultSet = null;
            ps = connection.prepareStatement("INSERT INTO USERACCOUNT (Username, Password, PersonID, RoleName) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ps.setInt(3, 7);
            ps.setString(4, Roles.InsuranceProviderAdmin.getDisplayVal());
            int affectedTrue = ps.executeUpdate();
            System.out.print("Rows updated: "+ affectedTrue);
          
        }
        catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   

}
