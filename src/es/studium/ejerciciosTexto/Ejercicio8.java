package es.studium.ejerciciosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String nombreFichero = null;
		String contenido = "";
		String lineaFichero = "";
		int contadorVocales = 0;
		int contadorConsonantes = 0;
		int contadorSignos = 0;
		int contadorNumeros = 0;
		
		System.out.println("Dame el nombre del fichero: ");
		nombreFichero = sc.nextLine();
		sc.close();
		
		try
		{
			FileReader fr = new FileReader(nombreFichero);
			BufferedReader entrada = new BufferedReader(fr);
			
			while((lineaFichero = entrada.readLine()) != null)
			{
				contenido += lineaFichero;
			}
			entrada.close();
			fr.close();
			
			for(int i = 0; i < contenido.length(); i++)
			{
				switch(contenido.charAt(i))
				{
					case '0': case '1': case '2': case '3': case '4': 
					case '5': case '6': case '7': case '8': case '9':
						contadorNumeros++;
						break;
					case 'a': case 'e': case 'i': case 'o': case 'u':
					case 'á': case 'é': case 'í': case 'ó': case 'ú':
					case 'A': case 'E': case 'I': case 'O': case 'U':
					case 'Á': case 'É': case 'Í': case 'Ó': case 'Ú':
					case 'ü':
						contadorVocales++;
						break;
					case '!': case '¡': case '"': case '¿': case '?':
					case '`': case '^': case ',': case '.': case ':':
					case ';': case '-': case '_': case '<': case '>':
					case '(': case ')': case '[': case ']': case '{': 
					case '}': case ' ':
						contadorSignos++;
						break;
					default:
						contadorConsonantes++;
				}
			}
			
			System.out.println("En el archivo hay " + contadorVocales + " vocales, " + contadorNumeros +
					" números, " + contadorConsonantes + " consonantes, y " + contadorSignos + " signos");
		}
		catch(FileNotFoundException flfe)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch(IOException ioe)
		{
			System.out.println("Se produjo un error de archivo");
		}
	}
}