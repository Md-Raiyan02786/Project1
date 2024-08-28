package MyPackage;

public class Rectangle {
	int a;
	int b;
	public int area() {
		return a*b;
	}
	public int perimeter() {
		return 2*(a+b);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

}
