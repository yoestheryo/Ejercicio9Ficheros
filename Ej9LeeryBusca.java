package es.studium.Tema8Boletin1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej9LeeryBusca
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nombreFichero = "";
		String palabra = "";
		String cadena = "";
		String contenido = "";
		boolean encontrada = false;
		System.out.println("Dame el nombre del fichero: ");
		nombreFichero = teclado.nextLine();
		System.out.println("Dame la palabra a buscar: ");
		palabra = teclado.nextLine();
		teclado.close();

		try
		{							
			FileReader fr = new FileReader(nombreFichero);
			BufferedReader bf = new BufferedReader(fr);
			while((cadena=bf.readLine())!=null)
			{
				contenido+=cadena;	// (contenido = contenido + cadena)
			}
			if(contenido.contains(palabra))
			{
				encontrada = true;
			}
			bf.close();
			fr.close();
		}
		catch(IOException ioe)
		{
			System.out.println("Error: "+ioe.getMessage());
		}
		
		if(encontrada)
		{
			System.out.println("La palabra está en el archivo.");
		}
		else
		{
			System.out.println("Esa palabra no se enuentra en el fichero.");
		}

		
	}

}
