/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.interfaces;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import ec.edu.espe.registrationsystemsolution.model.Customer;
import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public  interface NewRegister {
    
    public void registAdministrator(Scanner scan);
    public void registCustomer(Scanner scan);
    public void registProblem(Scanner scan);
    public void save(boolean option, String informationData);
    public void createDocument(DBCollection colecctionName, DBObject doc);
    public void readDocument(DBObject dbObject , DBCollection colecctionName);
    
}


