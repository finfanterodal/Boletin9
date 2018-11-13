/*
 *4- Codifica un programa que solicite  un número e, visualice a táboa de multiplicar dese número. 
 *O programa rematara cando prememos o cero.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Tabla {
    private int num;
    public void tablaMultiplicar(){
     int cont; 
     int acu;
     num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
     for (cont = 0; cont <= 10; cont++) {
     acu=cont*num;
     JOptionPane.showMessageDialog(null,num+" * "+cont+" = "+acu);
        }   
    }
}
