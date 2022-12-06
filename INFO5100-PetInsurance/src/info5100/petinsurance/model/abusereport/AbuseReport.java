/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.abusereport;

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
    String status; //-- need from Mansi's code
    String comments;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    
}
