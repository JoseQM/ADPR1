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
	 * Recibe tantos par�metros como atributos tendr� cada articulo.
	 * 
	 * 
	 * @param desc es un String que representa la descripci�n del art�culo.
	 * @param amount es un Integer que representa la cantidad de art�culo que a�adiremos.
	 * @param unity es un String que representa la unidad de medida del art�culo en cuesti�n. Pueden ser Kilogramos, Litros, Metros, Pulgadas, etc.
	 * 
	 */
	public ArticuloAComprar(String desc, int amount, String unity)
	{
		descripcion = desc;
		cantidad = amount;
		unidad = unity;
	}
	
	
	
	/**
	 * Este m�todo se encargar� de devolver la descripci�n de un art�culo concreto.
	 * 
	 * 
	 * @return descripci�n es un String que representa la descripci�n del art�culo.
	 * 
	 */
	public String getDescripcion()
	{
		return descripcion;
	}
	
	
	
	/**
	 * Este m�todo se encargar� de establecer la descripci�n a un art�culo.
	 * 
	 * 
	 * @param descripci�n es un String que representa la descripci�n del art�culo.
	 * 
	 */
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	
	
	/**
	 * Este m�todo se encargar� de devolver la cantidad de un art�culo concreto.
	 * 
	 * 
	 * @return cantidad es un Integer que representa la cantidad del art�culo.
	 * 
	 */
	public int getCantidad()
	{
		return cantidad;
	}
	
	
	
	/**
	 * Este m�todo se encargar� de establecer la cantidad de un art�culo.
	 * 
	 * 
	 * @param cantidad es un Integer que representa la cantidad del art�culo.
	 * 
	 */
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	
	
	
	/**
	 * Este m�todo se encargar� de devolver la cantidad de un art�culo concreto.
	 * 
	 * 
	 * @return unidad es un String que representa la unidad de medida del art�culo.
	 * 
	 */
	public String getUnidad()
	{
		return unidad;
	}
	
	
	
	/**
	 * Este m�todo se encargar� de establecer la unidad de medida de un art�culo.
	 * 
	 * 
	 * @param unidad es un String que representa la unidad de medida del art�culo.
	 * 
	 */
	public void setUnidad(String unidad)
	{
		this.unidad = unidad;
	}
}