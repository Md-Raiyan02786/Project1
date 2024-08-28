package MyPackage;

import java.util.Scanner;

public class CuboidArray {

	public static void main(String[] args) {
		 Cuboid arr[];
		 arr=new Cuboid[5];
		/* arr[0]=new Cuboid();
		 arr[1]=new Cuboid();
		 arr[2]=new Cuboid();
		 arr[3]=new Cuboid();
		 arr[4]=new Cuboid();*/
		 
		 Scanner sc=new Scanner(System.in)
		 System.out.println("Read the values fo each object");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Read the values for"i"th values");
			 arr[i]=new Cuboid();
			 double l=sc.nextDouble();
			 arr[i].setLength(l);
			 double b=sc.nextDouble();
			 arr[i].setBreadth(b);
			 double h=sc.nextDouble();
			 arr[i].setHeight(h);
	 }
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }

	}

}

