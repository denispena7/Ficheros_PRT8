package es.studium.ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FicheroTextoLectura
{
	public static void main(String[] args)
	{
		//Como usaremos FileReader y puede lanzar una excepción
		//necesitaremos un bloque try – catch
		try
		{
			// Origen de los datos en el proyecto anterior
			FileReader fr = new FileReader("archivo.txt");
			// Buffer de lectura
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			// Bucle para sacar la información del archivo
			while((s = entrada.readLine())!=null)
			{
				System.out.println(s);
			}
			// Cerrar el objeto entrada
			entrada.close();
			fr.close();
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