/*
 *6- Codifica un programa que  Lea o soldo de cada un dos traballadores dunha empresa e obteña
 *o número deles que ganan entre 1000 e 1750 €, ámbolos dous incluidos e, a porcentaje de traballadores 
 *que ganan menos de 1000 €.Tendo en conta que non se coñece con antelación o numero de traballadores 
 *da empresa e non se admiten os soldos negativos.( utiliza como condidión de fin un soldo 0 ). 
 */
package boletin9_6;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Traballadores {

    public void soldo() {
        double soldo;
        int contador1 = 0;
        int contador2 = 0;
        int numTotalTraballadores = 0;
        do {
            do {
                soldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce o soldo"));
            } while (soldo < 0);
            if (soldo >= 1000.0 && soldo <= 1750.0) {
                contador1 = contador1 + 1;
            } else if (soldo < 1000.0 && soldo != 0) {
                contador2 = contador2 + 1;
            }
            numTotalTraballadores = numTotalTraballadores + 1;
        } while (soldo != 0);
        JOptionPane.showMessageDialog(null, "Número Total traballadores: " + (numTotalTraballadores-1)
                + "\nNúmero de traballadoresque ganan entre 1000 e 1750 €: " + contador1
                + "\nPorcentaje de traballadores que ganan menos de 1000 €: " + ((contador2 * 100) / (numTotalTraballadores-1)) + "%");
    }
}
