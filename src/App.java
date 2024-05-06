import java.util.Scanner; // Import the Scanner class

public class App {

    // Method to calculate the circumference of a circle
    public static double circleCircumference(double radius) {
        double circum = 2 * Math.PI * radius;
        return circum;
    }

    // Method to calculate the area of a circle
    public static double areaOfACircle(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the radius of the circle:");

        // Check if the next input is a double
        if (scanner.hasNextDouble()) {
            double radius = scanner.nextDouble(); // Read user input for radius
            System.out.println("Circumference of the circle: " + circleCircumference(radius));
            System.out.println("Area of the circle: " + areaOfACircle(radius));
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        scanner.close(); // Close the scanner
    }
}
