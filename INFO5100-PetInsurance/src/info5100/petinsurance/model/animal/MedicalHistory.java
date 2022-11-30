/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.animal;

/**
 *
 * @author rakshaisrani
 */
public class MedicalHistory {
    
    int id;
    boolean isDomesticPet;
    boolean fluAffected;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIsDomesticPet() {
        return isDomesticPet;
    }

    public void setIsDomesticPet(boolean isDomesticPet) {
        this.isDomesticPet = isDomesticPet;
    }

    public boolean isFluAffected() {
        return fluAffected;
    }

    public void setFluAffected(boolean fluAffected) {
        this.fluAffected = fluAffected;
    }
}
