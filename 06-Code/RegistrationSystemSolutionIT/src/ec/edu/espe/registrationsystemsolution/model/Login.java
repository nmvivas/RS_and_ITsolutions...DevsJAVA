/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

/**
 *
 * @author DEVS_JAVA_KND
 */
public interface Login {

    String loginNickname = null;
    String loginPassword = null;

    int attempts = 0;
    int maximum = 2;

    public void loginAdmin();

}
