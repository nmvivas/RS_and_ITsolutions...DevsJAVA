/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.data;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import ec.edu.espe.registrationsystemsolution.utils.ConnectionMongodb;
import ec.edu.espe.registrationsystemsolution.model.User;
import java.util.ArrayList;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class UserList {

    ArrayList<User> userList;
    BasicDBObject document;
    ConnectionMongodb connection;

    public UserList() {
        userList = new ArrayList();
        document = new BasicDBObject();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public boolean insertU(User user) {
        boolean aux = true;
        document.append("Username", user.getUsername());
        document.append("Password", user.getPassword());

        for (int i = 0; i < userList.size(); i++) {
            if (user.getUsername().equals(userList.get(i).getUsername())) {
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

    public boolean readU() {
        boolean aux;
        DBCursor cursor = connection.getDbCollection().find();
        while (cursor.hasNext()) {
            User user = new User((BasicDBObject) cursor.next());
            userList.add(user);
        }
        aux = true;
        return aux;
    }

    public boolean deleteList() {
        boolean aux;
        userList.clear();
        aux = true;
        return aux;
    }
}
