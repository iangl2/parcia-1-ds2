/*
 * Los resultados de las últimas elección a Alcalde en el Distrito Alanje han sido los siguientes:
 * Escribir un programa (Java) que haga las siguientes tareas. Valor 15 puntos
a. Imprimir la tabla anterior con cabeceras incluidas. Debe preguntarse el mínimo de 2
candidatos y máximo 4.
b. Calcular e imprimir el número total de votos recibidos por cada candidato y el
porcentaje del total de votos emitidos. Asimismo, visualizar el candidato más botado.
c. Si algún candidato recibe más del 50% por cientos de los votos, el programa imprimirá
(botón) un mensaje declarando el ganador.
d. Si algún candidato recibe mas del 50% de los votos, el programa debe imprimir (botón)
el nombre de los dos candidatos más votados, que serán los que pasen a la segunda
ronda de las elecciones.
 */

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class prom4 {
                            public static void main(String[] args) {
    int cantNum;
    String tabla="Distrito";
    int total=0;
    try {
        do {
            String cant = JOptionPane.showInputDialog("Introduzca candidad de cantidatos");
            cantNum=Integer.parseInt(cant);
            
        } while (cantNum<2||cantNum>4);
        int[] votosT= new  int[cantNum];
        for (int i = 1; i <= cantNum; i++) {
            tabla=tabla+"  " +"Candidato "+i;
        }
for (int i = 0; i < 5; i++) {
    tabla=tabla+"\n" +"Distrito "+(i+1);

    for (int j = 0; j < cantNum; j++) {
        String cantV = JOptionPane.showInputDialog("Introduzca candidad de Votos en el Distrito "+(i+1)+"Para el candidato: "+(j+1));

        int cantVNum=Integer.parseInt(cantV);
        tabla=tabla+"  "+cantVNum;
        if (i==0) {
            votosT[j]=0;
        }
        total+=cantVNum;
        votosT[j]+=cantVNum;
    }
    
}
tabla=tabla+"\n" +"Porcentajes";

for (int i = 0; i < cantNum; i++) {
    tabla=tabla+"  " +((votosT[i]*100)/total);
                                    
}
JOptionPane.showMessageDialog(null, tabla, "Result", JOptionPane.INFORMATION_MESSAGE);


    } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Introduzca un tipo de dato valido!","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
    }
    }
}
