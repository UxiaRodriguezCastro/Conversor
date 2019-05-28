package lonxitude;

import java.util.Scanner;

public class Clase_Temperatura {

    public Clase_Temperatura() {
    }

    public void Temperaturaresultado(int r) {
        Scanner leer = new Scanner(System.in);
        double Celsius, F, K, R, RES;
        int OP = r, Unidad;
        switch (OP) {
            //Hay que hacer un switch dentro de cada opción con los 7 casos posibles
            case 1:
                System.out.println("Celsius");
                Celsius = leer.nextDouble();
                System.out.println("Introduzca la temperatura a convertir");
                System.out.println("1.Fahrenheit\n" + "\n" + "2.Kelvin\n" + "\n" + "3.Rankine\n" + "\n" + "4.Delisle\n" + "\n" + "5.Newton\n" + "\n" + "6.Réamur\n" + "\n" + "7.Romer\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Farenheit");
                            RES = Celsius * 33.8;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Kelvin");
                            RES = Celsius * 274.15;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Rankine");
                            RES = Celsius * 493.47;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Delisle");
                            RES = Celsius * 15000;
                            break;
                        case 5:
                            System.out.println("Newton");
                            RES = Celsius * 0.33000;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Réamur");
                            RES = Celsius * 0.8;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Romer");
                            RES = Celsius * 8.025;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);

                break;
            case 2:
                System.out.println("Farenheit");
                F = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Celsius\n" + "\n" + "2.Kelvin\n" + "\n" + "3.Rankine\n" + "\n" + "4.Delisle\n" + "\n" + "5.Newton\n" + "\n" + "6.Réamur\n" + "\n" + "7.Romer\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Celsius");
                            RES =  F / 33.8;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Kelvin");
                            RES = F * 255.928;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Rankine");
                            RES = F * 460.67;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Delisle");
                            RES = F * 175.83;
                            break;
                        case 5:
                            System.out.println("Newton");
                            RES = (F - 32) * 0.18333;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Réamur");
                            RES = F * (-13.7);
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Romer");
                            RES = F * (-1.54);
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);

                break;
            case 3:
                System.out.println("Kelvin");
                K = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Celsius\n" + "\n" + "2.Farenheit\n" + "\n" + "3.Rankine\n" + "\n" + "4.Delisle\n" + "\n" + "5.Newton\n" + "\n" + "6.Réamur\n" + "\n" + "7.Romer\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Celsius");
                            RES = K * (-272.15);
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Farenheit");
                            RES = K * (-457.87);
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Rankine");
                            RES = K * 1.8;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Delisle");
                            RES = (K -273.15) * 15000;
                            break;
                        case 5:
                            System.out.println("Newton");
                            RES = (K -273.15) * 0.33000 ;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Reamer");
                            RES = K * (-217.72);
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Romer");
                            RES = (K -273.15) * 0.552500;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);

                break;
            case 4:
                System.out.println("Rankine");
                R = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Celsius\n" + "\n" + "2.Fahrenheit\n" + "\n" + "3.Kelvin\n" + "\n" + "4.Delisle\n" + "\n" + "5.Newton\n" + "\n" + "6.Réamur\n" + "\n" + "7.Romer\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Celsius");
                            RES = R * (-272.594);
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Fahrenheit");
                            RES = R * (-458.67);
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Kelvin");
                            RES = R * 0.555556;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Delisle");
                            RES = R * 558.891;
                            break;
                        case 5:
                            System.out.println("Newton");
                            RES = R / 5.45;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Réamur");
                            RES = R * (-218.075);
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Romer");
                            RES = R * 0.0000137149;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);

                break;
            case 5:
                System.out.println("Yardas");
                yardas = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Kilómetros\n" + "\n" + "2.Metros\n" + "\n" + "3.Centímetros\n" + "\n" + "4.Yardas\n" + "\n" + "5.Pés\n" + "\n" + "6.Millas\n" + "\n" + "7.Millas náuticas\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Kilometros");
                            RES = yardas * 0.0009144;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Metros");
                            RES = yardas * 0.9144;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Centímetros");
                            RES = yardas * 91.44;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Pulgadas");
                            RES = yardas * 36;
                            break;
                        case 5:
                            System.out.println("Piés");
                            RES = yardas * 3;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Millas");
                            RES = yardas * 0.000568182;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Millas Náuticas");
                            RES = yardas * 0.000493737;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);

                break;
            case 6:
                System.out.println("Piés");
                pies = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Kilómetros\n" + "\n" + "2.Metros\n" + "\n" + "3.Centímetros\n" + "\n" + "4.Yardas\n" + "\n" + "5.Pés\n" + "\n" + "6.Millas\n" + "\n" + "7.Millas náuticas\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Kilometros");
                            RES = pies * 0.0003048;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Metros");
                            RES = pies * 0.3048;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Centímetros");
                            RES = pies * 30.48;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Pulgadas");
                            RES = pies * 12;
                            break;
                        case 5:
                            System.out.println("Yardas");
                            RES = pies * 0.333333;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Millas");
                            RES = pies * 0.000189394;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Millas Náuticas");
                            RES = pies * 0.000164579;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);
                break;
            case 7:
                System.out.println("Millas");
                millas = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Kilómetros\n" + "\n" + "2.Metros\n" + "\n" + "3.Centímetros\n" + "\n" + "4.Yardas\n" + "\n" + "5.Pés\n" + "\n" + "6.Millas\n" + "\n" + "7.Millas náuticas\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Kilometros");
                            RES = millas * 1.60934;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Metros");
                            RES = millas * 1609.34;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Centímetros");
                            RES = millas * 160934;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Pulgadas");
                            RES = millas * 63360;
                            break;
                        case 5:
                            System.out.println("Yardas");
                            RES = millas * 1760;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Piés");
                            RES = millas * 5280;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Millas Náuticas");
                            RES = millas * 0.868976;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);
                break;
            case 8:
                System.out.println("Millas Náuticas");
                millas_nauticas = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Kilómetros\n" + "\n" + "2.Metros\n" + "\n" + "3.Centímetros\n" + "\n" + "4.Yardas\n" + "\n" + "5.Pés\n" + "\n" + "6.Millas\n" + "\n" + "7.Millas náuticas\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Kilometros");
                            RES = millas_nauticas * 0.539957;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Metros");
                            RES = millas_nauticas * 0.000539957;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Centímetros");
                            RES = millas_nauticas * 0.00000539957;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Pulgadas");
                            RES = millas_nauticas * 0.0000137149;
                            break;
                        case 5:
                            System.out.println("Yardas");
                            RES = millas_nauticas * 0.000493737;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Piés");
                            RES = millas_nauticas * 6076.12;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Millas");
                            RES = millas_nauticas * 1.15078;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);
                break;
        }
    }

}
