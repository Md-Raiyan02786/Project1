package MyPackage;

public class HelloJava {

	public static void main(String[] args) {
		 System.out.println("Welcome Back to my Eclipse.");
         Square sq=new Square();
         //sq.side=12.5;
         sq.setSide(12.5);
         double a = sq.area();
         System.out.println("Area:" +a +" metres");
         double p=sq.perimeter();
         System.out.println("Perimeter:"+p+" metres");
         System.out.println("For Rectangle:");
         Rectangle re=new Rectangle();
         re.a=6;
         re.b=5;
         int w=re.area();
         System.out.println("Area:" +w +" metres");
         int q=re.perimeter();
         System.out.println("Perimeter:" +q +" metres");
	}

}
