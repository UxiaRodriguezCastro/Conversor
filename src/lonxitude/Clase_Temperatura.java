package lonxitude;

import java.util.Scanner;

public class Clase_Temperatura {

    public Clase_Temperatura() {
    }

    public void Temperaturaresultado(int r) {
        Scanner leer = new Scanner(System.in);
        double Celsius, F, K, RES;
        int OP = r;
        switch (OP) {
            case 1:
                System.out.println("Celsius a Fahrenheit");
                System.out.println("Ingrese Celsius");
                Celsius = leer.nextDouble();
                RES = (Celsius*1.8)+32;
                System.out.println("El resultado es: " + RES + " Celsius");
                break;
            case 2:
                System.out.println("Fahrenheit a Celsius");
                System.out.println("Ingrese Farenheit");
                F = leer.nextDouble();
                RES = (F-32)/1.8;
                System.out.println("El resultado es: " + RES + " Farenheit ");
                break;
            case 3:
                System.out.println("Celsius a Kelvin");
                System.out.println("Ingrese Celsius");
                Celsius = leer.nextDouble();
                RES = Celsius+273.15;
                System.out.println("El resultado es: " + RES + " Kelvin");
                break;
            case 4:
                System.out.println("Kelvin a Celsius");
                System.out.println("Ingrese Kelvin");
                K = leer.nextInt();
                RES = K-273.15;
                System.out.println("El resultado es: " + RES + " Celsius ");
                break;
        }
    }

}
