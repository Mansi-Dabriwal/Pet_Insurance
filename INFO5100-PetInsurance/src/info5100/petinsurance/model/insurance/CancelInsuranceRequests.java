/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.insurance;

import java.util.Date;

/**
 *
 * @author rakshaisrani
 */
public class CancelInsuranceRequests {
    
    int id;
    int animalId;
    String animalName;
    Date cancellationDate;
    int insuranceNumber;

    public CancelInsuranceRequests(int animalId, String animalName, Date cancellationDate, int insuranceNumber) {
        this.animalId = animalId;
        this.animalName = animalName;
        this.cancellationDate = cancellationDate;
        this.insuranceNumber = insuranceNumber;
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

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Date getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    
    
    
    
}
