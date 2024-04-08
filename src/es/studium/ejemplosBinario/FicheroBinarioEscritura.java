package es.studium.ejemplosBinario; 

import java.io.*; 

public class FicheroBinarioEscritura 
{ 
	public static void main(String[] args) 
	{ 
		try 
		{ 
			FileOutputStream fos = new FileOutputStream("datos.dat"); 
			BufferedOutputStream bos = new BufferedOutputStream (fos); 
			// Necesitamos un objeto de la clase DataOutputStream 
			DataOutputStream salidaB = new DataOutputStream(bos); 
			// Meter un double en el archivo 
			salidaB.writeDouble(7.345); 
			salidaB.close(); 
			bos.close(); 
			fos.close(); 
			System.out.println("¡Archivo creado correctamente!"); 
		} 
		catch(IOException i) 
		{ 
			System.out.println("Se produjo un error de Archivo"); 
		} 
	} 
} 