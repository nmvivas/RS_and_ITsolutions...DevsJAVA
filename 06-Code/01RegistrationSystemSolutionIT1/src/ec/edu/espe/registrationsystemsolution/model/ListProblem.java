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
public class ListProblem {
    List <Problem>lista;

    public ListProblem() {
        lista = new ArrayList<Problem>();
    }
    
    
   public void registProblem(Problem p){
       lista.add(p);
   }
   
  /*public void showProblem(int codigo){
       Iterator it=lista.iterator();
       Problem aux = new Problem();
       while(it.hasNext()){
           aux = (Problem)it.next();
           System.out.println(aux.toString());
           }
       }*/
   }
    

