/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lonxitude;

import java.util.Scanner;

/**
 *
 * @author DAM133
 */
public class Clase_Potencia {

    public Clase_Potencia() {
    }

    public void Potenciaresultado(int r) {
        Scanner leer = new Scanner(System.in);
        double V, KW, CV, CF, MW, PL, RES = 0;
        int OP = r, Unidad;
        switch (OP) {
            case 1:
                System.out.println("Vatios");
                V = leer.nextDouble();
                System.out.println("Introduzca la unidad a convertir");
                System.out.println("1.- KW\n" + "\n" + "2.- CV\n" + "\n" + "3.- CF\n" + "\n" + "4.- MW\n" + "\n" + "5.- Pé/libra\n" + "\n" + "9.- Saír");
                do {
                    switch (OP) {
                        case 1:
                            System.out.println("KW");
                            RES = V / 1000;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 2:
                            System.out.println("CV");
                            RES = V * 0.001341;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 3:
                            System.out.println("CF");
                            RES = V / 745.7;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 4:
                            System.out.println("MW");
                            RES = V * 1000;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 5:
                            System.out.println("Pié/Libra");
                            RES = V * 0.7376;
                            System.out.println("El resultado es: " + RES);
                            break;
                    }
                    break;
                } while (Unidad != 9);
                break;

            case 2:
                System.out.println("KW");
                KW = leer.nextDouble();
                System.out.println("Introduzca la unidad a convertir");
                System.out.println("1.- Vatios\n" + "\n" + "2.- CV\n" + "\n" + "3.- CF\n" + "\n" + "4.- MW\n" + "\n" + "5.- Pé/libra\n" + "\n" + "9.- Saír");
                do {
                    switch (OP) {
                        case 1:
                            System.out.println("Vatios");
                            RES = KW * 1000;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 2:
                            System.out.println("CV");
                            RES = KW * 1.34102;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 3:
                            System.out.println("CF");
                            RES = KW * 1.341;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 4:
                            System.out.println("MW");
                            RES = KW * 0.001;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 5:
                            System.out.println("Pié/Libra");
                            RES = KW * 737.56;
                            System.out.println("El resultado es: " + RES);
                            break;
                    }
                    break;
                } while (Unidad != 9);
                break;
            case 3:
                System.out.println("CV");
                CV = leer.nextDouble();
                System.out.println("Introduzca la unidad a convertir");
                System.out.println("1.- Vatios\n" + "\n" + "2.- KW\n" + "\n" + "3.- CF\n" + "\n" + "4.- MW\n" + "\n" + "5.- Pé/libra\n" + "\n" + "9.- Saír");
                do {
                    switch (OP) {
                        case 1:
                            System.out.println("Vatios");
                            RES = CV * 745.7;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 2:
                            System.out.println("KW");
                            RES = CV / 1.341;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 3:
                            System.out.println("CF");
                            RES = CV * 0.986;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 4:
                            System.out.println("MW");
                            RES = CV / 745699.872;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 5:
                            System.out.println("Pié/Libra");
                            RES = CV * 542.48;
                            System.out.println("El resultado es: " + RES);
                            break;
                    }
                    break;
                } while (Unidad != 9);
                break;

            case 4:
                System.out.println("CF");
                CF = leer.nextDouble();
                System.out.println("Introduzca la unidad a convertir");
                System.out.println("1.- Vatios\n" + "\n" + "2.- KW\n" + "\n" + "3.- CV\n" + "\n" + "4.- MW\n" + "\n" + "5.- Pé/libra\n" + "\n" + "9.- Saír");
                do {
                    switch (OP) {
                        case 1:
                            System.out.println("Vatios");
                            RES = CF * 745.7;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 2:
                            System.out.println("KW");
                            RES = CF * 0.75;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 3:
                            System.out.println("CV");
                            RES = CF * 1.01;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 4:
                            System.out.println("MW");
                            RES = CF * 745699.872;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 5:
                            System.out.println("Pié/Libra");
                            RES = CF * 550;
                            System.out.println("El resultado es: " + RES);
                            break;
                    }
                    break;
                } while (Unidad != 9);
                break;

            case 5:
                System.out.println("MW");
                MW = leer.nextDouble();
                System.out.println("Introduzca la unidad a convertir");
                System.out.println("1.- Vatios\n" + "\n" + "2.- KW\n" + "\n" + "3.- CV\n" + "\n" + "4.- CF\n" + "\n" + "5.- Pé/libra\n" + "\n" + "9.- Saír");
                do {
                    switch (OP) {
                        case 1:
                            System.out.println("Vatios");
                            RES = MW * 1000000000;
                            System.out.println("El resultado es: " + RES);
                            break;
                        case 2:
                            System.out.println("KW");
                            RES = MW / 1000000;
                            System.out.println("El resultado es: "+RES);
                            break;
                        case 3:
                            System.out.println("CV");
                            RES = MW / 735498.75;
                            System.out.println("El resultado es: "+RES);
                            break;
                        case 4:
                            System.out.println("CF");
                            RES = MW / 1.34102e-6;
                            System.out.println("El resultado es: "+RES);
                            break;
                        case 5:
                            System.out.println("Pié/Libra");
                            RES = MW / 1341.02;
                            System.out.println("El resultado es: "+RES);
                            break;
                    }
                    break;
                } while (Unidad != 9);
                break;

            case 6:
                System.out.println("Pié/Libra");
                PL = leer.nextDouble();
                System.out.println("Introduzca la unidad a convertir");
                System.out.println("1.- Vatios\n" + "\n" + "2.- KW\n" + "\n" + "3.- CV\n" + "\n" + "4.- CF\n" + "\n" + "5.- MW\n" + "\n" + "9.- Saír");
                do {
                    switch (OP) {
                        case 1:
                            System.out.println("Vatios");
                            RES = PL / 0.7376;
                            System.out.println("El resultado es: "+RES);
                            break;
                        case 2:
                            System.out.println("KW");
                            RES = PL / 737.56;
                            System.out.println("El resultado es: "+RES);
                            break;
                        case 3:
                            System.out.println("CV");
                            RES = PL / 542.48;
                            System.out.println("El resultado es: "+RES);
                            break;
                        case 4:
                            System.out.println("CF");
                            RES = PL / 550;
                            System.out.println("El resultado es: "+RES);
                            break;
                        case 5:
                            System.out.println("MW");
                            RES = PL * 1341.02;
                            System.out.println("El resultado es: "+RES);
                            break;
                    }
                    break;
                } while (Unidad != 9);
                break;

        }
    }

}
