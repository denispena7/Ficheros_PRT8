package es.studium.ejerciciosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un fichero: "); 
		String fichero = sc.nextLine();
		
		System.out.print("Dame otro fichero: ");
		String fichero2 = sc.nextLine();		
		
		try 
		{ 
			// Origen de los datos en el proyecto anterior 
			FileReader fr = new FileReader(fichero); 
			// Buffer de lectura 
			BufferedReader entrada = new BufferedReader(fr); 
			String linea = null; 
			
			FileReader fr2 = new FileReader(fichero2); 
			BufferedReader entrada2 = new BufferedReader(fr2); 
			String linea2 = null; 

			// Bucle para sacar la información del archivo 
			while((linea=entrada.readLine())!=null && (linea2=entrada2.readLine())!=null) 
			{ 
				if(linea.equals(linea2)) 
				{
					System.out.println("Contienen el mismo contenido");
				}
				else 
				{
					System.out.println("Contienen contenido diferente");
				}
			} 
			// Cerrar el objeto entrada 
			entrada.close();
			fr2.close();
			fr.close(); 
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