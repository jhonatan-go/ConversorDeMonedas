package Main;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

import ConversorDeMonedas.MenuFunciones;
import ConversorDeTemperaturas.MenuFuncionesTemperaturas;

public class MainPrincipal {
	
	public static void main(String[] args) {
		
		MenuFunciones monedas = new MenuFunciones();
		MenuFuncionesTemperaturas temperatura = new MenuFuncionesTemperaturas();
		
		while(true) {
			
        	String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
        	switch(opciones) {
        	
        		case "Conversor de Moneda":
        			String input = JOptionPane.showInputDialog("ingresa la cantidad a convertir ");
        			if(ValidarNumero(input)== true) {
        				
	        				double inputlocal = Double.parseDouble(input);
	        				monedas.ConvertirMonedas(inputlocal);
	        				
	        				int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion? ");
	        				
	        				if (JOptionPane.OK_OPTION == respuesta) {
	        					
	        					System.out.println("Seleccione una opcion afirmativa");
	          				}
	        				else {
	          					JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA");
	          				}
        			}else {
        				JOptionPane.showMessageDialog(null, "valor invalido");
        			}
        			break;
        			     				
           		case"Conversor de Temperatura":
          			input = JOptionPane.showInputDialog("ingresa la temperatura que deseas convertir");
          			if(ValidarNumero(input)== true) {
          				double inputlocal = Double.parseDouble(input);
        				temperatura.ConvertirTemperatura(inputlocal);
        				
        				int respuesta = 0 ;
        				respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar con el programa?");
        				if((respuesta == 0 ) && (ValidarNumero(input)== true)){
        					
        				}
        				else {
        					JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA");
        				}
        				
          			}
          			break;
          					
        			     				       				
        		}
        		
        	}
							
	}
	public static boolean ValidarNumero(String input) {
		try {
			double numero = Double.parseDouble(input);
			if(numero >= 0 || numero < 0);
			return true;
		} catch (Exception e) {
			return false;
		}
       
    }
	
	
	
	
	

}
