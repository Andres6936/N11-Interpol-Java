package edu.jabs.interpol.mundo;

/**
 * Clase que representa una excepción lanzada cuando ocurre un error al agregar
 * una ciudad.
 */
public class CiudadNoAgregadaException extends Exception
{
	/**
	 * Constructor por parámetros.
	 * 
	 * @param mensaje Mensaje a mostrar
	 */
	public CiudadNoAgregadaException( String mensaje )
	{
		super( mensaje );
	}
}