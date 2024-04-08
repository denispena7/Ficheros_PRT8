package es.studium.ejerciciosBinario; 

import java.io.*;
import java.util.Scanner; 

public class Ejercicio14 
{ 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int tabla[] = new int[10];
		for(int i = 0; i < tabla.length; i++) 
		{
			System.out.println("Dame números: ");
			tabla[i] = sc.nextInt();
		}

		try 
		{ 
			FileOutputStream fos = new FileOutputStream("tabla1.dat"); 
			BufferedOutputStream bos = new BufferedOutputStream (fos); 
			// Necesitamos un objeto de la clase DataOutputStream 
			DataOutputStream salidaB = new DataOutputStream(bos); 
			// Meter un double en el archivo 
			for(int i = 0; i < tabla.length; i++) 
			{
				salidaB.writeInt(tabla[i]); 
			}
			salidaB.close(); 
			bos.close(); 
			fos.close(); 
			sc.close();
			System.out.println("¡Archivo creado correctamente!"); 
		} 
		catch(IOException i) 
		{ 
			System.out.println("Se produjo un error de Archivo"); 
		} 
	}
}