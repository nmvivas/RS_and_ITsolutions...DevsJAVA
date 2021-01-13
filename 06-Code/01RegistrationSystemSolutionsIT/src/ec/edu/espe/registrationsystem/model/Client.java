/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author NATALIA
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

    @Override
    public String toString() {
        return "Client{" + "company=" + getCompany() + ", names=" 
                + getNames() + ", idCardRuc=" + getIdCardRuc() + ", address=" 
                + getAddress() + ", telephone=" + getTelephone() + '}';
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the names
     */
    public String getNames() {
        return names;
    }

    /**
     * @param names the names to set
     */
    public void setNames(String names) {
        this.names = names;
    }

    /**
     * @return the idCardRuc
     */
    public int getIdCardRuc() {
        return idCardRuc;
    }

    /**
     * @param idCardRuc the idCardRuc to set
     */
    public void setIdCardRuc(int idCardRuc) {
        this.idCardRuc = idCardRuc;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    
    
    
    
}
