/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import com.mongodb.BasicDBObject;
import ec.edu.espe.registrationsystemsolution.model.ConnectionMongodb;
import ec.edu.espe.registrationsystemsolution.model.Problem;
import java.util.ArrayList;

/**
 *
 * @author ruben
 */
public class ProblemList {
    private ArrayList<Problem> problemList;
    BasicDBObject document;
    ConnectionMongodb connection;

    public ProblemList() {
        problemList = new ArrayList();
        connection = new ConnectionMongodb();
        document = new BasicDBObject();
    }
}
