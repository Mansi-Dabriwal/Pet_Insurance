/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.utilities;

/**
 *
 * @author rakshaisrani
 */
public class Constants {
    
    public static final String EmailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    public static final String connectionUrl =
                "jdbc:sqlserver://petinsurance.database.windows.net:1433;"
                + "database=petinsurancedb;"
                + "user=petinsurance;"
                + "password=Password@5100;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
    public static final String numRegex = "[0-9]+";
    
    
}
