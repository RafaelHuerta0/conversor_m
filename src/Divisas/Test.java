
package Divisas;

import javax.swing.JOptionPane; 

public class Test {
	 public static void main (String[] args) {

	Funcion f = new Funcion();


    while(true) {

    	String opcion = (JOptionPane.showInputDialog(null, "Escoja una opcion ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Divisas", "Conversor Cripto"}, "Escoja")).toString();

    	if (opcion == "Conversor de Divisas") {
        String input = JOptionPane.showInputDialog("Inserta un valor: ");
        if(f.check(input) == true) {
            double Minput = Double.parseDouble(input);
            f.Converter(Minput);

            int respuesta = 0;
            respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar?");
            if((respuesta == 0) && (f.check(input) == true)) { 
            } else {
                JOptionPane.showMessageDialog(null, "Finalizado");
                break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido");                
        }
    } else if (opcion == "Conversor Cripto") {
    	 String input = JOptionPane.showInputDialog("Cuanta cripto quieres convertir: ");
         if(f.check(input) == true) {
             double Minput = Double.parseDouble(input);
             f.ConverterCripto(Minput);

             int respuesta = 0;
             respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar?");
             if((respuesta == 0) && (f.check(input) == true)) { 
             } else {
                 JOptionPane.showMessageDialog(null, "Finalizado");
                 break;
             }

         } else {
             JOptionPane.showMessageDialog(null, "Valor inválido");                
         }
    	}
    }
 }

}