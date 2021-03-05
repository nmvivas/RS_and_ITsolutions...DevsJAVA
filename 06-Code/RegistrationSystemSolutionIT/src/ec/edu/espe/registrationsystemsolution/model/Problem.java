/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

import java.time.LocalDate;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Problem extends File {

    private boolean isSolve;
    private static int problemInTheBaseData;

    public Problem(boolean isSolve, int idProblem, String titleProblem, LocalDate dateOfShipment) {
        super(idProblem, titleProblem, dateOfShipment);
        this.isSolve = isSolve;
    }

    public int archiveProblem() {
        if (isSolve == false) {
            problemInTheBaseData++;
            return problemInTheBaseData;
        } else {
            return 0;
        }
    }

    /**
     * @return the isSolve
     */
    public boolean isIsSolve() {
        return isSolve;
    }

    /**
     * @param isSolve the isSolve to set
     */
    public void setIsSolve(boolean isSolve) {
        this.isSolve = isSolve;
    }

    public int getProblemInTheBaseData() {
        return problemInTheBaseData;
    }

    public void setProblemInTheBaseData(int problemInTheBaseData) {
        Problem.problemInTheBaseData = problemInTheBaseData;
    }
    
}

