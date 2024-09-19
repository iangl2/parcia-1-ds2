/**
 * prom1
 * Una tienda de compra por Internet le solicita que confeccione una aplicación (Java) que 
permita el ingreso del precio sin descuento, un cupón de descuento (CONTEMPLE NÚMEROS 
y LETRAS) que lo aplique a la venta, puede variar (1-100 depende de la decisión de la 
Empresa). Muestre el precio preliminar, el descuento aplicado, final más el ITBM (7%), los 
días en llegar el pedido de afuera (exportación), limpie los campos para simularse las N veces 
que requiera la acción. V
 */

 import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class prom1 {
    public static boolean esValida(String cadena) {
       
        String regex = "^[a-zA-Z0-9]+$";
        return cadena.matches(regex);
    }

    
    public static void main(String[] args) {
        do { 
            try {
                String[] codDesc={"CODPROM1", "CODPROM2", "CODPROM3"};
                String precio = JOptionPane.showInputDialog("Introduzca precio del item");
                float precioNum=Float.parseFloat(precio);
                String cupon="";
                float descuento=0;
                do { 
                    
                    cupon = JOptionPane.showInputDialog("Introduzca código de cupon");
                        if (!esValida(cupon)) {
                        JOptionPane.showMessageDialog(null, "SOLO NUMEROS Y LETRAS","ERROR_MESSAGE", 
                        JOptionPane.ERROR_MESSAGE);
                        }
                } while (!esValida(cupon));
                for (int i = 10; i < 40; i+=10) {
                    if (codDesc[(i/10)-1].equals(cupon)) {
                        descuento=i;

                    }
                }

                JOptionPane.showMessageDialog(null, 
               "Precio del item: "+String.format("%.2f",precioNum)+
               "\nEl total del descuento: "+String.format("%.2f",descuento)+"%"+
               "\nImpuestos aplicados: "+String.format("%.2f",(precioNum*1.07) )+
               "\nTotal con descuento aplicado: "+ String.format("%.2f", ((precioNum*1.07)*(1-(descuento/100))))
               +"\nLos pedidos tardan de 3-5 dias habiles"
                , "Result", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Introduzca un tipo de dato valido!","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
            String [] options={"Continuar", "Salir"};
            var selection= JOptionPane.showOptionDialog(null, "Menu Problema 1", 
            "Seleccione una opcion: ", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if (selection==1) {
                return;
            }

        } while (true);
    }
}