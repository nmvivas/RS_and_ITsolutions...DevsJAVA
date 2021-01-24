/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.registrationsystemsolution.view;


import ec.edu.espe.filemanager.utils.Data;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;



/**
 
 * Code Consistency
 * The consistency of the code is quite good since it is very organized and structured, the code is not very neglected, there are small errors in the code for example in some variables and in the methods some are not in the singular.
   In the classes it is necessary to declare the other methods that arise in the class diagram.
   Rating 50/50

 * Validation(System vs UC vs IEE830)
 * 
 * with the class diagram it also varies since in the programmed classes some functions are missing that are established in the class diagram.
 * A large part if it consists of the IEEE 830 format but in the code it is a client and in the IEEE 830 Format it is costumer.
 * the functions can be fulfilled by anyone unlike what it says in the 830 that only the administrator can
 *  Rating 19/20
 * 
 * Verification(Running + Json)
 * The project if it is running satisfactorily meeting the minimum requirements which are to save the data in Json format.
   Rating 100/100

* GitHub                                                  100
Problem Definition                                        17
Object List                                               20
Use Case Diagram                                          18
Class Diagram                                             50
IEEE830                                                   20
Letter of Intent                                          20
Code Consistency                                          50
Validation (System vs UC vs IEEE830)                      19
Verification (Running + JsonFiles)                        100
Total                                                     414 

* 
* 
* 
 * @author DEVS_JAVA_KND
 */
public class Main {
    
    public static void main(String[] args) throws IOException, InterruptedException {

        Date date = new Date();
        System.out.println(date + "\n");
        FatherMenu menus = new FatherMenu();
        menus.printWelcomeMenu();
        menus.welcomeOptions();
    }
   
}
