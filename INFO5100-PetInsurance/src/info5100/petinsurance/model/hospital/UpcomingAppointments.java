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
    String patientName;
    int patientId;
    Date dateOfAppontment;
    
    public UpcomingAppointments(String patientName, int patientId,Date dateOfAppointment){
        this.dateOfAppontment = dateOfAppointment;
        this.id = id;
        this.patientId = patientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Date getDateOfAppontment() {
        return dateOfAppontment;
    }

    public void setDateOfAppontment(Date dateOfAppontment) {
        this.dateOfAppontment = dateOfAppontment;
    }
}
