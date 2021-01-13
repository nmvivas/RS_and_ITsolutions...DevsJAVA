/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

import ec.edu.espe.filemanager.utils.Data;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Problem {

    private String description;
    private String state;
    private String typeProblem;

    public Problem() {

        Scanner enterData = new Scanner(System.in);

        System.out.println(" ================================== REGIST PROBLEM  ================================= \n");
        System.out.println(" \n ---> Enter description of problem:  ");
        description = enterData.nextLine();
        System.out.println(" \n ---> Enter type the problem: ");
        typeProblem = enterData.nextLine();
        System.out.println(" \n ---> Enter state of the problem:  ");
        state = enterData.nextLine();
        
        String dataToSave = toString();
        Data.save("Problem.csv", dataToSave);

    }
  
     @Override
    public String toString() {
        return "Problem{" + "description=" + getDescription() + ", state="
                + getState() + '}';
    } 
    
    public void describeProblem() {

    }

    public Problem(String description, String typeProblem, String state) {
        this.description = description;
        this.state = state;
        this.typeProblem = typeProblem;
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
