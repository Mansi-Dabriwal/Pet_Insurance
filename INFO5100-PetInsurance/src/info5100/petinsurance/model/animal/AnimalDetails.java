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
    String bloodType;
    String name;

    public AnimalDetails( String name,String animalType, String breed, int age, String gender, int animalOwnerID, String bloodType) {
        this.animalType = animalType;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.animalOwnerID = animalOwnerID;
        this.bloodType = bloodType;
        this.name = name;
    }
    
    

    public int getAnimalOwnerID() {
        return animalOwnerID;
    }

    public void setAnimalOwnerID(int animalOwnerID) {
        this.animalOwnerID = animalOwnerID;
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

    public String getAnimalName() {
        return name;
    }

    public void setAnimalName(String animalName) {
        this.name = name;
    }
    
    
}
