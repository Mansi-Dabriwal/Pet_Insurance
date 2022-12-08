/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.support;

import info5100.petinsurance.utilities.WorkFlowStatus;
import java.util.Date;

/**
 *
 * @author rakshaisrani
 */
public class BloodCollectionRequestModel {
    /*ID INT IDENTITY PRIMARY KEY, AnimalID INT FOREIGN KEY REFERENCES AnimalDetails(id), 
AnimalType VARCHAR(50), BloodType VARCHAR(5), 
NumberofUnits INT, RequiredByDate DATE, SupportPersonID INT FOREIGN KEY REFERENCES Person(id), SupportPersonName VARCHAR(50), Status VARCHAR(30)*/
   int id;
   int animalID;
   String animalType;
   String bloodType;
   int units;
   Date requiredByDate;
   int supportPersonID;
   String supportPersonName;
   WorkFlowStatus status;

    public BloodCollectionRequestModel(int animalID, String animalType, String bloodType, int units, Date requiredByDate, int supportPersonID, String supportPersonName, WorkFlowStatus status) {
        this.animalID = animalID;
        this.animalType = animalType;
        this.bloodType = bloodType;
        this.units = units;
        this.requiredByDate = requiredByDate;
        this.supportPersonID = supportPersonID;
        this.supportPersonName = supportPersonName;
        this.status = status;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public Date getRequiredByDate() {
        return requiredByDate;
    }

    public void setRequiredByDate(Date requiredByDate) {
        this.requiredByDate = requiredByDate;
    }

    public int getSupportPersonID() {
        return supportPersonID;
    }

    public void setSupportPersonID(int supportPersonID) {
        this.supportPersonID = supportPersonID;
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
