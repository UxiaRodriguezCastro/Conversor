
package lonxitude;

import java.util.Scanner;

public class Clase_Lonxitude {
  
      public Clase_Lonxitude() {
    }   
        public void Lonxituderesultado (int r){
            Scanner leer=new Scanner (System.in);
            int OP=r;
            switch (OP){
            case 1:
                double kms, Millas, RES;
                System.out.println( "Kms a Millas" );
                System.out.println( "Ingrese las kms" );
                kms = leer.nextDouble();
                RES = kms / 1.609;
                System.out.println( "El resultado es: "+RES+" Millas" );
                break;
            case 2:
                System.out.println( "Millas a kms" );
                System.out.println( "Ingrese las Millas" );
                Millas = leer.nextInt();
                RES = Millas * 1.609;
                System.out.println( "El resultado es: "+RES+" kms " );
                break;
        }
        }

}
