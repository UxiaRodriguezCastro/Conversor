/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lonxitude;

import java.util.Scanner;

/**
 *
 * @author DAM124
 */
public class Lonxitude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Menu:");
        System.out.println("1.Conversor");
        System.out.println("0. Salir");
        Scanner escaner= new Scanner(System.in);
        int respuesta= escaner.nextInt();
        String fin=""+respuesta;
        if(!fin.equals("0")){
            System.out.println("");
            System.out.println("CONVERSOR");
            System.out.println("");
            System.out.println("1. Transformar Kms a Millas\n"+"\n" +"2. Transformar Millas a Kms\n"+"\n"+"3. Transformar Millas a Pulgadas\n"+"\n"+"4. Transformar Pulgadas a Millas\n"+"\n"+"0. Volver ó menú anterior");
          
           
        }
    }
    
}
