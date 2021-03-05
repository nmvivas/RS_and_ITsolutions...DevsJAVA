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
public class TypeProblem extends Problem {
    
    
    private String typeIncident = "001";
    private String typeRemoteSolution = "002";

    public TypeProblem(boolean isSolve, int idProblem, String titleProblem, LocalDate dateOfShipment) {
        super(isSolve, idProblem, titleProblem, dateOfShipment);
    }

    
    
    

    @Override
    public String toString() {
        return "TypeProblem{" + "typeIncident=" + typeIncident + 
                ", typeRemoteSolution=" + typeRemoteSolution + '}';
    }
    
    
    /**
     * @return the typeIncident
     */
    public String getTypeIncident() {
        return typeIncident;
    }

    /**
     * @param typeIncident the typeIncident to set
     */
    public void setTypeIncident(String typeIncident) {
        this.typeIncident = typeIncident;
    }

    /**
     * @return the typeRemoteSolution
     */
    public String getTypeRemoteSolution() {
        return typeRemoteSolution;
    }

    /**
     * @param typeRemoteSolution the typeRemoteSolution to set
     */
    public void setTypeRemoteSolution(String typeRemoteSolution) {
        this.typeRemoteSolution = typeRemoteSolution;
    }
 
}

