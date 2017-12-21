package edu.jabs.interpol.test;

import edu.jabs.interpol.mundo.Lugar;
import junit.framework.TestCase;

/**
 * Esta es la clase usada para verificar que los métodos de la clase Lugar estén
 * correctamente implementados
 */
public class LugarTest extends TestCase
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Es la clase donde se harán las pruebas
	 */
	private Lugar lugar;

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Construye una nueva Lugar vacía
	 * 
	 */
	private void setupEscenario1( )
	{
		lugar = new Lugar( "Banco", "Banco para cambiar dinero a dólares", 4 );
	}

	/**
	 * Este método se encarga de verificar el método constructor y los
	 * analizadores<br>
	 * <b> Métodos a probar: </b> <br>
	 * Lugar<br>
	 * darNombre<br>
	 * esLadron<br>
	 * darTiempoGastado<br>
	 * <b> Objetivo: </b> Probar que se construye correctamente el objeto<br>
	 * <b> Resultados esperados: </b> <br>
	 * 1. Se construye un lugar con el nombre "Banco", la pista "Banco para cambiar
	 * dinero a dólares" y con tiempo de 4<br>
	 * 2. Se obtienen los datos del sospechoso creado y concuerdan con los
	 * ingresados<br>
	 */
	public void testLugar( )
	{
		setupEscenario1( );
		assertNotNull( "El nombre del lugar no puede ser null", lugar.darNombre( ) );
		assertEquals( "El nombre del lugar es incorrecto", "Banco", lugar.darNombre( ) );
		assertNotNull( "La pista del lugar no puede ser null", lugar.darPista( ) );
		assertEquals( "La pista del lugar es incorrecta", "Banco para cambiar dinero a dólares", lugar.darPista( ) );
		assertEquals( "El tiempo gastado mirando la pista es incorrecto", 4, lugar.darTiempoGastado( ) );
	}

}
