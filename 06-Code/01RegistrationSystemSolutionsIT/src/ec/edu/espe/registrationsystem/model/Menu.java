/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author CHARLES
 */
public class Menu {
    
    private Integer opcion1;
    private Integer opcion2;
    private Integer opcion3;
    
    public Menu(Integer opcion1, Integer opcion2, Integer opcion3){
        
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        
     System.out.println(" Welcome to the System ");
     System.out.println(" Select 1 : If you want to create a user administrator ");
     
     System.out.println(" Select 2 : If you want to login ");
        
}

    @Override
    public String toString() {
        return "Menu{" + "opcion1=" + opcion1 + ", opcion2=" + opcion2 + 
                ", opcion3=" + opcion3 + '}';
    }

    public Integer getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(Integer opcion1) {
        this.opcion1 = opcion1;
    }

    public Integer getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(Integer opcion2) {
        this.opcion2 = opcion2;
    }

    public Integer getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(Integer opcion3) {
        this.opcion3 = opcion3;
    }
    
   

}

