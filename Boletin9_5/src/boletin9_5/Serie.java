/*
 *5- Implementa un programa no que se pida o número de elementos e, visualice a seguinte serie :
 *a)  2 + 4 + 6 + 8 + 10 …..
 *b)  - 1 + 2 – 3 + 4 – 5 + 6 …..
 *c)  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ………
 */
package boletin9_5;

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Serie {

    public void serie() {
        int acu1 = 0;
        int acu2 = 1;
        int acuTotal = 0;
        int menu;
        int numElements;
        do {
            numElements = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de elementos"));
            menu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la serie deseada: \n1. 2 + 4 + 6 + 8... "
                    + "\n2. - 1 + 2 - 3 + 4 - 5"
                    + "\n3. 0 , 1, 1, 2, 3, 5, 8, 13, 21..."
                    + "\n4.Salir."));
            switch (menu) {
                case 1:
                    /*do{                  
                    acu=acu+2;  
                    numElements=numElements-1;
                    JOptionPane.showMessageDialog(null, acu);
                    }while(numElements!=0);  */
                    for (int i = 0; i < numElements; i++) {
                        System.out.print(acu1 + "+");
                        //JOptionPane.showMessageDialog(null, acu+"+");
                        acu1 = acu1 + 2;
                    }
                    break;

                case 2:
                    for (int i = 0; i < numElements; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + "-");
                        } else {
                            System.out.print(i + "+");
                        }
                    }

                    break;
                case 3:
                    for (int i = 0; i < numElements; i++) {
                        if (i == 0) {
                            acuTotal = 0;
                            System.out.print(0 + ",");
                        } else if (i == 1) {
                            System.out.print(1 + ",");
                        } else {
                            acuTotal = acu1 + acu2;
                            acu1 = acu2;
                            acu2 = acuTotal;
                            System.out.print(acuTotal + ",");
                        }
                    }

                    break;
                case 4: ;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error");
                    break;
            }
        } while (menu != 4);
    }
}
