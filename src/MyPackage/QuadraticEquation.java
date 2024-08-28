package MyPackage;

 class QuadraticEquation {
    // Private data fields for coefficients
    private double a;
    private double b;
    private double c;

    // Constructor to initialize the coefficients
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods for the coefficients
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to calculate the discriminant (b^2 - 4ac)
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Method to calculate the first root
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // Root is not real
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    // Method to calculate the second root
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // Root is not real
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
    
    
        public static void main(String[] args) {
            // Create a QuadraticEquation object with coefficients a = 1, b = -3, c = 2
            QuadraticEquation equation = new QuadraticEquation(1, -2, 1);

            // Output the roots
            System.out.println("Root 1: " + equation.getRoot1());
            System.out.println("Root 2: " + equation.getRoot2());
        }
    }



