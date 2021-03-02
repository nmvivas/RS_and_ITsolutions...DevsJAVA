/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

import com.mongodb.BasicDBObject;
import com.mongodb.connection.Connection;
import ec.edu.espe.registrationsystemsolution.data.ConnectionMongodb;
import ec.edu.espe.registrationsystemsolution.data.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruben
 */
public class CostumerList {
    private ArrayList<Customer> customerList;
    BasicDBObject document;
    ConnectionMongodb connection;
    
    public CostumerList ()
    {
        customerList = new ArrayList();
        connection = new ConnectionMongodb();
        document = new BasicDBObject();
        
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public boolean insertC (Customer customer)
    {
        boolean aux = true;
        document.append("ID-Card",customer.getIdCard());
        document.append("Company",customer.getCompany());
        document.append("Name of Responsable",customer.getName());
        document.append("Surname",customer.getSurname());
        document.append("Telephone",customer.getTelephone());
        document.append("Address",customer.getAddress());
        for(int i=0;i<customerList.size();i++){
                        if(customer.getIdCard().equals(customerList.get(i).getIdCard())){
                                aux=false;
                               break;
                        }else{ 
                               aux=true;
                        }
                }
                if(aux==true){
                        connection.getDbCollection().insert(document);
                }
                return aux;
    }
    
}
