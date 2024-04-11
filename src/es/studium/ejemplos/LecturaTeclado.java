package es.studium.ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaTeclado
{
	public static void main(String[] args)
	{
		BufferedReader teclado = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Dame tu nombre: ");
		
		try
		{
			String nombre = teclado.readLine();
			System.out.println("Hola " + nombre);
		}
		catch(IOException e){}
	}
}