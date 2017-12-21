package edu.jabs.interpol.test;

import edu.jabs.interpol.mundo.Sospechoso;
import junit.framework.TestCase;

/**
 * Esta es la clase usada para verificar que los métodos de la clase Sospechoso
 * estén correctamente implementados
 */
public class SospechosoTest extends TestCase
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Es la clase donde se harán las pruebas. Sospechoso ladrón
	 */
	private Sospechoso sospechoso1;

	/**
	 * Es la clase donde se harán las pruebas. Sospechoso que no es ladrón
	 */
	private Sospechoso sospechoso2;

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	/**
	 * Construye una nueva Lugar vacía
	 * 
	 */
	private void setupEscenario1( )
	{
		sospechoso1 = new Sospechoso( "Sospechoso1", false );
		sospechoso2 = new Sospechoso( "Sospechoso2", true );
	}

	/**
	 * Este método se encarga de verificar el método constructor y los
	 * analizadores<br>
	 * <b> Métodos a probar: </b> <br>
	 * Sospechoso<br>
	 * darRutaImagen<br>
	 * esLadron<br>
	 * <b> Objetivo: </b> Probar que se construye correctamente el objeto<br>
	 * <b> Resultados esperados: </b> <br>
	 * 1. Se construye un sospechoso con la ruta imagen "Sospechoso1" y no es
	 * ladrón<br>
	 * 2. Se obtienen los datos del sospechoso creado y concuerdan con los
	 * ingresados<br>
	 * 3. Se construye un sospechoso con la ruta imagen "Sospechoso2" y no es
	 * ladrón<br>
	 * 4. Se obtienen los datos del sospechoso creado y concuerdan con los
	 * ingresados<br>
	 */
	public void testSospechoso( )
	{
		setupEscenario1( );
		assertNotNull( "La ruta de la imagen del sospechoso no puede ser null", sospechoso1.darRutaImagen( ) );
		assertEquals( "La ruta de la imagen del sospechoso 1 es incorrecta", "Sospechoso1",
				sospechoso1.darRutaImagen( ) );
		assertFalse( "El sospechoso 1 no es el ladrón ", sospechoso1.esLadron( ) );

		assertNotNull( "La ruta de la imagen del sospechoso no puede ser null", sospechoso2.darRutaImagen( ) );
		assertEquals( "La ruta de la imagen del sospechoso 2 es incorrecta", "Sospechoso2",
				sospechoso2.darRutaImagen( ) );
		assertTrue( "El sospechoso 1 no es el ladrón ", sospechoso2.esLadron( ) );
	}
}