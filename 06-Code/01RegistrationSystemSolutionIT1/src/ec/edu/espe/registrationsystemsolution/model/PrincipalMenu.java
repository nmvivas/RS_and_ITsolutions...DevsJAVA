/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.model;

import java.util.Scanner;

/**
 *
 * @author karen
 */
public class PrincipalMenu {
  
    private int options;
    
    Scanner leer = new Scanner(System.in);


    System.out.println("Menu por consola");
    System.out.println("1.- Registrar nuevo empleado");
    System.out.println("2.- Obtener datos de contacto de un empleado");
    System.out.println("3.- Listar todos los empleados que cumplan anios en cierta fecha");
    System.out.println("4.- Obtener el presupuesto total");
    System.out.println("Ingrese la accion a realizar: "); //Pretendo que el usuario escriba el numero de  opcion
    opciones=leer.nextInt();

    switch(opciones) {
    case 1: 

    break;

    case 2:

    break;

    case 3: 

    break;

    case 4: 

    break;

    default:
    System.out.println ("Numero no valido"); 
    }
  
}
