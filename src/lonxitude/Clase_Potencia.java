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
        public void Potenciaresultado (int r){
            Scanner leer=new Scanner (System.in);
            double KW, CV,FtLb, RES;
            int OP=r;
            switch (OP){
            case 1:
                System.out.println( "KW a CV" );
                System.out.println( "Ingrese los KW" );
                KW = leer.nextDouble();
                RES = KW * 1.341;
                System.out.println( "El resultado es: "+RES+" CV" );
                break;
            case 2:
                System.out.println( "CV a KW" );
                System.out.println( "Ingrese los CV" );
                CV = leer.nextDouble();
                RES = CV / 1.341;
                System.out.println( "El resultado es: "+RES+" KW " );
                break;
             case 3:
                System.out.println( "KW a Ft/Lb" );
                System.out.println( "Ingrese los KW" );
                KW = leer.nextDouble();
                RES = KW * 44253.73;
                System.out.println( "El resultado es: "+RES+" Ft/Lb" );
                break;
            case 4:
                System.out.println( "Ft/Lb a KW" );
                System.out.println( "Ingrese las Ft/Lb" );
                FtLb = leer.nextInt();
                RES = FtLb / 44253.73;
                System.out.println( "El resultado es: "+RES+" KW " );
                break;
        }
        }

}
