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
public class Rectangulo {

    private double base;
    private double altura;
    private double area;
    

    public void validacion() {//Introcuccion y validacion de datos.
        do {
            base = Double.parseDouble(JOptionPane.showInputDialog("\nIntroduce la base."));
            if (base < 0) {
                JOptionPane.showMessageDialog(null, "\nError.");
            }
        } while (base < 0);
        
        do {
            altura = Double.parseDouble(JOptionPane.showInputDialog("\nIntroduce la altura."));
            if (altura < 0) {
                JOptionPane.showMessageDialog(null, "\nError.");
            }
        } while (altura < 0);

    }
    
    public double calcularArea(){//Método para calcular el area del rectangulo, en el que hacemos al método de validacion e introduccion.
        validacion();
        area=base*altura;
        return area;
    }   
}
