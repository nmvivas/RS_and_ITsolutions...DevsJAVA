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
public class File {
    private Client client;
    private Problem problem;
    private TypeProblem typeproblem;

    public File(Client client, Problem problem, TypeProblem typeproblem) {
        this.client = client;
        this.problem = problem;
        this.typeproblem = typeproblem;
    }

    @Override
    public String toString() {
        return "File{" + "client=" + client + ", problem=" + problem + ", typeproblem=" + typeproblem + '}';
    }
    
    public Client getClient() {
        return client;
    }

    public Problem getProblem() {
        return problem;
    }

    public TypeProblem getTypeproblem() {
        return typeproblem;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public void setTypeproblem(TypeProblem typeproblem) {
        this.typeproblem = typeproblem;
    }
    
    
    
}
