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
public class UpcomingAppointments {
    int id;
    int patientId;
    String patientName;
    Date dateOfAppointment;
    int doctorID;
    
    public UpcomingAppointments( String patientName, int patientId, Date dateOfAppointment, int docID){
        this.dateOfAppointment = dateOfAppointment;
        this.patientId = patientId;
        this.patientName = patientName;
        this.doctorID = docID;
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

    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
    
    
}
