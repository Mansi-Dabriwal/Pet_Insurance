/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.utilities;

import java.util.regex.Pattern;

/**
 *
 * @author rakshaisrani
 */
public class EmailValidationService {
    
    public static boolean validateEmail(String email){
     return Pattern.compile(Constants.EmailRegex)
      .matcher(email)
      .matches();
    }
    
}
