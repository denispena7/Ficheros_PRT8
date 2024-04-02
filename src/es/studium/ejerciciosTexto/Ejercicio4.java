package es.studium.ejerciciosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//FileWriter también puede lanzar una excepción
		try
		{
			String cadena = "";
			// Destino de los datos
			FileWriter fw = new FileWriter("fich2.txt");
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw);
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw);

			do
			{
				System.out.println("Indica una cadena");
				cadena = sc.nextLine();
				
				if(!cadena.equals("*"))
				{
					salida.println(cadena);	
				}

			}while(!cadena.equals("*"));

			//Guardamos la primera línea
			//Cerrar el objeto salida, el objeto bw y el fw
			salida.close();
			bw.close();
			fw.close();
			sc.close();

			System.out.println("¡Archivo actualizado!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
}