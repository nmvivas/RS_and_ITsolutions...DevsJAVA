/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

import java.util.Scanner;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class TypeProblem {
    
    private String name;
    private int code;
    
    
    public void assignType(){
        
    }


    public void registTypeProblem(){
        Scanner enterData = new Scanner(System.in);
        System.out.println(" Regist Type Problem \n");
        System.out.println(" Enter name of type problem:  ");
        name = enterData.nextLine();
        System.out.println(" Enter code of type problem:  ");
        code = enterData.nextInt();
        
    }
    @Override
    public String toString() {
        return "TypeProblem{" + "name=" + getName() + ", code=" + getCode() + '}';
    }
    
    public TypeProblem(String name, int code) {
        
        this.name = name;
        this.code = code;
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }
    
        
}
