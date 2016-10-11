package base;

import base.Triangle;

public class TriangleException extends Exception{
	private Triangle triTest;
	
	public TriangleException(Triangle triTest){
		super();
		this.triTest = triTest;
	}
	
	public Triangle getTriangle(){
		return triTest;
	}
}
