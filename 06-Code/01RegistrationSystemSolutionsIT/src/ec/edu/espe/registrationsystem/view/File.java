/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystem.view;

/**
 *
 * @author KAREN VELASCO, NATALIA VIVAS, CHARLES ZAMBRANO
 */
public class File {
    private Client client;
    private Problem problem;
    private TypeProblem typeProblem;

    public File(Client client, Problem problem, TypeProblem typeProblem) {
        this.client = client;
        this.problem = problem;
        this.typeProblem = typeProblem;
    }
    
}
