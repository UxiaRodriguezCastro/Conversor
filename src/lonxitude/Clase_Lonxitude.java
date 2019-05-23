package lonxitude;

import java.util.Scanner;

public class Clase_Lonxitude {

    public Clase_Lonxitude() {
    }

    public void Lonxituderesultado(int r) {
        Scanner leer = new Scanner(System.in);
        double kms, metros, cms, pulgadas, yardas, pies, millas, millas_nauticas, RES;
        int OP = r, Unidad;
        //Opción 1
        switch (OP) {
            //Hay que hacer un switch dentro de cada opción con los 7 casos posibles
            case 1:
                System.out.println("Kilómetros");
                kms = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Metros\n" + "\n" + "2.Cms\n" + "\n" + "3.Pulgadas\n" + "\n" + "4.Yardas\n" + "\n" + "5.Pés\n" + "\n" + "6.Millas\n" + "\n" + "7.Millas náuticas\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Metros");
                            RES = kms * 1000;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Centímetros");
                            RES = kms * 100000;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Pulgadas");
                            RES = kms * 39370.1;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Yardas");
                            RES = kms * 1093.61;
                            break;
                        case 5:
                            System.out.println("Piés");
                            RES = kms * 3280.84;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Millas");
                            RES = kms * 0.621371;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Millas Náuticas");
                            RES = kms * 0.539957;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);

                break;
            case 2:
                System.out.println("Metros");
                metros = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Kilómetros\n" + "\n" + "2.Cms\n" + "\n" + "3.Pulgadas\n" + "\n" + "4.Yardas\n" + "\n" + "5.Pés\n" + "\n" + "6.Millas\n" + "\n" + "7.Millas náuticas\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Kilometros");
                            RES = metros * 0.001;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Centímetros");
                            RES = metros * 100;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Pulgadas");
                            RES = metros * 39.3701;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Yardas");
                            RES = metros * 1.09361;
                            break;
                        case 5:
                            System.out.println("Piés");
                            RES = metros * 3.28084;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Millas");
                            RES = metros * 0.000621371;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Millas Náuticas");
                            RES = metros * 0.000539957;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);

                break;
            case 3:
                System.out.println("Centímetros");
                cms = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Kilómetros\n" + "\n" + "2.Metros\n" + "\n" + "3.Pulgadas\n" + "\n" + "4.Yardas\n" + "\n" + "5.Pés\n" + "\n" + "6.Millas\n" + "\n" + "7.Millas náuticas\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Kilometros");
                            RES = cms * 0.00001;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Metros");
                            RES = cms * 0.01;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Pulgadas");
                            RES = cms * 0.393701;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Yardas");
                            RES = cms * 0.0109361;
                            break;
                        case 5:
                            System.out.println("Piés");
                            RES = cms * 0.0328084;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Millas");
                            RES = cms * 0.00000621371;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Millas Náuticas");
                            RES = cms * 0.00000539957;
                            System.out.println("El resultado es:" + RES);
                            break;
                    }
                } while (Unidad != 8);

                break;
            case 4:
                System.out.println("Pulgadas");
                pulgadas = leer.nextDouble();
                System.out.println("Introduzca la longitud a convertir");
                System.out.println("1.Kilómetros\n" + "\n" + "2.Metros\n" + "\n" + "3.Centímetros\n" + "\n" + "4.Yardas\n" + "\n" + "5.Pés\n" + "\n" + "6.Millas\n" + "\n" + "7.Millas náuticas\n" + "\n" + "8.Saír");
                Unidad = leer.nextInt();
                do {
                    switch (Unidad) {
                        case 1:
                            System.out.println("Kilometros");
                            RES = pulgadas * 0.0000254;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 2:
                            System.out.println("Metros");
                            RES = pulgadas * 0.0254;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 3:
                            System.out.println("Centímetros");
                            RES = pulgadas * 2.54;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 4:
                            System.out.println("Yardas");
                            RES = pulgadas * 0.0277778;
                            break;
                        case 5:
                            System.out.println("Piés");
                            RES = pulgadas * 0.0833333;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 6:
                            System.out.println("Millas");
                            RES = pulgadas * 0.000015782;
                            System.out.println("El resultado es:" + RES);
                            break;
                        case 7:
                            System.out.println("Millas Náuticas");
                            RES = pulgadas * 0.0000137149;
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
