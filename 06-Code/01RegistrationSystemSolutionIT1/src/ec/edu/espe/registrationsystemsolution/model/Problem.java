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
    private String typeProblem;
    private String state;

    public Problem(String description, String typeProblem, String state) {
        this.description = description;
        this.typeProblem = typeProblem;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Problem{" + "description = " + description + ", typeProblem = " 
                + typeProblem + ", state = " + state + '}';
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
