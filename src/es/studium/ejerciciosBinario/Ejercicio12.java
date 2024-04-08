package es.studium.ejerciciosBinario; 

import java.io.*;
import java.util.Scanner; 

public class Ejercicio12 
{ 
	public static void main(String[] args) 
	{ 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un entero: ");
		int entero = teclado.nextInt();
		
		try 
		{ 
			FileOutputStream fos = new FileOutputStream("uno.bin"); 
			BufferedOutputStream bos = new BufferedOutputStream (fos); 
			// Necesitamos un objeto de la clase DataOutputStream 
			DataOutputStream salidaB = new DataOutputStream(bos); 
			// Meter un double en el archivo 
			salidaB.writeDouble(entero); 
			salidaB.close(); 
			bos.close(); 
			fos.close(); 
			System.out.println("¡Archivo creado correctamente!"); 
		} 
		catch(IOException i) 
		{ 
			System.out.println("Se produjo un error de Archivo"); 
		} 
		teclado.close();
	} 
} 