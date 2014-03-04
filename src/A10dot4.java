import java.util.Scanner;


public class A10dot4 {

	public static void main(String[] args) {
		// This program does something cool
		
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		
		double distance = point1.distance(point1, point2);
		
		System.out.printf("The distance between the two given points is: %.2f" ,distance);
		System.out.println();
		
		distance = point2.distance(point2);
		
		System.out.printf("The distance between the two given points is: %.2f" ,distance);
		System.out.println();

	}

}


class MyPoint {
	double x = 0;
	double y = 0;
	
	MyPoint() {}
	MyPoint(double newX, double newY) {
		x = newX;
		y = newY;
	}
	
	public double getX() {return x;}
	public double getY() {return y;}
	
	public double distance(MyPoint point1, MyPoint point2) {
		double distance = 0;
		
		// DO SOME MATH
		distance = Math.sqrt(Math.pow((point2.x-point1.x), 2)+Math.pow((point2.y-point1.y), 2));
		
		return distance;
	}
	
	public double distance(MyPoint point1) {
		Scanner input = new Scanner(System.in);
		double distance = 0;
		
		MyPoint customPoint = new MyPoint(0, 0);
		
		// Do Some Math
		
		distance = Math.sqrt(Math.pow((customPoint.x-point1.x), 2)+Math.pow((customPoint.y-point1.y), 2));
		
		
		return distance;
	}
	
}
