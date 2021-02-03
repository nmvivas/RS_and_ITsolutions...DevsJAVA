/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

/**
 *The methods described in the class diagram are missing
 * @author DEVS_JAVA_KND
 */
public class File {
    private Client client;
    private Problem problem;
    private TypeProblem typeProblem;

    public File(Client client, Problem problem, TypeProblem typeproblem) {
        this.client = client;
        this.problem = problem;
        this.typeProblem = typeProblem;
    }

    @Override
    public String toString() {
        return "File{" + "client=" + client + ", problem=" + problem + ", typeproblem=" + typeProblem + '}';
    }
    
    public Client getClient() {
        return client;
    }

    public Problem getProblem() {
        return problem;
    }

    public TypeProblem getTypeProblem() {
        return typeProblem;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public void setTypeProblem(TypeProblem typeProblem) {
        this.typeProblem = typeProblem;
    }
    
    
    
}
