package week8;
import java.util.Scanner;
interface Shape {
	public short calculateArea();
}
class Rectangle implements Shape{
	short length;
	short width;
	Rectangle(){
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter length of rectangle...");
		length=inScanner.nextShort();
		System.out.println("enter width of rectangle...");
		width=inScanner.nextShort();
	}
	public short calculateArea() {
		return (short) (length*width);
	}
}
class Circle implements Shape{
	public short radius;
	Circle(){
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter radius of circle...");
		radius=inScanner.nextShort();
	}
	public short calculateArea() {
		return (short) (3.147*radius*radius);
	}
}
class Square implements Shape{
	short side;
	Square(){
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter side of Square...");
		side=inScanner.nextShort();
		inScanner.close();
	}
	public short calculateArea() {
		return (short) (side*side);
	}
}
class invokeShape {
	public short calculateshapeArea(Shape iShape) {
		return iShape.calculateArea();
	}
}
public class opencloseprinciple {
	public static void main(String[] args) {
		invokeShape is=new invokeShape();
		Rectangle Rect=new Rectangle();
		Circle cir=new Circle();
		Square sqr=new Square();
		short rarea=is.calculateshapeArea(Rect);
		short carea=is.calculateshapeArea(cir);
		short sarea=is.calculateshapeArea(sqr);
		System.out.println("****************output*******************");
		System.out.println("Area of rectangle is:"+rarea);
		System.out.println("Area of circle is:"+carea);
		System.out.println("Area of square is:"+sarea);
		}
}
