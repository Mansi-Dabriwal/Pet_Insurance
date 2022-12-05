/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.animal;

/**
 *
 * @author rakshaisrani
 */
public class AnimalDetails {
    
    int id;
    String animalType;
    String breed;
    int age;
    String gender;
    int animalOwnerID;
    int medicalHistoryID;
    String bloodType;

    public int getAnimalOwnerID() {
        return animalOwnerID;
    }

    public void setAnimalOwnerID(int animalOwnerID) {
        this.animalOwnerID = animalOwnerID;
    }

    public int getMedicalHistoryID() {
        return medicalHistoryID;
    }

    public void setMedicalHistoryID(int medicalHistoryID) {
        this.medicalHistoryID = medicalHistoryID;
    }
    

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

   

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
}
