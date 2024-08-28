package ObjectPackage;

public class Student {
    // Private attributes
    private String name;
    private long id;
    private char gender;
    private String department;

    // Setter method for Name with validation
    public void setName(String name) {
        if (name.matches("[A-Za-z ]+")) {
            this.name = name;
        } else {
            System.out.println("Invalid Name: Name should not contain any special characters or digits.");
        }
    }

    // Setter method for ID with validation
    public void setId(long id) {
        if (String.valueOf(id).matches("\\d{9}")) {
            this.id = id;
        } else {
            System.out.println("Invalid ID: ID must be a positive 9-digit value.");
        }
    }

    // Setter method for Gender with validation
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Invalid Gender: Gender must be either 'M' or 'F'.");
        }
    }

    // Setter method for Department with validation
    public void setDepartment(String department) {
        if (department.matches("BT|CE|CSE|ECE|EEE|ECS|ME|PE")) {
            this.department = department;
        } else {
            System.out.println("Invalid Department: Department must be one of BT/CE/CSE/ECE/EEE/ECS/ME/PE.");
        }
    }

    // toString method to display student details
    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nGender: " + gender + "\nDepartment: " + department;
    }

    public static void main(String[] args) {
        // Creating two Student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Setting attributes for student1
        student1.setName("ABC");
        student1.setId(190030000);
        student1.setGender('M');
        student1.setDepartment("CSE");

        // Setting attributes for student2
        student2.setName("XYZ");
        student2.setId(190030001);
        student2.setGender('F');
        student2.setDepartment("ECE");

        // Printing details of the students
        System.out.println(student1);
        System.out.println("\n" + student2);
    }
}
