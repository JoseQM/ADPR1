package es.studium.practica1da;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class ListaDeLaCompra implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	//Nombre de la lista.
	String nombreLista;
	
	//ArrayList donde se guardaran los articulos de la clase ArticuloAComprar.
	ArrayList<ArticuloAComprar> articuloLeido = new ArrayList<ArticuloAComprar>();
	
	
	/**
	 * Este método irá recibiendo artículos que guardará en un ArrayList.
	 * 
	 * @param artículo de la clase ArticuloAComprar.
	 * 
	 * */
	public void agregarProductoAComprar(ArticuloAComprar articulo) throws IOException
	{
		articuloLeido.add(articulo);
	}
	
	
	
	
	/**
	 * Este método devuelve un ArrayList con todos los productos que hayamos introducido.
	 * 
	 * @return ArrayList de ArticuloAComprar.
	 * 
	 * */
	public ArrayList<ArticuloAComprar> getArticulos() throws IOException, ClassNotFoundException
	{	
		return articuloLeido;
	}
	
	
	
	/**
	 * Este método recibirá la descripción del artículo que deseamos borrar.
	 * 
	 * @param String que representa la descripción del artículo.
	 * 
	 * */
	public void eliminarArticulo(String nombreProducto) throws ClassNotFoundException, IOException
	{

		for (ArticuloAComprar art : this.getArticulos())
		{
			if (art.getDescripcion().equals(nombreProducto))
			{
				this.getArticulos().remove(art);
				break;
			}
		}
	}
	
	
	
	/**
	 * 
	 * Este método se encargará de escribir la lista de la compra, compuesta por el nombre de esta y un ArrayList de artículos.
	 * Serán escritos en un archivo '.dat' que será creado en el directorio padre, tomando como nombre, el nombre de lista previamente introducido.
	 * 
	 * */
	public void escribir() 
	{
		try 
		{

			FileOutputStream fos = new FileOutputStream(this.getNombreLista() + ".dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(this);
			oos.close();
			fos.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	/**
	 * 
	 * Este método se encargará de leer el contenido del archivo '.dat' previamente creado.
	 * Este archivo contiene el nombre de la lista, y los artículos que hayamos introducido en la misma.
	 * 
	 * @return un Objeto de la clase ListaDeLaCompra.
	 * 
	 * */
	public ListaDeLaCompra leer()
	{

		ListaDeLaCompra listaLeer = new ListaDeLaCompra();

		try
		{
			FileInputStream fis = new FileInputStream(this.getNombreLista() + ".dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			listaLeer = (ListaDeLaCompra)ois.readObject();

			ois.close();
			fis.close();

		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("Error 1");
		}
		catch (IOException ioe)
		{
			System.out.println("Error 2");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Error 3");
		}

		return listaLeer;
	}
	
	
	
	/**
	 * 
	 * Constructor de la clase ListaDeLaCompra.
	 * 
	 * */
	public ListaDeLaCompra()
	{
		nombreLista = "";
	}
	
	
	
	/**
	 * 
	 * Constructor de la clase ListaDeLaCompra.
	 * 
	 * @param String que representa el nombre de la lista.
	 * 
	 * */
	public ListaDeLaCompra(String listName)
	{
		nombreLista = listName;
	}
	
	
	
	/**
	 * 
	 * Este método se encargará de devolver el nombre de Lista.
	 * 
	 * @return String que representa el nombre de la lista.
	 * 
	 * */
	public String getNombreLista()
	{
		return nombreLista;
	}
	
	
	
	/**
	 * 
	 * Este método se encargará de establecer un nombre para lista de artículos.
	 * 
	 * @param String que será el nombre de la lista, y por tanto, el nombre que se le dará al archivo '.dat'.
	 * 
	 * */
	public void setNombreLista(String nombreLista)
	{
		this.nombreLista = nombreLista;
	}
}