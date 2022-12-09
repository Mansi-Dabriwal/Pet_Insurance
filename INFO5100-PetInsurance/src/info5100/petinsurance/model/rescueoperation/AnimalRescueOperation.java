/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.rescueoperation;

import java.util.Date;

/**
 *
 * @author mansidabriwal
 */
public class AnimalRescueOperation {
    int id;
    String wasRescued;
    Date dateOfRescue;
    String placeOfRescue;
    int AnimalID;
    
    public AnimalRescueOperation(String wasRescued, Date dateOfRescue, String placeOfRescue, int AnimalID) {
        this.wasRescued = wasRescued;
        this.dateOfRescue = dateOfRescue;
        this.placeOfRescue = placeOfRescue;
        this.AnimalID = AnimalID;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWasRescued() {
        return wasRescued;
    }

    public void setWasRescued(String wasRescued) {
        this.wasRescued = wasRescued;
    }

    public Date getDateOfRescue() {
        return dateOfRescue;
    }

    public void setDateOfRescue(Date dateOfRescue) {
        this.dateOfRescue = dateOfRescue;
    }

    public String getPlaceOfRescue() {
        return placeOfRescue;
    }

    public void setPlaceOfRescue(String placeOfRescue) {
        this.placeOfRescue = placeOfRescue;
    }

    public int getAnimalID() {
        return AnimalID;
    }

    public void setAnimalID(int AnimalID) {
        this.AnimalID = AnimalID;
    }
}
