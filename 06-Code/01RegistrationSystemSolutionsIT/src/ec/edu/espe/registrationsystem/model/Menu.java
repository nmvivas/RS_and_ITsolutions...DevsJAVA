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
    
    public Menu(Integer opcion1, Integer opcion2){
        
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        

        
}

    @Override
    public String toString() {
        return "Menu{" + "opcion1=" + opcion1 + ", opcion2=" + opcion2 + '}';
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

}

