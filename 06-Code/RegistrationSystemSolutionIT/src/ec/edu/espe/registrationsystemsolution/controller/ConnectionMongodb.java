/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.controller;
 
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.Scanner;

      
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
    
    public ConnectionMongodb (){
        String nameDatabase;
        String nameCollection;
        mongoCURI = new MongoClientURI("mongodb+srv://user2_nathy21:123456789.Vivas@cluster0.ra3w0.mongodb.net/<dbname>?retryWrites=true&w=majority");
        mongoClient = new MongoClient(getMongoCURI());
        System.out.println(" Enter the name of the database");
        nameDatabase = scan.nextLine();
        database = mongoClient.getDB(nameDatabase);
        System.out.println(" Enter the name of the collection");
        nameCollection = scan.nextLine();
        dbCollection = database.getCollection(nameCollection);
        
    }

    /**
     * @return the mongoClient
     */
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    /**
     * @param mongoClient the mongoClient to set
     */
    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    /**
     * @return the mongoCURI
     */
    public MongoClientURI getMongoCURI() {
        return mongoCURI;
    }

    /**
     * @param mongoCURI the mongoCURI to set
     */
    public void setMongoCURI(MongoClientURI mongoCURI) {
        this.mongoCURI = mongoCURI;
    }

    /**
     * @return the database
     */
    public DB getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(DB database) {
        this.database = database;
    }

    /**
     * @return the dbCollection
     */
    public DBCollection getDbCollection() {
        return dbCollection;
    }

    /**
     * @param dbCollection the dbCollection to set
     */
    public void setDbCollection(DBCollection dbCollection) {
        this.dbCollection = dbCollection;
    }

    /**
     * @return the scan
     */
    public Scanner getScan() {
        return scan;
    }

    /**
     * @param scan the scan to set
     */
    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    
    
    
    
}
