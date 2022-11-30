/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.insurance;

import java.util.Date;

/**
 *
 * @author mansidabriwal
 */
public class InsuranceDetails {
    int id;
    int animalId;
    Date dateOfInsurance;
    int validity;
    String existingMedicalConditions;

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

    public Date getDateOfInsurance() {
        return dateOfInsurance;
    }

    public void setDateOfInsurance(Date dateOfInsurance) {
        this.dateOfInsurance = dateOfInsurance;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public String getExistingMedicalConditions() {
        return existingMedicalConditions;
    }

    public void setExistingMedicalConditions(String existingMedicalConditions) {
        this.existingMedicalConditions = existingMedicalConditions;
    }
}
