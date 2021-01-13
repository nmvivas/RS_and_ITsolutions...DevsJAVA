/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author NATALIA
 */
public class Problem {
     private String description;
     private String state;
     
     
     public void describeProblem(){
         
     }

    public Problem(String description, String state) {
        this.description = description;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Problem{" + "description=" + getDescription() + ", state=" + 
                getState() + '}';
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
     
     
    
}
