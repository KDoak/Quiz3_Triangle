package base;
//Quiz 3, Problem 1-2 created by Kevin Doak
public class Triangle extends GeometricObject {
	//Declaring constants
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/** Construct a default Triangle*/
	public Triangle(){
		super();
	}
	/** Construct a Triangle with three sides*/
	public Triangle(double s1, double s2, double s3){
		super();
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	/** Return side1 */
		public double getSide1() {
		return side1;
	}
	/** Return side2 */
	public double getSide2() {
		return side2;
	}
	/** Return side3 */
	public double getSide3() {
		return side3;
	}
	/** Override of getArea to work with Triangle and its three sizes. */
	@Override
	public double getArea() {
		double Sperimeter = getPerimeter()/2;
		double area = Math.sqrt(Sperimeter*(Sperimeter - side1)*(Sperimeter - side2)*(Sperimeter - side3));
		return area;
	}
	/** Override of getPerimeter to work with Triangle and its three sizes. */
	@Override
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	/** Takes Triangle sides, getArea(), and getPerimeter(), and returns a String Description. */

	public String toString(){
		return "Side 1 is: " + side1 + "\nSide 2 is: " + side2 + "\nSide 3 is: "+ side3 + "\nThe perimeter is: " + getPerimeter() + "\nThe area is: " + getArea();
	}
	
}
