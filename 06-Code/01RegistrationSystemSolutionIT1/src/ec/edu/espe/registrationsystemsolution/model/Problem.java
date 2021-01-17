/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

/**
 *
 * @author karen
 */
public class Problem {
    private String description;
    private String state;
    private String typeProblem;

    public Problem(String description, String state, String typeProblem) {
        this.description = description;
        this.state = state;
        this.typeProblem = typeProblem;
    }

    Problem() {
        
    }

    @Override
    public String toString() {
        return "Problem{" + "description=" + description + ", state=" + state + ", typeProblem=" + typeProblem + '}';
    }
    
    public String getDescription() {
        return description;
    }

    public String getState() {
        return state;
    }

    public String getTypeProblem() {
        return typeProblem;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTypeProblem(String typeProblem) {
        this.typeProblem = typeProblem;
    }
    
    
    
}
