/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.support;

import info5100.petinsurance.utilities.WorkFlowStatus;

/**
 *
 * @author mansidabriwal
 */
public class AbuseReport {
    
    int id;
    int animalID;
    String reporterName;
    String reporteEmail;
    String reporterPhone;
    String comments;
    int supportPersonId;
    String supportPersonName;
    WorkFlowStatus status;

    public AbuseReport(int animalID, String reporterName, String reporteEmail, String reporterPhone, String comments, int supportPersonId, String supportPersonName, WorkFlowStatus status) {
        this.animalID = animalID;
        this.reporterName = reporterName;
        this.reporteEmail = reporteEmail;
        this.reporterPhone = reporterPhone;
        this.comments = comments;
        this.supportPersonId = supportPersonId;
        this.supportPersonName = supportPersonName;
        this.status = status;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getReporteEmail() {
        return reporteEmail;
    }

    public void setReporteEmail(String reporteEmail) {
        this.reporteEmail = reporteEmail;
    }

    public String getReporterPhone() {
        return reporterPhone;
    }

    public void setReporterPhone(String reporterPhone) {
        this.reporterPhone = reporterPhone;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getSupportPersonId() {
        return supportPersonId;
    }

    public void setSupportPersonId(int supportPersonId) {
        this.supportPersonId = supportPersonId;
    }

    public String getSupportPersonName() {
        return supportPersonName;
    }

    public void setSupportPersonName(String supportPersonName) {
        this.supportPersonName = supportPersonName;
    }

    public WorkFlowStatus getStatus() {
        return status;
    }

    public void setStatus(WorkFlowStatus status) {
        this.status = status;
    }

}
