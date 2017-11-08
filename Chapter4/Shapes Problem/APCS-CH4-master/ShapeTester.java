

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ShapeTester
{
    private labs.apcs_CH4_lab_1_STUDENT.Shape square;
    private labs.apcs_CH4_lab_1_STUDENT.Shape pentagon;
    private labs.apcs_CH4_lab_1_STUDENT.Shape hexgaon;

    /**
     * Default constructor for test class Test
     */
    public ShapeTester()
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
        square = new labs.apcs_CH4_lab_1_STUDENT.Shape(4, 3);
        square.calculateArea();
        pentagon = new labs.apcs_CH4_lab_1_STUDENT.Shape(5, 6);
        pentagon.calculateArea();
        hexgaon = new labs.apcs_CH4_lab_1_STUDENT.Shape(6, 10);
        hexgaon.calculateArea();
        
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

    @Test
    public void area()
    {
        assertEquals(61.937, pentagon.calculateArea(), 0.1);
        assertEquals(259.8076, hexgaon.calculateArea(), 0.1);
        assertEquals(9, square.calculateArea(), 0.1);
    }

    @Test
    public void perimeter()
    {
        assertEquals(12, square.getPerimeter(), 0.1);
        assertEquals(60, hexgaon.getPerimeter(), 0.1);
        assertEquals(30, pentagon.getPerimeter(), 0.1);
    }

    @Test
    public void apothem()
    {
        assertEquals(2.5, square.getApothem(4, 5), 0.1);
        assertEquals(10.3923, hexgaon.getApothem(6, 12), 0.1);
        assertEquals(8.25829, pentagon.getApothem(5, 12), 0.1);
    }

    @Test
    public void interiorAngle()
    {
        assertEquals(90, square.interiorAngle(4), 0.1);
        assertEquals(120, hexgaon.interiorAngle(6), 0.1);
        assertEquals(108, pentagon.interiorAngle(5), 0.1);
    }

    @Test
    public void exteriorAngle()
    {
        assertEquals(90, square.exteriorAngle(4), 0.1);
        assertEquals(60, hexgaon.exteriorAngle(6), 0.1);
        assertEquals(72, pentagon.exteriorAngle(5), 0.1);
    }
}





