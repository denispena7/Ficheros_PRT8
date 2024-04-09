package es.studium.ejerciciosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5B
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String nombreFichero1 = null;
		String nombreFichero2 = null;
		System.out.println("Dame el nombre del primer fichero:");
		nombreFichero1 = sc.nextLine();
		System.out.println("Dame el nombre del segundo fichero:");
		nombreFichero2 = sc.nextLine();
		sc.close();
		
		String contenidoFichero1 = "";
		String contenidoFichero2 = "";
		
		// Abrir los ficheros
		// Sacar la información y guardarla en las cadenas
		try
		{
			FileReader fr1 = new FileReader(nombreFichero1);
			FileReader fr2 = new FileReader(nombreFichero2);
			BufferedReader entrada1 = new BufferedReader(fr1);
			BufferedReader entrada2 = new BufferedReader(fr2);
			
			String lineaFichero = "";
			while((lineaFichero = entrada1.readLine()) != null)
			{
				contenidoFichero1 += lineaFichero;
			}
			while((lineaFichero = entrada2.readLine()) != null)
			{
				contenidoFichero2 += lineaFichero;
			}
			entrada2.close();
			entrada1.close();
			fr2.close();
			fr1.close();
			
			// Componer las cadenas
			if(contenidoFichero1.equals(contenidoFichero2))
			{
				System.out.println("Los ficheros tienen la misma información");
			}
			else
			{
				System.out.println("Los ficheros son distintos");
			}
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch(IOException ioe)
		{
			System.out.println("Se produjo un error de archivo");
		}
	}
}