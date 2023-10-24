/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nicolas;

import javax.swing.JOptionPane;

/**
 *
 * @author APRENDIZ
 */
public class Salario {
    public static void main(String[] args){
        int salario=1160000;
        int dias_mes=31;
        int valor_dia=0;
        int sd=0;
        String nombre = JOptionPane.showInputDialog("digirte su nombre");
        int dias=Integer.parseInt(JOptionPane.showInputDialog("dias que trabajo"));
        valor_dia=salario/dias_mes;
        sd=valor_dia*dias;
        JOptionPane.showMessageDialog(parentComponent:null,"su salario del mes "+sd);
        JOptionPane.showMessageDialog(parentComponent:null,"su salario del mes "+valor_dia);
        
        
    
}
        
    }
    

