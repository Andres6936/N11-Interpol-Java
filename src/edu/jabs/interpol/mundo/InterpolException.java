package edu.jabs.interpol.mundo;

/**
 * Clase que representa una excepción lanzada cuando ocurre un error al cargar
 * el mundo.
 */
public class InterpolException extends Exception
{
	/**
	 * Constructor por parámetros.
	 * 
	 * @param mensaje Mensaje a mostrar
	 */
	public InterpolException( String mensaje )
	{
		super( mensaje );
	}

}