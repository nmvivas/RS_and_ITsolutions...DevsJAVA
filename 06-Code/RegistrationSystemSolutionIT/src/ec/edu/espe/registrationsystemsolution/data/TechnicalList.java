/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import ec.edu.espe.registrationsystemsolution.model.ConnectionMongodb;
import ec.edu.espe.registrationsystemsolution.model.Customer;
import ec.edu.espe.registrationsystemsolution.model.Technical;
import java.util.ArrayList;

/**
 *
 * @author ruben
 */
public class TechnicalList {
    private ArrayList<Technical> technicalList;
    BasicDBObject document;
    ConnectionMongodb connection;

    public TechnicalList() {
        technicalList = new ArrayList();
        connection = new ConnectionMongodb();
        document = new BasicDBObject();

    }
/**
     * @return the technicalList
     */
    public ArrayList<Technical> getTechnicalList() {
        return technicalList;
    }

    /**
     * @param technicalList the technicalList to set
     */
    public void setTechnicalList(ArrayList<Technical> technicalList) {
        this.technicalList = technicalList;
    }
    

    public boolean insertT(Technical technical) {
        boolean aux = true;
        document.append("Role", technical.getRole());
        document.append("Professional Category", technical.getProfessionalCategory());
        document.append("Id-Card", technical.getIdCard());
        document.append("Names", technical.getName());
        document.append("Surenames", technical.getSurname());
        document.append("Telephone", technical.getTelephone());
        connection.getDbCollection().insert(document);
        for (int i = 0; i < getTechnicalList().size(); i++) {
            if (technical.getIdCard().equals(getTechnicalList().get(i).getIdCard())) {
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

    public boolean readT() {
        boolean aux;
        DBCursor cursor = connection.getDbCollection().find();
        while (cursor.hasNext()) {
            Technical technical = new Technical((BasicDBObject) cursor.next());
            getTechnicalList().add(technical);
        }
        aux = true;
        return aux;
    }

    public boolean UpdateT(String IdCard, String role, String name, String surname) {
        boolean aux = false;
        BasicDBObject update = new BasicDBObject();
        update.put("IDCard", IdCard);
        DBCursor cursor = connection.getDbCollection().find(update);
        while (cursor.hasNext()) {
            DBObject ObjectC = cursor.next();
            ObjectC.put("IDCard", IdCard);
            ObjectC.put("Name", name);
            ObjectC.put("Surname", surname);
            ObjectC.put("Role", role);
            connection.getDbCollection().save(ObjectC);
            aux = true;
        }
        return aux;
    }
    public boolean deleteT(String nameT){
         boolean aux=false;
        BasicDBObject delete=new BasicDBObject();
        delete.put("Nombre", nameT);
        DBCursor cursor=connection.getDbCollection().find(delete);
        if(cursor.hasNext()){
            DBObject objetoC=cursor.next();
            connection.getDbCollection().remove(objetoC);
            aux=true;
        }
        return aux;
     }

    
}
