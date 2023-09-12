
package Divisas;

import javax.swing.JOptionPane;

public class Funcion {
	public void Converter(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Que moneda quiere convertir ", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos a Dólares", "De Pesos a Euros", "De Pesos a Libras","De Dólares a Pesos", "De Euros a Pesos", "De Libras a Pesos"}, "Elija")).toString();
        if(opcion == "De Pesos a Dólares") {
        	double monedaDolar = Minput / 17.43;
    		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaDolar+ " Dolares");
        } else if (opcion == "De Pesos a Euros") {
            double monedaEuro = Minput / 18.59;
            monedaEuro = (double) Math.round(monedaEuro *100d)/100;
            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaEuro+ " Euros");
        } else if (opcion == "De Pesos a Libras"){
            double monedaLibra = Minput / 21.63;
            monedaLibra = (double) Math.round(monedaLibra *100d)/100;
            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaLibra+ " Libras Esterlinas");
        } 
        else if(opcion == "De Dólares a Pesos") {
        	double monedaDolar = Minput * 17.43;
    		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaDolar+ " Pesos");
        } else if (opcion == "De Euros a Pesos") {
            double monedaEuro = Minput * 18.59;
            monedaEuro = (double) Math.round(monedaEuro *100d)/100;
            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaEuro+ " Pesos");
        } else if (opcion == "De Libras a Pesos"){
            double monedaLibra = Minput * 21.63;
            monedaLibra = (double) Math.round(monedaLibra *100d)/100;
            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaLibra+ " Pesos");
    
        }      
    }
	
	
	
	
	
	
    public void ConverterCripto(double Minput) {
	
	  String opcion = (JOptionPane.showInputDialog(null, "Que moneda quiere convertir ", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos a Bitcoin", "De Pesos a Ripple","Bitcoin a Pesos", "Ripple a Pesos"}, "Elija")).toString();
	        if(opcion == "De Pesos a Bitcoin") {
	        	double monedaBit = Minput / 444534;
	    		monedaBit = (double) Math.round(monedaBit *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaBit+ " Bitcoins");
	        } else if (opcion == "De Pesos a Ripple") {
	            double monedaRi = Minput / 8.25;
	            monedaRi = (double) Math.round(monedaRi *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaRi+ " Ripples");
	        }
	
	        else if(opcion == "De Bitcoin a Pesos") {
	        	double monedaBit = Minput * 444534;
	    		monedaBit = (double) Math.round(monedaBit *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaBit+ " Pesos");
	        } else if (opcion == "De Ripple a Pesos") {
	            double monedaRi = Minput * 8.25;
	            monedaRi = (double) Math.round(monedaRi *100d)/100;
	            JOptionPane.showMessageDialog(null, "Tiene $ " +monedaRi+ " Pesos");
	        }
	        
    }
        

    public boolean check(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}