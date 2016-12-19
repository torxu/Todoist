

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListaTareasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaTareasTest
{
    private ListaTareas listaTar1;

    

    /**
     * Default constructor for test class ListaTareasTest
     */
    public ListaTareasTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        listaTar1 = new ListaTareas();
        listaTar1.añadirTarea("comer");
        listaTar1.añadirTarea("correr");
        listaTar1.añadirTarea("jugar");
        listaTar1.añadirTarea("dormir");
        listaTar1.verTodasLasTareas();
        listaTar1.definirFecha(1995, 2, 23, 2);
        listaTar1.verTodasLasTareas();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
