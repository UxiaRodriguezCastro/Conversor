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
public class Calse_Potencia {
     public Calse_Potencia() {
    }   
        public void Potenciaresultado (int r){
            Scanner leer=new Scanner (System.in);
            double KW, CV, RES;
            int OP=r;
            switch (OP){
            case 1:
                System.out.println( "KW a CV" );
                System.out.println( "Ingrese las CV" );
                KW = leer.nextDouble();
                RES = KW * 1.341;
                System.out.println( "El resultado es: "+RES+" CV" );
                break;
            case 2:
                System.out.println( "CV a KW" );
                System.out.println( "Ingrese las CV" );
                CV = leer.nextDouble();
                RES = CV / 1.341;
                System.out.println( "El resultado es: "+RES+" KW " );
                break;
      
        }
        }

}
