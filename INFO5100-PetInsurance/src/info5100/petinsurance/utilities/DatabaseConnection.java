/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.utilities;

import info5100.petinsurance.model.Address;
import info5100.petinsurance.model.Person;
import info5100.petinsurance.model.UserAccount;
import info5100.petinsurance.model.animal.AnimalDetails;
import info5100.petinsurance.model.insurance.InsuranceDetails;
import info5100.petinsurance.model.insurance.InsurancePlan;
import java.sql.Connection;
import java.sql.Date;
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

    public static void storeData(UserAccount ua) {
        try {
            setConnection();
            PreparedStatement ps;

            //ResultSet resultSet = null;
            ps = connection.prepareStatement("INSERT INTO USERACCOUNT (Username, Password, PersonID, RoleName) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ua.getUsername());
            ps.setString(2, ua.getPassword());
            ps.setInt(3, ua.getPersonID());
            ps.setString(4, ua.getRole());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet storeData(AnimalDetails ad) {
        
         ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO AnimalDetails VALUES (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ad.getAnimalType());
            ps.setString(2, ad.getBreed());
            ps.setInt(3, ad.getAge());
            ps.setString(4, ad.getGender());
            ps.setInt(5, ad.getAnimalOwnerID());
            ps.setString(6, ad.getBloodType());
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    }
    
    
    public static ResultSet storeData(InsuranceDetails insurance){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO InsuranceDetails VALUES ( ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insurance.getAnimalId());
            ps.setDate(2,  new Date(insurance.getDateOfInsurance().getTime()));
            ps.setString(3, insurance.getExistingMedicalConditions());
            ps.setInt(4, insurance.getPlanId());
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;   
    }
    
    
    public static ResultSet storeData(Address address){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Address VALUES (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, address.getAddressLine1());
            ps.setString(2, address.getAddressLine2());
            ps.setString(3, address.getCity());
            ps.setString(4, address.getState());
            ps.setString(5, address.getCountry());
            ps.setInt(6, address.getZipCode());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    
    public static ResultSet storeData(Person person){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Person VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, person.getfName());
            ps.setString(2, person.getlName());
            ps.setString(3, person.getPhone());
            ps.setString(4, person.getEmail());
            ps.setInt(5, person.getAddressID());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
    public static ResultSet storeData(InsurancePlan insurancePlan){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO InsurancePlan VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, insurancePlan.getPlanName());
            ps.setString(2, insurancePlan.getInclusions());
            ps.setInt(3, insurancePlan.getPlanPremium());
            ps.setInt(4, insurancePlan.getPlanCoverage());
            ps.setInt(5, insurancePlan.getValidity());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }
    
     public static ResultSet updatePlan(InsurancePlan insurancePlan){
        
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update InsurancePlan SET validity =?, planPremium =?, planCoverage = ? where planName = ?", Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, insurancePlan.getValidity());
            ps.setInt(2, insurancePlan.getPlanPremium());
            ps.setInt(3, insurancePlan.getPlanCoverage());
            ps.setString(4, insurancePlan.getPlanName());
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    
    }

}
