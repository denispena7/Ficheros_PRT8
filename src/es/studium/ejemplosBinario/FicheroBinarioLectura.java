package es.studium.ejemplosBinario;

import java.io.*; 

public class FicheroBinarioLectura 
{ 
	public static void main(String[] args) 
	{ 
		try 
		{ 
			FileInputStream fis = new FileInputStream ("datos.dat"); 
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