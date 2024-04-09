package es.studium.ejerciciosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio6
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
		
		String lineaFichero = "";
		
		try
		{
			FileReader fr1 = new FileReader(nombreFichero1);
			FileWriter fr2 = new FileWriter(nombreFichero2);
			BufferedReader entrada = new BufferedReader(fr1);
			BufferedWriter bw = new BufferedWriter(fr2);
			PrintWriter salida = new PrintWriter(bw);
			
			while((lineaFichero = entrada.readLine()) != null)
			{
				salida.println(lineaFichero);
			}
			
			System.out.println("La información se copió correctamente");
			salida.close();
			bw.close();
			entrada.close();
			fr2.close();
			fr1.close();
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