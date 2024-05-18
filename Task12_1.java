package Day_14_Methods_Cont;

public class Task12_1 {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1; // Invalid parameters
        }

        // Calculate total inches
        double totalInches = feet * 12 + inches;

        // Convert inches to centimeters
        double centimeters = totalInches * 2.54;

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1; // Invalid parameter
        }

        // Convert inches to feet
        double feet = inches / 12;

        // Call the overloaded method
        return calcFeetAndInchesToCentimeters(feet, 0);
    }

    public static void main(String[] args) {
        // Example usage
        double feet = 5;
        double inches = 10;
        double centimeters = calcFeetAndInchesToCentimeters(feet, inches);
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");

        double inchesOnly = 70;
        double feetFromInches = calcFeetAndInchesToCentimeters(inchesOnly);
        System.out.println(inchesOnly + " inches = " + feetFromInches + " feet");
    }
}
