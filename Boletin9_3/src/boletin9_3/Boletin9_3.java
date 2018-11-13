/*
 *3- Implementa un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado . 
 *Asegurate que estos valores sexan positivos , para eso valida os datos .
 */
package boletin9_3;
import javax.swing.JOptionPane;
/**
 *
 * @author finfanterodal
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Rectangulo rectangulo1=new Rectangulo();  
    JOptionPane.showMessageDialog(null, "Área: "+rectangulo1.calcularArea());
    }   
}
