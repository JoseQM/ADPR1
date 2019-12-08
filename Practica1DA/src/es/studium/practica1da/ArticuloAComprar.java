package es.studium.practica1da;

import java.io.Serializable;

public class ArticuloAComprar implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private String descripcion;
	private int cantidad;
	private String unidad;
	
	
	
	/**
	 * 
	 * Constructor de la clase ArticuloAComprar.
	 * 
	 */
	public ArticuloAComprar()
	{
		descripcion = "";
		cantidad = 0;
		unidad = "";
	}
	
	
	
	/**
	 * Constructor de la clase ArticuloAComprar.
	 * Recibe tantos parámetros como atributos tendrá cada articulo.
	 * 
	 * 
	 * @param desc es un String que representa la descripción del artículo.
	 * @param amount es un Integer que representa la cantidad de artículo que añadiremos.
	 * @param unity es un String que representa la unidad de medida del artículo en cuestión. Pueden ser Kilogramos, Litros, Metros, Pulgadas, etc.
	 * 
	 */
	public ArticuloAComprar(String desc, int amount, String unity)
	{
		descripcion = desc;
		cantidad = amount;
		unidad = unity;
	}
	
	
	
	/**
	 * Este método se encargará de devolver la descripción de un artículo concreto.
	 * 
	 * 
	 * @return descripción es un String que representa la descripción del artículo.
	 * 
	 */
	public String getDescripcion()
	{
		return descripcion;
	}
	
	
	
	/**
	 * Este método se encargará de establecer la descripción a un artículo.
	 * 
	 * 
	 * @param descripción es un String que representa la descripción del artículo.
	 * 
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	
	
	/**
	 * Este método se encargará de devolver la cantidad de un artículo concreto.
	 * 
	 * 
	 * @return cantidad es un Integer que representa la cantidad del artículo.
	 * 
	 */
	public int getCantidad()
	{
		return cantidad;
	}
	
	
	
	/**
	 * Este método se encargará de establecer la cantidad de un artículo.
	 * 
	 * 
	 * @param cantidad es un Integer que representa la cantidad del artículo.
	 * 
	 */
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	
	
	
	/**
	 * Este método se encargará de devolver la cantidad de un artículo concreto.
	 * 
	 * 
	 * @return unidad es un String que representa la unidad de medida del artículo.
	 * 
	 */
	public String getUnidad()
	{
		return unidad;
	}
	
	
	
	/**
	 * Este método se encargará de establecer la unidad de medida de un artículo.
	 * 
	 * 
	 * @param unidad es un String que representa la unidad de medida del artículo.
	 * 
	 */
	public void setUnidad(String unidad)
	{
		this.unidad = unidad;
	}
}