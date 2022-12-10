/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.utilities;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rakshaisrani
 */
public enum Roles {

    InsuranceProviderAdmin("Insurance Provider Admin"),
    HospitalAdmin("Hospital Admin"),
    VeterinaryDoctor("Veterinary Doctor"),
    BloodBankAdmin("Blood Bank Admin"),
    RescueUnitManager("Rescue Unit Manager"),
    PetOwner("Pet Owner"),
    SupportRepresentative("Support Representative"),
    SystemAdmin("System Admin");
    
    private static final Map<String, Roles> lookup = new HashMap<String, Roles>();

    static {
        for (Roles r : Roles.values()) {
            lookup.put(r.getDisplayVal(), r);
        }
    }

    Roles(String displayVal) { 
      this.displayVal = displayVal;
    }

    String displayVal;

    public String getDisplayVal() {
        return displayVal;
    }
    
    public static Roles get(String displayval) {
        return lookup.get(displayval);
    }

}
