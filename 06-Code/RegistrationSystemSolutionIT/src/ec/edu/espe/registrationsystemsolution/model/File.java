/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class File {

    private int idProblem;
    private String titleProblem;
    private LocalDate dateOfShipment;

    public int getDayOfAttention() {
        int time = 0;
        LocalDate currentDate;

        currentDate = LocalDate.now();
        time = Period.between(dateOfShipment, currentDate).getDays();
        return time;
    }

    public File(int idProblem, String titleProblem, LocalDate dateOfShipment) {
        this.idProblem = idProblem;
        this.titleProblem = titleProblem;
        this.dateOfShipment = dateOfShipment;
    }

    @Override
    public String toString() {
        return " idProblem(" + idProblem + ") titleProblem "
                + "(" + titleProblem + ") dateOfShipment (" + dateOfShipment + ')';
    }

    /**
     * @return the idProblem
     */
    public int getIdProblem() {
        return idProblem;
    }

    /**
     * @param idProblem the idProblem to set
     */
    public void setIdProblem(int idProblem) {
        this.idProblem = idProblem;
    }

    /**
     * @return the titleProblem
     */
    public String getTitleProblem() {
        return titleProblem;
    }

    /**
     * @param titleProblem the titleProblem to set
     */
    public void setTitleProblem(String titleProblem) {
        this.titleProblem = titleProblem;
    }

    /**
     * @return the dateOfShipment
     */
    public LocalDate getDateOfShipment() {
        return dateOfShipment;
    }

    /**
     * @param dateOfShipment the dateOfShipment to set
     */
    public void setDateOfShipment(LocalDate dateOfShipment) {
        this.dateOfShipment = dateOfShipment;
    }

}
