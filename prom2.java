/*
 * El juego de la lotería es uno de los más realizado en este país. Confeccione un programa 
(Java) que permita obtener (probabilidad y estadística) lo números del sorteo de la lotería de 
Panamá (4 números posibles y/o pirámide). A modo de sugerencia tome como referencia los 
últimos 3-5 sorteos realizados. 
 */

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class prom2 {
    
    
    public static boolean soloNumeros(String cadena) {
        // El patrón ^\\d+$ verifica que toda la cadena contenga solo números
        return cadena.matches("^\\d+$");
    }
    public static void main(String[] args) {
        Double numPos = (double) 10000; // Números entre 0000 y 9999
        try {
        

            String num ;
            do { 
                
                num= JOptionPane.showInputDialog("Introduzca numero de la loteria");
            } while (num.length()!=4||!soloNumeros(num));
            
            String cant ;
            int cantNum;
            
            do { 
                cant = JOptionPane.showInputDialog("Introduzca cantidad de sorteos");
                cantNum =Integer.parseInt(cant);
            } while (cantNum>5||cantNum<3);


            String [] sorteos= new  String[cantNum];
            
            for (int i = 0; i < cantNum; i++) {
                do { 
                    sorteos[i] = JOptionPane.showInputDialog("Introduzca sorteo "+(i+1));    
                } while (sorteos[i].length()!=4||!soloNumeros(sorteos[i]));
                
            }

            for (int i = 0; i < cantNum; i++) {
                for (int j = 0; j < 4; j++) {
             
                        if (sorteos[i].charAt(j) ==num.charAt(j)) {
                            numPos*=10;
                            System.out.println(sorteos[i].charAt(j));
                            System.out.println(num.charAt(j));
                            System.out.println(numPos);
                        }
                    
                }
                
            }
            JOptionPane.showMessageDialog(null, "Las posibilidades es de 1 en "+numPos, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Introduzca un tipo de dato valido!","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }

}
