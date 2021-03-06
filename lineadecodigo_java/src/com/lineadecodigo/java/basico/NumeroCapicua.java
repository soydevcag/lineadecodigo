package com.lineadecodigo.java.basico;

/**
 * @file NumeroCapicua.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date  24-septiembre-2007
 * @url    http://lineadecodigo.com/2007/09/24/saber-si-un-numero-es-capicua-con-java/
 * @description Un n�mero es capicua si sus se lee igual de izquierda a derecha, que de derecha a izquierda 
 */

public class NumeroCapicua {

	public static void main(String[] args) {
	
		long numero = 544333234432333445L;
		long falta,numeroInvertido,resto;

		while(numero<=0);
		falta=numero;
		  numeroInvertido=0;
		  resto=0;
		
		// El c�digo que viene a continuaci�n da la vuelta a un numero
		while(falta!=0)
		{
		 resto=falta%10;
		 numeroInvertido=numeroInvertido*10+resto;
		 falta=falta/10;		 		 
		}
		
		// Si el n�mero origen y el destino son el mismo, es que es capicua
		if(numeroInvertido==numero)
		 System.out.println("El numero es capicua\n");
		else
		 System.out.println("El numero no es capicua\n");
				
	}

}
