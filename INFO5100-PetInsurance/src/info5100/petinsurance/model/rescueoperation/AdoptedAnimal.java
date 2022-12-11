/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.rescueoperation;

/**
 *
 * @author mansidabriwal
 */
public class AdoptedAnimal {
    int id;
    String type;
    String gender;
    String breed;
    int age;
    String status;
    String name;

    public AdoptedAnimal(String name, String type, String gender, String breed, int age, String status) {
       this.name =name;
       this.type = type;
       this.breed = breed;
       this.gender = gender;
       this.status = status;
       this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AdoptedAnimal( String type, String gender, String breed, int age, String status){
   
        this.type = type;
        this.gender = gender;
        this.breed = breed; 
        this.age = age;
        this.status = status;
       
    }
}
