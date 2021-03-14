/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.utils;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class ConnectionMongodb {

    private MongoClient mongoClient;
    private MongoClientURI mongoCURI;
    private DB database;
    private DBCollection dbCollection;
    private Scanner scan = new Scanner(System.in);

    public ConnectionMongodb() {
        try {
            String nameDatabase;
            String nameCollection;
            mongoCURI = new MongoClientURI("mongodb+srv://user_devsknd:1234.devsknd"
                    + "@project0.tqftq.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
            mongoClient = new MongoClient(getMongoCURI());
            //System.out.println(" Enter the name of the database");
            //nameDatabase = scan.nextLine();
            database = mongoClient.getDB("New");
            //System.out.println(" Enter the name of the collection");
            //nameCollection = scan.nextLine();
            dbCollection = database.getCollection("Request");
            JOptionPane.showMessageDialog(null, "Successful Connection");
        } catch(Exception e) {
            System.err.println(e);   
        }

    }

  
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    
    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    
    public MongoClientURI getMongoCURI() {
        return mongoCURI;
    }

    
    public void setMongoCURI(MongoClientURI mongoCURI) {
        this.mongoCURI = mongoCURI;
    }

    
    public DB getDatabase() {
        return database;
    }

    
    public void setDatabase(DB database) {
        this.database = database;
    }

    
    public DBCollection getDbCollection() {
        return dbCollection;
    }

   
    public void setDbCollection(DBCollection dbCollection) {
        this.dbCollection = dbCollection;
    }

    public Scanner getScan() {
        return scan;
    }
    
    public void setScan(Scanner scan) {
        this.scan = scan;
    }

}
