package nicolas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author APRENDIZ
 */
import java.util.Scanner;
public class SaludoPersonalizadoApp {
    public static void main(String[] args) {
         
        //Nos aparece un cuadro de dialogo
        Scanner sc = new Scanner(System.in);
        System.out.println("dime tu nombre ");
        String nombre=sc.nextLine();
  
        System.out.println("Bienvenido "+nombre);
    }
    
}
