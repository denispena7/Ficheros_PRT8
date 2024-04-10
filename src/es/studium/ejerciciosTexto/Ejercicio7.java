package es.studium.ejerciciosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio7
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

		String lineaFichero = "";

		try
		{
			FileReader fr = new FileReader(nombreFichero1);

			File file = new File(nombreFichero2);
			FileWriter fw = null;
			
			if(file.exists())
			{
				System.out.println("El destino YA existe. ¿Sobreescribirlo? [Si/No]");
				String respuesta = sc.nextLine();
				
				if(respuesta.equals("Si"))
				{
					fw = new FileWriter(nombreFichero2, false);
				}
				else if(respuesta.equals("No"))
				{
					fw = new FileWriter(nombreFichero2, true);
				}
			}
			
			BufferedReader entrada = new BufferedReader(fr);
			
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);

			while((lineaFichero = entrada.readLine()) != null)
			{
				salida.println(lineaFichero);
			}

			System.out.println("La información se copió correctamente");
			
			sc.close();
			salida.close();
			bw.close();
			entrada.close();
			fw.close();
			fr.close();
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