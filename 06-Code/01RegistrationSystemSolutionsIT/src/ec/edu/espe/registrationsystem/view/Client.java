/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.view;

/**
 *
 * @author KAREN VELASCO, NATALIA VIVAS, CHARLES ZAMBRANO
 */
public class Client {
    private String company;
    private String names;
    private int idCardRuc;
    private String address;
    private int telephone;

    public Client(String company, String names, int idCardRuc, String address, int telephone) {
        this.company = company;
        this.names = names;
        this.idCardRuc = idCardRuc;
        this.address = address;
        this.telephone = telephone;
    }
    
}
