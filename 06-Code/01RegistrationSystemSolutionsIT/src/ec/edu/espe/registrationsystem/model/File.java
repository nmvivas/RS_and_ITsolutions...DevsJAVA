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
public class File {
    
    private Client client;
    private Problem problem;
    private TypeProblem typeproblem;

    public File(Client client, Problem problem, TypeProblem typeproblem) {
        this.client = client;
        this.problem = problem;
        this.typeproblem = typeproblem;
    }
    
    public void registFile(){
        Scanner enterData = new Scanner(System.in);
        System.out.println(" Regist File \n");
        System.out.println(" Enter client:  ");
        
        System.out.println("");
        
    }

    @Override
    public String toString() {
        return "File{" + "client=" + getClient() + ", problem=" + getProblem() + ", typeproblem=" + getTypeproblem() + '}';
    }
    
        
    public void saveFile(){
        
    }
    public void readFile(){
        
    }
    
    public void showFile(){
        
    }
    
    public void searchFile(){
        
    }
    public void removeFile(){
        
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the problem
     */
    public Problem getProblem() {
        return problem;
    }

    /**
     * @param problem the problem to set
     */
    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    /**
     * @return the typeproblem
     */
    public TypeProblem getTypeproblem() {
        return typeproblem;
    }

    /**
     * @param typeproblem the typeproblem to set
     */
    public void setTypeproblem(TypeProblem typeproblem) {
        this.typeproblem = typeproblem;
    }
    
            
    
    
    
}
