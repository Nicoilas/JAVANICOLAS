package nicolas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author APRENDIZ
 */
import javax.swing.JOptionPane;
public class SaludoPersonalizadoAppx {
    public static void main(String[] args) {
 
                //Nos aparece un cuadro de dialogo
        String nombre=JOptionPane.showInputDialog("pon  tu nombre");
 
        System.out.println("Bienvenido "+nombre);
    }
}
