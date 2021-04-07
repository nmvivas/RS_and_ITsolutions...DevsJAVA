/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import ec.edu.espe.registrationsystemsolution.utils.ConnectionMongodb;
import ec.edu.espe.registrationsystemsolution.model.Customer;
import java.util.ArrayList;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class Costumer {

    private ArrayList<Customer> customerList;
    BasicDBObject document;
    ConnectionMongodb connection;

    public Costumer() {
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

    public boolean insertC(Customer customer) {
        boolean aux = true;
        document.append("ID-Card", customer.getIdCard());
        document.append("Company", customer.getCompany());
        document.append("Name of Responsable", customer.getName());
        document.append("Surname", customer.getSurname());
        document.append("Telephone", customer.getTelephone());
        document.append("Address", customer.getAddress());
        for (int i = 0; i < customerList.size(); i++) {
            if (customer.getIdCard().equals(customerList.get(i).getIdCard())) {
                aux = false;
                break;
            } else {
                aux = true;
            }
        }
        if (aux == true) {
            connection.getDbCollection().insert(document);
        }
        return aux;
    }


    public boolean UpdateC(String IdCard, String company, String name, String surname) {
        boolean aux = false;
        BasicDBObject update = new BasicDBObject();
        update.put("IDCard", IdCard);
        DBCursor cursor = connection.getDbCollection().find(update);
        while (cursor.hasNext()) {
            DBObject ObjectC = cursor.next();
            ObjectC.put("IDCard", company);
            ObjectC.put("Name", name);
            ObjectC.put("Surname", surname);
            ObjectC.put("Company", company);
            connection.getDbCollection().save(ObjectC);
            aux = true;
        }
        return aux;
    }
    public boolean deleteC(String nameC){
         boolean aux=false;
        BasicDBObject delete=new BasicDBObject();
        delete.put("Nombre", nameC);
        DBCursor cursor=connection.getDbCollection().find(delete);
        if(cursor.hasNext()){
            DBObject objetoC=cursor.next();
            connection.getDbCollection().remove(objetoC);
            aux=true;
        }
        return aux;
     }

}
