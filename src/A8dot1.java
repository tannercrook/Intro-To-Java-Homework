
public class A8dot1 {

	public static void main(String[] args) {
		// Main Method
		
		double aWidth = 4;
		double aHeight = 40;
		
		double bWidth = 3.5;
		double bHeight = 35.9;
		
		Rectangle a = new Rectangle(aWidth, aHeight);
		Rectangle b = new Rectangle(bWidth, bHeight);
		
		System.out.println("Rectangle A");
		System.out.println("Width: " + aWidth + " Height: " + aHeight + " Area: " + a.getArea() + " Perimeter: " + a.getPerimeter());
		System.out.println();
		System.out.println("Rectangle B");
		System.out.println("Width: " + bWidth + " Height: " + bHeight + " Area: " + b.getArea() + " Perimeter: " + b.getPerimeter());
		
		

	}

}


/* ==============================
 * RECTANGLE CLASS ==============
 * ==============================
 */
class Rectangle {
	double width = 1;
	double height = 1;
	
	
	
Rectangle() {}
	
Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

double getArea() {
	double area = 0;
	
	area = width * height;
	
	return area;
}

double getPerimeter() {
	double perimeter;
	
	perimeter = (width * 2) + (height * 2);
	
	return perimeter;
	
	}
}
	
