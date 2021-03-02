/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import java.time.LocalDate;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Problem extends File {

    private boolean isSolve;
    private static int problemInTheBaseData;
    private String nameProblem;

    public Problem(boolean isSolve, String nameProblem, int idProblem, String titleProblem, LocalDate dateOfShipment) {
        super(idProblem, titleProblem, dateOfShipment);
        this.isSolve = isSolve;
        this.nameProblem = nameProblem;
    }

    

    public int archiveProblem() {
        if (isIsSolve() == false) {
            setProblemInTheBaseData(getProblemInTheBaseData() + 1);
            return getProblemInTheBaseData();
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

    /**
     * @return the problemInTheBaseData
     */
    public static int getProblemInTheBaseData() {
        return problemInTheBaseData;
    }

    /**
     * @param aProblemInTheBaseData the problemInTheBaseData to set
     */
    public static void setProblemInTheBaseData(int aProblemInTheBaseData) {
        problemInTheBaseData = aProblemInTheBaseData;
    }

    /**
     * @return the nameProblem
     */
    public String getNameProblem() {
        return nameProblem;
    }

    /**
     * @param nameProblem the nameProblem to set
     */
    public void setNameProblem(String nameProblem) {
        this.nameProblem = nameProblem;
    }

}



