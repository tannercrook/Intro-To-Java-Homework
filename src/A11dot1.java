
public class A11dot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lets test
		Triangle test = new Triangle(12,25,5);
		test.setColor("Blue", true);
		
		System.out.println(test.toString());
		

	}



}

class GeometricObject
{
	protected double area;
	protected double perimeter;
	protected String color;
	protected boolean filled;
	
	void setColor(String aColor, boolean aFill)
	{
		color = aColor;
		filled = aFill;
	}
	
	String getColor()
	{
		return color;
	}
	
	String getFill()
	{
		if (filled)
		{
			return "Filled";
		} else {
			return "Un-filled";
		}
	}
}

class Triangle extends GeometricObject
{
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;

	// Default no-args
	Triangle() {}

	// Specified
	Triangle(double aSide1, double aSide2, double aSide3)
	{
		side1 = aSide1;
		side2 = aSide2;
		side3 = aSide3;
	}

	// Get Area
	double getPerimeter()
	{
		perimeter = side1 + side2 + side3;
		return perimeter;
	}

	double getArea()
	{
		double s = side1 + side2 + side3/2;
		area = Math.sqrt(s*(s - side1)*(s-side2)*(s-side3));
		return area;
		
	}
	
	public String toString()
	{	
		String triangle = ("Triangle: Area: "+ getArea() + " " + "Perimeter: " + getPerimeter() + " " 
		+ "Color: " + getFill() + " " + getColor());
		
		return triangle;
	}
}


