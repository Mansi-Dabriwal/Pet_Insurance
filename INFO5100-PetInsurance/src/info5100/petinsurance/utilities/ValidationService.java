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
public class ValidationService {
    
    public static boolean validateEmail(String email){
     return Pattern.compile(Constants.EMAILREGEX)
      .matcher(email)
      .matches();
    }
    
    public static boolean validateAge(String age){
     return Pattern.compile(Constants.NUMREGEX)
      .matcher(age)
      .matches();
    }

    public static boolean validateNumber(String number){
     if (number.length() != 10)
         return false;
     else
     return Pattern.compile(Constants.NUMREGEX)
      .matcher(number)
      .matches();
    }

}
