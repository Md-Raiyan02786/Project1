7package MyPackage;

public class Student {
	private int id;
	private String name;
	private char gender;
	private String branch;
	
	public int getId() {
		return id;
	}
	public boolean setId(int id) {
		if(id>100000000 && id<999999999) {
			this.id=id;
			return true;
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		if(name=='A-Z'||name=='a-z') {
			this.name=name;
			return true;
		}
		 return false;
	}
	public char getGender() {
		return gender;
	}
	public boolean setGender(char gender) {
		if(gender=='M' || gender=='F' || gender=='m' || gender=='f') {
		this.gender = gender;
		return true;
		}
		return false;
	}
	public String getBranch() {
		return branch;
	}
	public boolean setBranch(String branch) {
		if(branch=="ECE"||branch=="CSE"||branch=="ME"||branch=="ECSE"||branch=="CE"||branch=="BT"||branch=="BCA"||branch=="MCA") {
			this.branch=branch;
			return true;
		}
		return false;
	}
	
	

}
