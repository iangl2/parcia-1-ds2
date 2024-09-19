/*
 * Una agencia de venta de automóviles distribuye seis modelos diferentes de Pick-Up y tiene
en su plantilla a ocho vendedores tope. Se desea un programa (Java) que escriba un informe
mensual de las ventas por vendedor y modelo (Ver gráfico), así como el número de
automóviles vendidos por cada trabajador y el número total de cada modelo vendido por
todos los vendedores.
Asimismo, para entregar el premio al mejor vendedor (botón), se necesita saber cuál es el
empleado que más y menos auto ha vendido. 
 */

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class prom3 {
    public static void main(String[] args) {
        String[] vendedores = {"Juan", "Pedro", "Ana", "Luis", "Carla", "Miguel", "Sofía", "Carlos"};
        String[] carros = {"Ford", "Chevrolet", "Toyota", "Nissan", "RAM", "GMC"};

        int[][] ventas= new int[8][6];
        int[] ventaV= new  int[8];
        int index=0,index2=0;
        String tabla= "VENDEDOR/MODELO\t";
        for (int i = 0; i < 6; i++) {
            tabla=tabla +"  "+carros[i];
        }

        try {
            
            for (int i = 0; i < 8; i++) {
                int acum=0;
                tabla=tabla +"\n"+vendedores[i];
                for (int j = 0; j < 6; j++) {
                     String cant = JOptionPane.showInputDialog("Introduzca candidad vendida del pick up: "+carros[j]+" vendidas por: "+vendedores[i]);
                     int cantNum=Integer.parseInt(cant);
                     ventas[i][j]=cantNum;
                    acum+=cantNum;
                    tabla=tabla +"  "+cantNum;
                }
                ventaV[i]=acum;
                tabla=tabla +"  "+acum;
                
                    if (ventaV[i]>ventaV[index]) {
                        index=i;
                    }
                    if (ventaV[i]<ventaV[index2]) {
                        index2=i;
                    }
            }
            tabla=tabla +"\n"+"el que más vendio fue: "+vendedores[index]+"\n"+"el que menos vendio fue: "+vendedores[index2];
           
            String [] options={"Felicitar", "Salir"};
            var selection= JOptionPane.showOptionDialog(null, tabla, 
            "", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if (selection==0) {
                JOptionPane.showMessageDialog(null, "Felicidades: "+vendedores[index], "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Introduzca un tipo de dato valido!","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }

    }
}
