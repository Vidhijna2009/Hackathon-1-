public class RooftopSolarSystem {
    public static void main(String[] args) {
        // Declare and initialize variables
        int panelID = 101;                  // integer
        double energyGenerated = 2450.75;   // decimal value (kWh)
        int numberOfPanels = 12;            // integer
        char systemStatus = 'A';            // character (Active/Inactive)
        int solarEnergyNo = 56789;          // integer (unique solar energy number)

        // Display the details
        System.out.println(" Rooftop Solar System Details ");
        System.out.println("Panel ID: " + panelID);
        System.out.println("Energy Generated (kWh): " + energyGenerated);
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
        System.out.println("Solar Energy No: " + solarEnergyNo);
    }
}
