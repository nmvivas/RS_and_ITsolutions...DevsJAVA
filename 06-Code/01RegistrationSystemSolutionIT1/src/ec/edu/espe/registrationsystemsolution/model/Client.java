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

    Client() {
        
    }

    @Override
    public String toString() {
        return "Client{" + "company=" + company + ", names=" + names + ", idCardRuc=" + idCardRuc + ", address=" + address + ", telephone=" + telephone + '}';
    }
    

    public String getCompany() {
        return company;
    }

    public String getNames() {
        return names;
    }

    public int getIdCardRuc() {
        return idCardRuc;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setIdCardRuc(int idCardRuc) {
        this.idCardRuc = idCardRuc;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    
    
}
