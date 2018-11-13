/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Agrupaciones {

    //Atributos
    private int num;

    public void clasificacion() {
        //contador
        int cont=0;
        //acumuladores
        int acup = 0, acuneg = 0, acuc = 0;
        //For para la clasificación y el recuento
        for (cont = 0; cont <= 9; cont++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número: "));
            if (num > 0) {
                acup = acup + 1;
            } else if (num < 0) {
                acuneg = acuneg + 1;
            } else {
                acuc = acuc + 1;
            }
        }
        JOptionPane.showMessageDialog(null, "\nPositivos: " + acup
                + "\nNegativos: " + acuneg
                + "\nCeros: " + acuc);
    }

}
