package es.studium.practica1da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Principal
{



	public static void main(String[] args) throws IOException, ClassNotFoundException
	{

		ListaDeLaCompra listaCompra = new ListaDeLaCompra();
		ArticuloAComprar article;

		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

		String descripcion;
		int cantidad;
		String unidad;

		String respuesta = "";

		System.out.print("Introduzca el nombre de la Lista: \n");
		String nombreLista = lectura.readLine();
		listaCompra.setNombreLista(nombreLista);
		
		
		try 
		{
			do
			{
				
				System.out.print("Introduce descripción: ");
				descripcion = lectura.readLine();

				System.out.print("Introduce la unidad: ");
				unidad  = lectura.readLine();

				System.out.print("Introduce cantidad: ");
				cantidad = Integer.parseInt(lectura.readLine());

				article = new ArticuloAComprar(descripcion, cantidad, unidad);

				listaCompra.agregarProductoAComprar(article);
				listaCompra.escribir();

				System.out.print("¿Quiere seguir introduciendo productos? \n -Intro para continuar \n -Asterisco para salir");
				respuesta = lectura.readLine();

			}while (!respuesta.equals("*"));

		}catch (NumberFormatException nfe)
		{
			System.out.println(nfe.getMessage());
		}

		listaCompra = listaCompra.leer();
		
		
		System.out.println("\nEn la lista hay: " + listaCompra.getArticulos().size() +  " elementos. Contiene:\n");
		for (ArticuloAComprar art : listaCompra.getArticulos())
		{
			System.out.println("Descripción: " + art.getDescripcion() + "\nUnidad: " + art.getUnidad() + "\nCantidad: " + art.getCantidad() + "\n");
		}
		
		
		System.out.println("¿Desea borrar algún elemento?\nPulse 1 para Si.\n Pulse 2 para salir.\n");
		String resp2 = lectura.readLine();

		
		
		if (resp2.equals("1"))
		{
			for (ArticuloAComprar art : listaCompra.getArticulos())
			{
				System.out.println("Elemento: \nDescripción: " + art.getDescripcion() + "\n");
			}

			System.out.println("¿Qué elemento desea borrar? Escriba su descripción");
			String descBorrar = lectura.readLine();

			listaCompra.eliminarArticulo(descBorrar);
			
			System.out.println("\n------ La Lista quedaría así ------");
			listaCompra.escribir();
		}
		else
		{
			System.exit(0);
		}

		
		listaCompra = listaCompra.leer();
		System.out.println("\nAhora en la lista hay: " + listaCompra.getArticulos().size() +  " elementos. Contiene:\n");

		for (ArticuloAComprar art : listaCompra.getArticulos())
		{
			System.out.println("Descripción: " + art.getDescripcion() + "\nUnidad: " + art.getUnidad() + "\nCantidad: " + art.getCantidad() + "\n");

		}
	}
}