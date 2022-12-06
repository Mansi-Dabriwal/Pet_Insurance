/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info5100.petinsurance.model.insurance;

/**
 *
 * @author rakshaisrani
 */
public class InsurancePlan {
    int id;
    String planName;
    String inclusions;
    int validity;
    int planPremium;
    int planCoverage;

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public int getPlanPremium() {
        return planPremium;
    }

    public void setPlanPremium(int planPremium) {
        this.planPremium = planPremium;
    }

    public int getPlanCoverage() {
        return planCoverage;
    }

    public void setPlanCoverage(int planCoverage) {
        this.planCoverage = planCoverage;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getInclusions() {
        return inclusions;
    }

    public void setInclusions(String inclusions) {
        this.inclusions = inclusions;
    }

    
}
