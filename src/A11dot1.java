
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
	protected String color = "white";
	protected boolean filled;
	private java.util.Date dateCreated;
	
	void setColor(String aColor, boolean aFill)
	{
		color = aColor;
		filled = aFill;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	void setColor(String color)
	{
		this.color = color;
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

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

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
		double s = (side1 + side2 + side3)/2;
		area = Math.sqrt(s*(s - side1)*(s-side2)*(s-side3));
		return area;
		
	}
	
	public String toString()
	{	
		String triangle = ("Triangle: side1 = " + side1 + " side2 = " + side2
				+ " side3 = " + side3);
		
		return triangle;
	}
}


