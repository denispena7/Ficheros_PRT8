package es.studium.ejerciciosTexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//FileWriter también puede lanzar una excepción
		try
		{
			String texto;

			// Destino de los datos
			FileWriter fw = new FileWriter("fich1.txt");
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw);
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw);

			System.out.println("Ingresa texto");
			texto = sc.nextLine();

			//Guardamos la primera línea
			salida.println(texto);
			sc.close();
			//Cerrar el objeto salida, el objeto bw y el fw
			salida.close();
			bw.close();
			fw.close();
			System.out.println("¡Archivo creado correctamente!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
}