/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nicolas;

/**
 *
 * @author APRENDIZ
 */
public class DivisiblesWhileApp {
    public static void main(String[] args) {
 
        int num=1;
 
        //Definimos el bucle, incluye el 100
        while (num<=100){
            if (num%2==0 || num%3==0){
                System.out.println(num);
            }
            //Incrementamos num
            num++;
        }
    }
    
}
