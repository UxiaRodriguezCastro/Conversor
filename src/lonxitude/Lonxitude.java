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
        String fin = "" ;
        do{
        Clase_Lonxitude a= new Clase_Lonxitude();
        System.out.println("MENÚ:");
        System.out.println("1.LONGITUD");
        System.out.println("2.TEMPERATURA");
        System.out.println("3.POTENCIA");
        System.out.println("0.SALIR");
        Scanner escaner = new Scanner(System.in);
        int respuesta = escaner.nextInt();
        fin = "" + respuesta;
        if (!fin.equals("0")) {
            if (fin.equals("1")) {
                int r=1;
                do{
                System.out.println("");
                System.out.println("LONGITUD:");
                System.out.println("");
                System.out.println("Elije una opción:");
                System.out.println("");
                System.out.println("1.Transformar Kms a Millas\n"+"2.Transformar Millas a Kms\n"+"3.Transformar Millas a Pulgadas\n"+"4.Transformar Pulgadas a Millas\n"+"0.Volver ó menú anterior");
                r= escaner.nextInt();
                a.Lonxituderesultado(r);
                }while (r>0&&r<5);
            }
            if (fin.equals("2")) {
                System.out.println("");
                System.out.println("TEMPERATURA:");
                System.out.println("");
                System.out.println("Elije una opción:");
                System.out.println("");
                System.out.println("1.Celsius a Fahrenheit\n"+"2.Fahrenheit a Celsius\n"+"3.Celsius a Kelvin\n"+"4.Kelvin a Celsius"+"0.Volver ó menú anterior");

            }
            if (fin.equals("3")) {
                System.out.println("");
                System.out.println("POTENCIA:");
                System.out.println("");
                System.out.println("Elije una opción:");
                System.out.println("");
                System.out.println("1.KW a CV\n"+"2.CV a KW\n"+"3.KW a Ft/Lb\n"+"4.Ft/Lb a KW\n"+"0.Volver ó menú anterior");

            }
        }
        }while(fin!="0");
    }
}
