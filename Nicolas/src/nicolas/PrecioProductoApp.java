/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nicolas;

/**
 *
 * @author APRENDIZ
 */
import java.util.Scanner;
public class PrecioProductoApp {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII");
        char caracter = sc.next().charAt(0);
 
        //Pasamos el caracter a codigo
        int codigo = (int) caracter;
 
        System.out.println(codigo);
    }
    
}
