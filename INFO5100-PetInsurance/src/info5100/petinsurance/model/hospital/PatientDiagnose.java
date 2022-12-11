/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.hospital;

import java.util.Date;

/**
 *
 * @author mansidabriwal
 */
public class PatientDiagnose {
    int id;
    int patientId;
    String patientName;
    Date dateOfAppointment;
    String bloodPressure;
    String bloodGroup;
    String medicine1;
    String medicine2;
    String medicine3;
    
    public PatientDiagnose(int patientId, String patientName, Date dateOfAppointment, String bloodPressure,String bloodGroup, String medicine1,String medicine2, String medicine3){
        this.patientId = patientId;
        this.bloodGroup = bloodGroup;
        this.bloodPressure = bloodPressure;
        this.dateOfAppointment = dateOfAppointment;
        this.medicine1 = medicine1;
        this.medicine2 = medicine2;
        this.medicine3 = medicine3;
        this.patientName = patientName;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getDateOfPatient() {
        return dateOfAppointment;
    }

    public void setDateOfPatient(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMedicine1() {
        return medicine1;
    }

    public void setMedicine1(String medicine1) {
        this.medicine1 = medicine1;
    }

    public String getMedicine2() {
        return medicine2;
    }

    public void setMedicine2(String medicine2) {
        this.medicine2 = medicine2;
    }

    public String getMedicine3() {
        return medicine3;
    }

    public void setMedicine3(String medicine3) {
        this.medicine3 = medicine3;
    }
}
