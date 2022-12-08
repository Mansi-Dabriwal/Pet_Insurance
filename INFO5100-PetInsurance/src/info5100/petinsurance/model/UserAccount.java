/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model;

import info5100.petinsurance.utilities.Roles;

/**
 *
 * @author rakshaisrani
 */
public class UserAccount {
    
    int id;
    String username;
    String password;
    int personID;
    String role;

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    public UserAccount(int id, String username, String password, int personID, Roles role){
        this.id = id;
        this.username = username;
        this.password = password;
        this.personID = personID; 
        this.role = role.getDisplayVal();
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    

}
