/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author karen
 */
public class ListClient {
    List <Client>lista;

    public ListClient() {
        lista = new ArrayList<Client>();
    }
    
    
   public void registProblem(Client c){
       lista.add(c);
   }
   
   public void showClient(int codigo){
       Iterator it=lista.iterator();
       Client aux = new Client();
       while(it.hasNext()){
           aux = (Client)it.next();
           System.out.println(aux.toString());
           }
       }
    
}
