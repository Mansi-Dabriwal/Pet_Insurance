/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.insurance;

import info5100.petinsurance.utilities.WorkFlowStatus;
import java.util.Date;

/**
 *
 * @author rakshaisrani
 */
public class InsuranceClaim {
    
    int id;
    int animalId;
    int insuranceDetailsId;
    WorkFlowStatus status;
    int amount;
    int hospitalId;
    String doctorName;
    String ownerEmail;
    String ownerPhone; 
    Date submissionDate;

    public InsuranceClaim(int animalId, int insuranceDetailsId, WorkFlowStatus status, int amount, int hospitalId, String doctorName, String ownerEmail, String ownerPhone, Date submiDate) {
        this.animalId = animalId;
        this.insuranceDetailsId = insuranceDetailsId;
        this.status = status;
        this.amount = amount;
        this.hospitalId = hospitalId;
        this.doctorName = doctorName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
        this.submissionDate = submiDate;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public int getInsuranceDetailsId() {
        return insuranceDetailsId;
    }

    public void setInsuranceDetailsId(int insuranceDetailsId) {
        this.insuranceDetailsId = insuranceDetailsId;
    }

    public WorkFlowStatus getStatus() {
        return status;
    }

    public void setStatus(WorkFlowStatus status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDoctorId() {
        return doctorName;
    }

    public void setDoctorId(String doctorId) {
        this.doctorName = doctorId;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }
   
    
}
