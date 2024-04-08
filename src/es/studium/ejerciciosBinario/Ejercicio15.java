package es.studium.ejerciciosBinario;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio15 
{
	public static void main(String args[]) 
	{
		try 
		{ 
			Scanner sc = new Scanner(System.in);
			System.out.println("Indica el nombre del fichero: ");
			String fichero = sc.nextLine();
			
			FileInputStream fis = new FileInputStream (fichero); 
			BufferedInputStream bis = new BufferedInputStream (fis); 
			// Necesitamos un objeto de la clase DataInputStream 
			DataInputStream entradaB = new DataInputStream(bis); 
			// Sacar un double del archivo
			for(int i = 0; i < 10; i++) 
			{
				System.out.println(entradaB.readInt()); 
			}
			entradaB.close(); 
			bis.close(); 
			fis.close(); 
			sc.close();
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