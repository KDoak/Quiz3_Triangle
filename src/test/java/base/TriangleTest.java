package base;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

	//Testing Getters for Triangle
	@Test
	public void getterTester(){
		Triangle tTriangle = new Triangle(3,4,5);
		assertTrue(tTriangle.getSide1() == 3);
		assertTrue(tTriangle.getSide2() == 4);
		assertTrue(tTriangle.getSide3() == 5);	
	}
	
	//Testing Perimeter for Triangle
	@Test
	public void perimeterTester(){
		Triangle tTriangle = new Triangle(3,4,5);
		double RESULT = tTriangle.getPerimeter();
		double EXPECTED = 12.0;
		assertTrue(RESULT == EXPECTED);
	}
	//Testing Area for Triangle
	@Test
	public void areaTester(){
		Triangle tTriangle = new Triangle(3,4,5);
		double RESULT = tTriangle.getArea();
		double EXPECTED = 6.0;
		System.out.println(RESULT);
		assertTrue(RESULT == EXPECTED);
	}
	//Testing String Output for Triangle, which works as intended!
	@Test
	public void stringTester(){
		Triangle tTriangle = new Triangle(3,4,5);
		System.out.println(tTriangle.toString());
	}
}
