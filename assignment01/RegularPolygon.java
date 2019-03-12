
// 9.9 (Geometry: n-sided regular polygon) In an n-sided regular polygon, all sides have
// the same length and all angles have the same degree (i.e., the polygon is both equilateral
// and equiangular). Design a class named RegularPolygon that contains:

public class RegularPolygon {
	
	// Properties
	
	// number of sides in the polygon
	private int n = 3;

	// length of the side
	private double side = 1.0;
	
	// x-coordinate of the polygon’s center
	private double x = 0.0;
	
	// y-coordinate of the polygon’s center
	private double y = 0.0;
	
	// Constructors
	
	// A no-arg constructor that creates a regular polygon with default values. 
	RegularPolygon() {
		n = 3;
		side = 1.0;
		x = 0.0;
		y = 0.0;
	};

	// A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
	RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}
	
	// A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
	RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	// Getters and setters

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
		
	
	// Methods
	
	// returns the perimeter of the polygon (P = n * s)
	public double getPerimeter() {
		return this.n * this.side;
	}

	// returns the area of the polygon
	public double getArea() {
		return (this.n * Math.pow(this.side,2)) / (4 * Math.tan(Math.PI/this.n));
	}
	
	// displays perimeter and area
	public static void displayInfo(RegularPolygon regPol, String name) {
		System.out.println("============================");
		System.out.println("Info about " + name + ":");
		System.out.println("Perimeter: " + regPol.getPerimeter());
		System.out.println("Area: " + Math. round(regPol.getArea() * 100.0) / 100.0);
	}
	
	
	public static void main(String[] args) {
		// Write a test program that creates three RegularPolygon objects, created using the no-arg constructor,
		// using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8).
		// For each object, display its perimeter and area.
		
		RegularPolygon regPol1 = new RegularPolygon();
		RegularPolygon regPol2 = new RegularPolygon(6, 4);
		RegularPolygon regPol3 = new RegularPolygon(10, 4, 5.6, 7.8);	
		
		displayInfo(regPol1, "regPol1");
		displayInfo(regPol2, "regPol2");
		displayInfo(regPol3, "regPol3");
		
	}

}
