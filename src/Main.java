import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double meter = 0;
        boolean done = false;
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;

        //Loops until user enters valid meter measurement
        do {
            System.out.println("Enter a meter measurement: ");
            if (scan.hasNextDouble()) {
                meter = scan.nextDouble();
                if (meter <= 0) {
                    System.out.println("Invalid meter measurement");
                    scan.nextLine();
                } else {
                    done = true;
                }
            } else {
                System.out.println("Invalid meter measurement");
                scan.nextLine();
            }
        } while (!done);

        //convert meters to miles, feet, and inches then prints
        System.out.printf("%-10s %.2f","Meters:",meter);
        System.out.printf("\n%-10s %.2f","Miles:",meter*METERS_TO_MILES);
        System.out.printf("\n%-10s %.2f","Feet:",meter*METERS_TO_FEET);
        System.out.printf("\n%-10s %.2f","Inches:",meter*METERS_TO_INCHES);

    }
}
