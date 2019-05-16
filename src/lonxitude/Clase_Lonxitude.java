
package lonxitude;

import java.util.Scanner;

public class Clase_Lonxitude {
  
      public Clase_Lonxitude() {
    }   
        public void Lonxituderesultado (int r){
            Scanner leer=new Scanner (System.in);
            double kms, metros, cms, pulgadas, yardas, pies, millas, millas_nauticas, RES;
            int OP=r;
            //Opción 1
            switch (OP){
                //Hay que hacer un switch dentro de cada opción con los 7 casos posibles
                case 1:
                    System.out.println( "Kilómetros" );
                    kms = leer.nextDouble();
                    System.out.println( "Introduzca la longitud a convertir" );
                    break;
                case 2:
                    System.out.println( "Metros" );
                    metros = leer.nextDouble();
                    System.out.println( "Introduzca la longitud a convertir" );
                    break;
                case 3:
                    System.out.println( "Centímetros" );
                    cms = leer.nextDouble();
                    System.out.println( "Introduzca la longitud a convertir" );
                    break;
                case 4:
                    System.out.println( "Pulgadas" );
                    pulgadas = leer.nextDouble();
                    System.out.println( "Introduzca la longitud a convertir" );
                    break;
                case 5:
                    System.out.println( "Yardas" );
                    yardas = leer.nextDouble();
                    System.out.println( "Introduzca la longitud a convertir" );
                    break;
                case 6:
                    System.out.println( "Piés" );
                    pies = leer.nextDouble();
                    System.out.println( "Introduzca la longitud a convertir" );
                    break;
                case 7:
                    System.out.println( "Millas" );
                    millas = leer.nextDouble();
                    System.out.println( "Introduzca la longitud a convertir" );
                    break;
                case 8:
                    System.out.println( "Millas Náuticas" );
                    millas_nauticas = leer.nextDouble();
                    System.out.println( "Introduzca la longitud a convertir" );
                    break;
            }
        }
}
