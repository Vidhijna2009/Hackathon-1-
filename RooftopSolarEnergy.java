import java.util.Scanner;

public class RooftopSolarEnergy {
    
    // Method to calculate total energy
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read morning and evening energy values from user
        System.out.print("Enter morning energy generated (kWh): ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy generated (kWh): ");
        double eveningEnergy = sc.nextDouble();

        // Call the method
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        // Display the result
        System.out.println("Total Energy Generated (kWh): " + totalEnergy);

        sc.close();
    }
}
