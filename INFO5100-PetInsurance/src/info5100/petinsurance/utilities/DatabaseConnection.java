/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.utilities;

import info5100.petinsurance.model.Address;
import info5100.petinsurance.model.Person;
import info5100.petinsurance.model.UserAccount;
import info5100.petinsurance.model.animal.AnimalDetails;
import info5100.petinsurance.model.hospital.Doctor;
import info5100.petinsurance.model.hospital.Hospital;
import info5100.petinsurance.model.hospital.PatientDiagnose;
import info5100.petinsurance.model.hospital.UpcomingAppointments;
import info5100.petinsurance.model.hospital.bloodbank.Bloodbank;
import info5100.petinsurance.model.insurance.InsuranceClaim;
import info5100.petinsurance.model.insurance.InsuranceDetails;
import info5100.petinsurance.model.insurance.InsurancePlan;
import info5100.petinsurance.model.support.AbuseReport;
import info5100.petinsurance.model.rescueoperation.AdoptedAnimal;
import info5100.petinsurance.model.rescueoperation.AnimalRescueOperation;
import info5100.petinsurance.model.support.BloodCollectionRequestModel;
import info5100.petinsurance.ui.SignUp;
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
            connection = DriverManager.getConnection(Constants.CONNECTIONURL);

        } catch (SQLException e) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, e);

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

            ps = connection.prepareStatement("INSERT INTO AnimalDetails VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ad.getAnimalName());
            ps.setString(2, ad.getAnimalType());
            ps.setString(3, ad.getBreed());
            ps.setInt(4, ad.getAge());
            ps.setString(5, ad.getGender());
            ps.setInt(6, ad.getAnimalOwnerID());
            ps.setString(7, ad.getBloodType());
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    public static ResultSet storeData(InsuranceDetails insurance) {

        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO InsuranceDetails VALUES ( ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insurance.getAnimalId());
            ps.setDate(2, new Date(insurance.getDateOfInsurance().getTime()));
            ps.setString(3, insurance.getExistingMedicalConditions());
            ps.setInt(4, insurance.getPlanId());
            ps.setDate(5, null);
            ps.setString(6, "ACTIVE");
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    public static ResultSet storeData(Address address) {

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

    public static ResultSet storeData(Person person) {

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

    public static ResultSet storeData(InsurancePlan insurancePlan) {

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

    public static ResultSet updatePlan(InsurancePlan insurancePlan) {

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

    public static ResultSet storeData(Hospital h) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Hospital VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, h.getHospitalName());
            ps.setInt(2, h.getAddressID());
            ps.setString(3, h.getPhone());
            ps.setString(4, h.getEmail());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    public static ResultSet StoreData(AbuseReport ar) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO AbuseComplaints VALUES (?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ar.getAnimalID());
            ps.setString(2, ar.getReporterName());
            ps.setString(3, ar.getReporteEmail());
            ps.setString(4, ar.getReporterPhone());
            ps.setString(5, ar.getComments());
            ps.setInt(6, ar.getSupportPersonId());
            ps.setString(7, ar.getSupportPersonName());
            ps.setString(8, ar.getStatus().toString());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet; //To change body of generated methods, choose Tools | Templates.
    }

    public static ResultSet storeData(BloodCollectionRequestModel bcr) {

        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO BloodCollectionRequests VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bcr.getAnimalID());
            ps.setString(2, bcr.getAnimalType());
            ps.setString(3, bcr.getBloodType());
            ps.setInt(4, bcr.getUnits());
            ps.setDate(5, new Date(bcr.getRequiredByDate().getTime()));
            ps.setInt(6, bcr.getSupportPersonID());
            ps.setString(7, bcr.getSupportPersonName());
            ps.setString(8, bcr.getStatus().toString());
            ps.setString(9, bcr.getOwnerEmail());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet; //To change body of generated methods, choose Tools | Templates.

    }

    public static ResultSet storeData(Doctor d) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Doctor VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, d.getPersonId());
            ps.setString(2, d.getSpeciality());
            ps.setInt(3, d.getHospitalId());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    public static ResultSet updateAvailability(Bloodbank bb) {

        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update BloodBank SET availability =? where bloodType = ?", Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, bb.getAvailability());
            ps.setString(2, bb.getBloodType());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;

    }

    public static ResultSet storeBloodAvailability(Bloodbank bb) {

        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO Bloodbank VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, bb.getBloodType());
            ps.setInt(2, bb.getAvailability());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;

    }

    public static void updateBloodCollectionRequestStatus(BloodCollectionRequestModel bcr) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update BloodCollectionRequests SET status =? where id = ?", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, bcr.getStatus().toString());
            ps.setInt(2, bcr.getId());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ResultSet storeData(UpcomingAppointments u) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO UpcomingAppointments VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, u.getPatientName());
            ps.setInt(2, u.getPatientId());
            ps.setDate(3, new Date(u.getDateOfAppointment().getTime()));
            ps.setInt(4, u.getDoctorID());
            ps.setString(5, u.getStatus());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    public static ResultSet storeData(AnimalRescueOperation a) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO AnimalRescueOperation VALUES (?, ?, ?,?)", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, a.getWasRescued());
            ps.setString(3, a.getPlaceOfRescue());
            ps.setDate(2, (Date) a.getDateOfRescue());
            ps.setInt(4, a.getAnimalID());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    public static ResultSet storeData(AdoptedAnimal a) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO AnimalsForAdoption VALUES (?, ?, ?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, a.getName());
            ps.setString(2, a.getType());
            ps.setString(3, a.getGender());
            ps.setString(4, a.getBreed());
            ps.setInt(5, a.getAge());
            ps.setString(6, a.getStatus());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    public static ResultSet cancelInsurance(InsuranceDetails activeInsuranceDetails) {

        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update InsuranceDetails SET status =?, endDate =? where id = ?", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, "INACTIVE");
            ps.setDate(2, new Date(activeInsuranceDetails.getEndDate().getTime()));
            ps.setInt(3, activeInsuranceDetails.getId());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;

    }

    public static ResultSet updatePerson(Person p) {

        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update Person SET fname =?, lname =?, phone = ?, email = ? where id = ?", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, p.getfName());
            ps.setString(2, p.getlName());
            ps.setString(3, p.getPhone());
            ps.setString(4, p.getEmail());
            ps.setInt(5, p.getId());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;

    }

    public static ResultSet updateInsuranceDetails(InsuranceDetails insurance) {

        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update InsuranceDetails SET existingMedicalConditions =?, planId =? where id = ?", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, insurance.getExistingMedicalConditions());
            ps.setInt(2, insurance.getPlanId());
            ps.setInt(3, insurance.getId());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;

    }

    public static ResultSet submitClaim(InsuranceClaim claim) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO ClaimDetails VALUES (?, ?, ?,?,?,?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, claim.getAnimalId());
            ps.setInt(2, claim.getAmount());
            ps.setInt(3, claim.getInsuranceDetailsId());
            ps.setInt(4, claim.getHospitalId());
            ps.setString(5, claim.getDoctorId());
            ps.setString(6, claim.getStatus().toString());

            ps.setString(7, claim.getOwnerEmail());
            ps.setString(8, claim.getOwnerPhone());
            ps.setDate(9, new Date(claim.getSubmissionDate().getTime()));

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    
    public static ResultSet storeData(PatientDiagnose p) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO PatientDiagnose VALUES (?, ?, ?,?,?,?,?,?, ?)", Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, p.getPatientId());
            ps.setString(2, p.getPatientName());
            ps.setDate(3, new Date(p.getDateOfPatient().getTime()));
            ps.setString(4, p.getBloodPressure());
            ps.setString(5, p.getBloodGroup());
            ps.setString(6, p.getMedicine1());
            ps.setString(7, p.getMedicine2());
            ps.setString(8, p.getMedicine3());
            ps.setString(9, p.getStatus());
            
            
            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    }
    
    public static ResultSet updateAppointment(UpcomingAppointments p) {
        ResultSet resultSet = null;
        try {
            setConnection();
            PreparedStatement ps;

            ps = connection.prepareStatement("Update upcomingappointments set status = 'COMPLETED' WHERE patientId = ?", Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, p.getPatientId());

            ps.executeUpdate();
            resultSet = ps.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resultSet;
    }
        

}
