/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package info5100.petinsurance;

import info5100.petinsurance.utilities.DatabaseConnection;
import java.sql.ResultSet;

/**
 *
 * @author rakshaisrani
 */
public class INFO5100PetInsurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        ResultSet rs = DatabaseConnection.getData("select * from demo");
        while(rs.next()){  
                  System.out.print(rs.getInt(1)+"\n"); 
                  }
        } catch(Exception e){
        
        }
   
    }
    
}
