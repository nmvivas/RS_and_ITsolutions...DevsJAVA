/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

/**
 *
 * @author karen
 */
public class TypeProblem {
    private String name;
    private int code;

    public TypeProblem(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "TypeProblem{" + "name=" + name + ", code=" + code + '}';
    }
    

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
}
