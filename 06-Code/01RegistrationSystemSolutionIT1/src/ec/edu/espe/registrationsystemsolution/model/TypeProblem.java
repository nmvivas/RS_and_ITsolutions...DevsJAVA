/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

/**
 *
 * @author DEVS_JAVA_KND
 */
public class TypeProblem {
    private String type;
    private int code;

    public TypeProblem(String name, int code) {
        this.type = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "TypeProblem{" + "name=" + type + ", code=" + code + '}';
    }
    

    public String getName() {
        return type;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.type = name;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    
}
