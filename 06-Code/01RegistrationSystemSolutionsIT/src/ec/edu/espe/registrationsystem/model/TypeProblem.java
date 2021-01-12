/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.model;

/**
 *
 * @author NATALIA
 */
public class TypeProblem {
    
    private String name;
    private int code;
    
    
    public void assignType(){
        
    }

    public TypeProblem(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "TypeProblem{" + "name=" + getName() + ", code=" + getCode() + '}';
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
