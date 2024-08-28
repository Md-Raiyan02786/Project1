package MyPackage;

public class Execute {

	public static void main(String[] args) {
		Cuboid c1 = new Cuboid();
		c1.setLength(12.6);
		System.out.println(c1.getLength());
		c1.setBreadth(4.4);
		System.out.println(c1.getBreadth());
		c1.setHeight(3.3);
		System.out.println(c1.getHeight());
		System.out.println(c1.volume());
		 
		}
	}


