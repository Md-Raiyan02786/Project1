package MyPackage;

public class Cuboid {
	//private data members
	private double length;
	private double breadth;
	private double height;
	
	//accessors or getters method
	public String getLength() {
		return this.length+" metres";
	}
	
	public String getBreadth() {
		return this.breadth+" metres";
	}
	
	public String getHeight() {
		return this.height+" metres";
	}
	
	public double volume() {
		return this.length * this.breadth * this.height +;
	}
	
	//Mutators or Setters method
	public boolean setLength(double length) {
		if(length>=1.0) {
			this.length=length;
			return true;
		}
		return false;
	
	}
	
	public boolean setBreadth(double breadth) {
		if(breadth>=1.0) {
			this.breadth=breadth;
			return true;
		}
		return false;
	}
	
	public boolean setHeight(double height) {
		if(height>=1.0) {
			this.height=height;
			return true;
		}
		return false;
	}
}

	 
