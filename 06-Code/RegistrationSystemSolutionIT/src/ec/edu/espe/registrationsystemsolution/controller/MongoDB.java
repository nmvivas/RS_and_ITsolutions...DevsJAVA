/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;

import com.mongodb.BasicDBObject;
import ec.edu.espe.registrationsystemsolution.model.Administrator;
import ec.edu.espe.registrationsystemsolution.model.Customer;
import ec.edu.espe.registrationsystemsolution.model.Problem;
import ec.edu.espe.registrationsystemsolution.model.Technical;
import java.util.ArrayList;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class MongoDB {
    private ArrayList<Administrator> listAdministrator;
    private ArrayList<Customer> listCustomer;
    private ArrayList<Technical> listTechnical;
    private ArrayList<Problem> listProblem;
    BasicDBObject dbObject;
    ConnectionMongodb connection;
    
    public MongoDB(){
        listAdministrator = new ArrayList();
        listCustomer = new ArrayList();
        dbObject = new BasicDBObject();
        connection = new ConnectionMongodb();             
    }
    
    public void createDocument (Administrator admin){
        dbObject.append("ID-Card", admin.getIdCard());
        dbObject.append("Names", admin.getName());
        dbObject.append("Surnames", admin.getSurname());
        dbObject.append("Telephone", admin.getTelephone());
        dbObject.append("E-mail", admin.getEmail());
        connection.getDbCollection().insert(dbObject);
        
    }
    
    public void createDocument (Customer customer){
        dbObject.append("ID-Card",customer.getIdCard());
        dbObject.append("Company",customer.getCompany());
        dbObject.append("Name of Responsable",customer.getName());
        dbObject.append("Surname",customer.getSurname());
        dbObject.append("Telephone",customer.getTelephone());
        dbObject.append("Address",customer.getAddress());
        connection.getDbCollection().insert(dbObject);
    }  
    
    
    public void createDocument ( Technical technical){
        dbObject.append("role", technical.getRole());
        dbObject.append("professionalCategory", technical.getProfessionalCategory());
        connection.getDbCollection().insert(dbObject);
        
    }
    
    public void createDocument (Problem problem){
        
    }

    /**
     * @return the listAdministrator
     */
    public ArrayList<Administrator> getListAdministrator() {
        return listAdministrator;
    }

    /**
     * @param listAdministrator the listAdministrator to set
     */
    public void setListAdministrator(ArrayList<Administrator> listAdministrator) {
        this.listAdministrator = listAdministrator;
    }

    
    
    }
    
    
    
    
