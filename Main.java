package Vehicle;

// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Vehicle Rental System");
        System.out.println("Enter vehicle type (car/bike): ");
        String type = s.nextLine();

        Vehicle v = VehicleFactory.getVehicle(type);

        if (v != null) {
            v.rent();
        } else {
            System.out.println("Invalid vehicle type!");
        }

        s.close();
    }
}