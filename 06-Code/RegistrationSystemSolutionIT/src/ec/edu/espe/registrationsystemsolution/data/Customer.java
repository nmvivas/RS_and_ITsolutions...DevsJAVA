/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Customer extends Fellow {

    private String company;
    private String address;

    public Customer(String company, String address, int idCard, String names, String surnames, int telephone) {
        super(idCard, names, surnames, telephone);
        this.company = company;
        this.address = address;
    }
   

    @Override
    public String toString() {
        return "Customer{" + "company=" + company + ", address=" + 
                address + '}';
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

}
