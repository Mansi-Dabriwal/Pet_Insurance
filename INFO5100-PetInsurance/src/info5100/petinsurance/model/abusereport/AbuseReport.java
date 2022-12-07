/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.abusereport;

import info5100.petinsurance.utilities.WorkFlowStatus;
import java.util.Date;

/**
 *
 * @author rakshaisrani
 */
public class AbuseReport {
    
    int id;
    int animalID;
    int supportPersonID;
    int supportPersonName;
    Date reportDate;
    WorkFlowStatus status; //-- need from Mansi's code
    String comments;
    String reporterName;
    String reporterEmail;
    String reporterPhone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public int getSupportPersonID() {
        return supportPersonID;
    }

    public void setSupportPersonID(int supportPersonID) {
        this.supportPersonID = supportPersonID;
    }

    public int getSupportPersonName() {
        return supportPersonName;
    }

    public void setSupportPersonName(int supportPersonName) {
        this.supportPersonName = supportPersonName;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public WorkFlowStatus getStatus() {
        return status;
    }

    public void setStatus(WorkFlowStatus status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getReporterEmail() {
        return reporterEmail;
    }

    public void setReporterEmail(String reporterEmail) {
        this.reporterEmail = reporterEmail;
    }

    public String getReporterPhone() {
        return reporterPhone;
    }

    public void setReporterPhone(String reporterPhone) {
        this.reporterPhone = reporterPhone;
    }
}
