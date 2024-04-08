package es.studium.ejerciciosBinario;

import java.io.BufferedOutputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectOutputStream; 
import java.util.Scanner; 

public class Ejercicio16 
{ 
	public static void main(String[] args)  
	{ 
		final int TAM = 10; 
		int tabla[] = new int[TAM]; 
		int i; 
		Scanner teclado = new Scanner(System.in); 
		try  
		{ 
			FileOutputStream fos = new FileOutputStream("tabla2.dat"); 
			BufferedOutputStream bos = new BufferedOutputStream(fos); 
			ObjectOutputStream salidaB = new ObjectOutputStream(bos); 
			// Leemos del teclado los valores que introduciremos en la tabla de enteros 
			for (i = 0; i < TAM; i++)  
			{ 
				System.out.println("Introduce el valor " + (i+1) + ":"); 
				tabla[i] = teclado.nextInt(); 
			} 
			teclado.close(); 
			// Escribimos la tabla en el fichero 
			salidaB.writeObject(tabla);  
			// Cerramos el flujo de datos de salida del programa 
			salidaB.close(); 
			bos.close(); 
			fos.close(); 
			System.out.println("Archivo creado correctamente!"); 
		} 
		catch (FileNotFoundException fnfe)  
		{ 
			System.out.println("No se encontró el Archivo"); 
		}  
		catch (IOException ioe)  
		{ 
			System.out.println("Se produjo un error de Archivo:"+ioe.getMessage()); 
		} 
	} 
}