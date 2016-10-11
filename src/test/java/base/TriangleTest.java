package base;

import static org.junit.Assert.*;
import org.junit.Test;
import base.TriangleException;

public class TriangleTest {

	//Testing Getters for Triangle
	@Test
	public void getterTester() throws TriangleException{
		Triangle tTriangle = new Triangle(3,4,5);
		assertTrue(tTriangle.getSide1() == 3);
		assertTrue(tTriangle.getSide2() == 4);
		assertTrue(tTriangle.getSide3() == 5);	
	}
	
	//Testing Perimeter for Triangle
	@Test
	public void perimeterTester() throws TriangleException{
		Triangle tTriangle = new Triangle(3,4,5);
		double RESULT = tTriangle.getPerimeter();
		double EXPECTED = 12.0;
		assertTrue(RESULT == EXPECTED);
	}
	//Testing Area for Triangle
	@Test
	public void areaTester() throws TriangleException{
		Triangle tTriangle = new Triangle(3,4,5);
		double RESULT = tTriangle.getArea();
		double EXPECTED = 6.0;
		System.out.println(RESULT);
		assertTrue(RESULT == EXPECTED);
	}
	//Testing String Output for Triangle, which works as intended!
	@Test
	public void stringTester() throws TriangleException{
		Triangle tTriangle = new Triangle(3,4,5);
		System.out.println(tTriangle.toString());
	}
	@Test(expected = TriangleException.class)
	public void exceptionTester() throws TriangleException{
		Triangle side1Tri = new Triangle(100, 5, 5);
		side1Tri.getSide1();
		
		Triangle side2Tri = new Triangle(5, 100, 5);
		side2Tri.getSide2();
		
		Triangle side3Tri = new Triangle(5, 5, 100);
		side3Tri.getSide3();
	}
}
