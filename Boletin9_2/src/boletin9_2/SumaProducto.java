/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class SumaProducto {
 //Atributos  
   public void sumaProducto(){
    double acuSuma=0;
    double acuProducto=1;
    int cont;
    for(cont=10;cont<=90;cont++){
         acuSuma=acuSuma+cont;
         acuProducto=acuProducto*cont;
    }
JOptionPane.showMessageDialog(null, "\nSuma: "+acuSuma+"\nProducto: "+acuProducto);
   }

}
