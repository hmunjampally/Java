package triangle;

import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest
{
    @Test
    public void isEquilateralExpectTrue()
    {
        Triangle t = new Triangle(10,10,10);
        boolean result = t.isEquilateral();
        assertEquals("isEquilateral() "+t, true, result);
    }


    @Test
    public void isEquilateralExpect()
    {
        Triangle t = new Triangle(0,0,0);  // triangle is not possible but clears the test case
        boolean result = t.isEquilateral();
        assertEquals("isEquilateral() "+t, true, result);
    }


    @Test
    public void isIsoscelesExpectTrue()
    {
        Triangle t = new Triangle(1,2,1);  //the test case fails for this case which is supposed to be an isosceles
        boolean result = t.isIsosceles();
        assertEquals("isIsosceles() "+t, true, result);
    }


    @Test
    public void isIsoscelesExpectchec()
    {
        Triangle t = new Triangle(1,1,1);  
        boolean result = t.isEquilateral();
        assertEquals("isEquilateral() "+t, true, result);
    }


    @Test
    public void isScaleneExpectTrue()
    {
        Triangle t = new Triangle(30,5,6); // triangle is not possible but clears the test case
        boolean result = t.isScalene();
        assertEquals("isScalene() "+t, true, result);
    }


    @Test
    public void isScaleneExpect()
    {
        Triangle t = new Triangle(0,5,6);  // triangle is not possible but clears the test case
        boolean result = t.isScalene();
        assertEquals("isScalene() "+t, true, result);
    }



    @Test
    public void isIscoExpectdiff()
    {
        Triangle t = new Triangle(1,1,2);  // triangle throws error which is supposed to be an Isosceles
        boolean result = t.isIsosceles();
        assertEquals("isScalene() "+t, true, result);
    }
}
