package edu.jabs.interpol.mundo;

/**
 * Lugar de la ciudad donde se puede encontrar una pista <br>
 * <b>inv:</b> El nombre y la pista deben ser diferentes de null, el
 * tiempoGastado debe ser mayor a cero<br>
 */
public class Lugar
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Nombre del lugar
	 */
	private String nombre;

	/**
	 * Pista que se encuentra en el lugar
	 */
	private String pista;

	/**
	 * Tiempo que se gasta averiguando la pista en este lugar. Tiempo dado en días
	 */
	private int tiempoGastado;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Constructor por parámetros. Inicializa los atributos. <br>
	 * <b>post:</b> nombre = nNombre, pista = nPista, tiempoGastado =
	 * nTiempoGastado<br>
	 */
	public Lugar( String nNombre, String nPista, int nTiempoGastado )
	{
		nombre = nNombre;
		pista = nPista;
		tiempoGastado = nTiempoGastado;
		verificarInvariante( );
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Retorna el nombre del lugar.
	 * 
	 * @return Cadena de caracteres con el nombre del lugar. Diferente de null.
	 */
	public String darNombre( )
	{
		return nombre;
	}

	/**
	 * Retorna el tiempo que se gasta averiguando la pista.
	 * 
	 * @return Entero mayor o igual a cero.
	 */
	public int darTiempoGastado( )
	{
		return tiempoGastado;
	}

	/**
	 * Retorna la pista que se encuentra en este lugar.
	 * 
	 * @return Cadena de caracteres con la pista. Diferente de null
	 */
	public String darPista( )
	{
		return pista;
	}

	/**
	 * Verifica la invariante de la clase. <br>
	 * <b>inv:</b> El nombre y la pista deben ser diferentes de null, el
	 * tiempoGastado debe ser mayor a cero<br>
	 */
	private void verificarInvariante( )
	{
		assert nombre != null : "El nombre del lugar no puede ser null";
		assert pista != null : "La pista del lugar no puede ser null";
		assert tiempoGastado > 0 : "El tiempo gastado debería ser positivo";
	}
}