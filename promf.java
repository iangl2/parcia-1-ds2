/**
 * promf
 */

 import javax.swing.JOptionPane;

public class promf {

    public static void main(String[] args) {

        String [] options={"Problema 1", "Problema 2", "Problema 3","Problema 4", "Salir"};
        
        while (true) {
            
            var selection= JOptionPane.showOptionDialog(null, "Menu Parcial 1", 
            "Seleccione una opcion: ", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (selection) {
                case 0 -> prom1.main(args);
                case 1 -> prom2.main(args);
                case 2 -> prom3.main(args);
                case 3 -> prom4.main(args);
                default -> {return;}
            }
        }
    }
}