
package lonxitude;

import java.util.Scanner;

public class Clase_Lonxitude {
  
      public Clase_Lonxitude() {
    }   
        public void Lonxituderesultado (int r){
            Scanner leer=new Scanner (System.in);
            double kms, Millas, Pulgadas, RES;
            int OP=r;
            switch (OP){
            case 1:
                System.out.println( "Kms a Millas" );
                System.out.println( "Ingrese las kms" );
                kms = leer.nextDouble();
                RES = kms / 1.609;
                System.out.println( "El resultado es: "+RES+" Millas" );
                break;
            case 2:
                System.out.println( "Millas a kms" );
                System.out.println( "Ingrese las Millas" );
                Millas = leer.nextDouble();
                RES = Millas * 1.609;
                System.out.println( "El resultado es: "+RES+" kms " );
                break;
            case 3:
                System.out.println( "Millas a Pulgadas" );
                System.out.println( "Ingrese las Pulgadas" );
                Millas = leer.nextDouble();
                RES = Millas / 1.609;
                System.out.println( "El resultado es: "+RES+" Pulgas" );
                break;
            case 4:
                System.out.println( "Pulgadas a Millas" );
                System.out.println( "Ingrese las Pulgadas" );
                Pulgadas = leer.nextInt();
                RES = Pulgadas * 1.609;
                System.out.println( "El resultado es: "+RES+" Millas " );
                break;
        }
        }

}
