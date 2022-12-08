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
    String existingMedicalConditions;
    int planId;
    
    public InsuranceDetails(int animalId, Date dateOfInsurance, String existingMedicalConditions, int planId) {
        this.animalId = animalId;
        this.dateOfInsurance = dateOfInsurance;
        this.existingMedicalConditions = existingMedicalConditions;
        this.planId = planId;
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

    public Date getDateOfInsurance() {
        return dateOfInsurance;
    }

    public void setDateOfInsurance(Date dateOfInsurance) {
        this.dateOfInsurance = dateOfInsurance;
    }

    public String getExistingMedicalConditions() {
        return existingMedicalConditions;
    }

    public void setExistingMedicalConditions(String existingMedicalConditions) {
        this.existingMedicalConditions = existingMedicalConditions;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }
    
}
