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
public class ComprobacionApp {
    public static void main(String[] args) {
 
        /* Declaramos la varible ya que sino no podemos usarla
         * en el while por el tema de ámbito
         */
        int codigo;
        do{
            String texto=JOptionPane.showInputDialog("Introduce un numero mayor que 0");
            codigo=Integer.parseInt(texto);
        }while(codigo<=0);
 
        System.out.println(codigo);
    }
}
