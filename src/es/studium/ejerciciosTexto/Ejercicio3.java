package es.studium.ejerciciosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//FileWriter también puede lanzar una excepción
		try
		{
			
			// Destino de los datos
			FileWriter fw = new FileWriter("fich1.txt", true);
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw);
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw);
			
			System.out.println("Indica una cadena");
			String cadena = sc.nextLine();
			
			//Guardamos la primera línea
			salida.println(cadena);
			//Cerrar el objeto salida, el objeto bw y el fw
			sc.close();
			salida.close();
			bw.close();
			fw.close();
			System.out.println("¡Archivo actualizado!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
}