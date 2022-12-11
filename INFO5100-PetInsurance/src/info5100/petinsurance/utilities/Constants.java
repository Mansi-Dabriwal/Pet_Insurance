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
    
    public static final String EMAILREGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    public static final String CONNECTIONURL =
                "jdbc:sqlserver://boyce.coe.neu.edu:1433;"
                + "database=RakshaAshi;"
                + "user=INFO6210;"
                + "password=NEUHusky!;"
                + "encrypt=true;"
                + "trustServerCertificate=true;"
                + "loginTimeout=30;";
    public static final String NUMREGEX = "[0-9]+";
    
    public static final String GETINSURANCEFORPET = "select * from InsuranceDetails where status = 'Active' and animalID = ";
    
    public static final String USERCOUNT =  "select count(*) AS countofusers from Useraccount where username = '";
     
    public static final String GETUSERACCOUNT =  "select * from Useraccount where username = '";
    
    public static final String GETALLAPPOINTMENTSFORDOCTOR = "SELECT * FROM UpcomingAppointments ua JOIN Doctor d ON d.id = ua.DoctorID WHERE d.personId =";
    
    public static final String GETALLUSERNAMES = "select username from UserAccount";
    
    public static final String GETALLHOSPITALS = "Select * from Hospital";
    
    public static final String GETALLANIMALS = "Select * from AnimalDetails";
    
    public static final String GETALLDOCTORS = " select p.id as id, p.fName , p.lName from Person p JOIN UserAccount ua ON p.id = ua.PersonID Where ua.RoleName = 'Veterinary Doctor'";

    public static final String GETALLACTIVEINSURANCE = "select id.id AS ID, id.animalId , existingMedicalConditions , dateOfInsurance , planName from InsuranceDetails id JOIN InsurancePlan ip ON ip.id = id.planId where Status = 'ACTIVE'";
    
    public static final String GETINSURANCEDETAILSFORCLAIM = "select ad.id as AnimalID, ad.name as AnimalName, id.id as InsuranceID, ip.planCoverage from AnimalDetails ad JOIN InsuranceDetails id ON ad.id = id.animalId \n" +
    "JOIN Person p ON p.id = ad.animalOwnerID \n" +
    "JOIN InsurancePlan ip on ip.id = id.planId \n" +
    "WHERE STATUS='ACTIVE'";

    public static final String GETALLANIMALFOROWNER = "Select * from AnimalDetails WHERE animalOwnerID = ";
}
