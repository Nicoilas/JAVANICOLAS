/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nicolas;
import java.util.Scanner;
     
public class Nicolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1=0;
        int numero2=0;
        int suma=0;
        int resta=0;
        int multiplicacion=0;
        int division=0;
        
        
        Scanner teclado=new Scanner(System.in);
      
        System.out.println("ingrese el primer numero ");
        
        numero1=teclado.nextInt();
        System.out.println("sumerced dijito el siguientre numero "+numero1);
        
        System.out.println("ingrese el segundo numero");
        numero2=teclado.nextInt();
        System.out.println("sumerced dijito el siguientre numero "+numero2);
        suma=numero1+numero2;
        System.out.println("respuesta "+suma);
        resta=numero1-numero2;
        System.out.println("respuesta "+resta);
        multiplicacion=numero1*numero2;
        System.out.println("respuesta "+multiplicacion);
        division=numero1/numero2;
        System.out.println("respuesta "+division);
        
        // TODO code application logic here
    }
    
}
