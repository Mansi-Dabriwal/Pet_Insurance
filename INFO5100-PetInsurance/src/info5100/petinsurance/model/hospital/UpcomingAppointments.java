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
    
    public UpcomingAppointments( String patientName, int patientId, Date dateOfAppointment){
        this.dateOfAppointment = dateOfAppointment;
        this.patientId = patientId;
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

    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }
    
    
}
