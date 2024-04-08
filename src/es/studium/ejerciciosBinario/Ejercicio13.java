package es.studium.ejerciciosBinario;

import java.io.*; 

public class Ejercicio13 
{ 
	public static void main(String[] args) 
	{ 
		try 
		{ 
			FileInputStream fis = new FileInputStream ("uno.bin"); 
			BufferedInputStream bis = new BufferedInputStream (fis); 
			// Necesitamos un objeto de la clase DataInputStream 
			DataInputStream entradaB = new DataInputStream(bis); 
			// Sacar un double del archivo 
			System.out.println(entradaB.readDouble()); 
			entradaB.close(); 
			bis.close(); 
			fis.close(); 
		} 
		catch(FileNotFoundException e) 
		{ 
			System.out.println("Archivo NO encontrado"); 
		} 
		catch(IOException i) 
		{ 
			System.out.println("Se produjo un error de Archivo"); 
		} 
	} 
} 