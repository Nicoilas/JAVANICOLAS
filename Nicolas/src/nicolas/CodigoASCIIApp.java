/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nicolas;

/**
 *
 * @author APRENDIZ
 */
import javax.swing.JOptionPane;
public class CodigoASCIIApp {
    public static void main(String[] args) {
 
        String texto=JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
        //Pasamos el String a int
        int codigo=Integer.parseInt(texto);
 
        //Pasamos el codigo a caracter
        char caracter=(char)codigo;
 
        System.out.println(caracter);
    }
}
