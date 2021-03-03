/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import ec.edu.espe.registrationsystemsolution.data.Administrator;
import ec.edu.espe.registrationsystemsolution.data.ConnectionMongodb;
import ec.edu.espe.registrationsystemsolution.data.Customer;
import java.util.ArrayList;

/**
 *
 * @author Meli
 */
public class AdminList {
    private ArrayList<Administrator> adminList;
    BasicDBObject document;
    ConnectionMongodb connection;

    public AdminList() {
        adminList = new ArrayList();
        connection = new ConnectionMongodb();
        document = new BasicDBObject();

    }

    /**
     * @return the adminList
     */
    public ArrayList<Administrator> getAdminList() {
        return adminList;
    }

    /**
     * @param adminList the adminList to set
     */
    public void setAdminList(ArrayList<Administrator> adminList) {
        this.adminList = adminList;
    }
    
    
    public boolean insertA(Administrator admin) {
        boolean aux = true;
       document.append("ID-Card", admin.getIdCard());
       document.append("Names", admin.getNames());
       document.append("Surnames", admin.getSurnames());
       document.append("Telephone", admin.getTelephone());
       document.append("E-mail", admin.getEmail());
        connection.getDbCollection().insert(document);
        for (int i = 0; i < adminList.size(); i++) {
            if (admin.getIdCard().equals(adminList.get(i).getIdCard())) {
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

    public boolean readA() {
        boolean aux;
        DBCursor cursor = connection.getDbCollection().find();
        while (cursor.hasNext()) {
            Administrator admin = new Administrator((BasicDBObject) cursor.next());
            adminList.add(admin);
        }
        aux = true;
        return aux;
    }

    public boolean UpdateA(String IdCard, String company, String name, String surname) {
        boolean aux = false;
        BasicDBObject update = new BasicDBObject();
        update.put("IDCard", IdCard);
        DBCursor cursor = connection.getDbCollection().find(update);
        while (cursor.hasNext()) {
           DBObject ObjectC = cursor.next();
            ObjectC.put("IDCard", IdCard);
            ObjectC.put("Name", name);
            ObjectC.put("Surname", surname);
            ObjectC.put("Company", company);
            connection.getDbCollection().save(ObjectC);
            aux = true;
        }
        return aux;
    }
    public boolean deleteA(String nameC){
         boolean aux=false;
        BasicDBObject delete=new BasicDBObject();
        delete.put("Nombre", nameC);
        DBCursor cursor=connection.getDbCollection().find(delete);
        if(cursor.hasNext()){
           DBObject  objetoC=cursor.next();
            connection.getDbCollection().remove(objetoC);
            aux=true;
        }
        return aux;
     }

    
    
}
