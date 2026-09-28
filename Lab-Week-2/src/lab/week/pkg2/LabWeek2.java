package lab.week.pkg2;

import java.util.Scanner;

public class LabWeek2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of stops on the route: ");
        
        int numStops = scanner.nextInt();

        System.out.print("Enter the bus's seating capacity: ");
        
        int seatingCapacity = scanner.nextInt();
        
        scanner.nextLine();

        String[] stopNames = new String[numStops];
        
        int[] boarding = new int[numStops];
        
        int[] alighting = new int[numStops];
        
        int[] occupancy = new int[numStops];   

        for (int i = 0; i < numStops; i++) {
            System.out.println("\n--- Stop " + (i + 1) + " ---");
            
            System.out.print("Stop name: ");
            
            stopNames[i] = scanner.nextLine();

            System.out.print("Passengers boarding: ");
            
            boarding[i] = scanner.nextInt();

            System.out.print("Passengers alighting: ");
            
            alighting[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        int currentPassengers = 0;
        
        int overCapacityCount = 0;
        
        int totalOccupancy = 0;

        System.out.println("\n=== Route Progression ===");
        for (int i = 0; i < numStops; i++) {
            currentPassengers += boarding[i] - alighting[i];

            if (currentPassengers < 0) {
                
                System.out.println("Data error at " + stopNames[i] + ": cannot have more passengers alighting than are currently on the bus. Occupancy set to 0.");
                currentPassengers = 0;
                
            }

            occupancy[i] = currentPassengers;
            
            totalOccupancy += currentPassengers;

            System.out.println("Stop: " + stopNames[i] + " | Current passengers: " + currentPassengers);

            if (currentPassengers > seatingCapacity) {
                
                System.out.println("Warning: Bus is over capacity at " + stopNames[i] + "!");
                
                overCapacityCount++;
            }
        }

        System.out.println("\n=== All Stops Summary ===");
        
        for (int i = 0; i < numStops; i++) {
            
            System.out.println("Stop: " + stopNames[i] 
                    
                    + " | Boarding: " + boarding[i] 
                    
                    + " | Alighting: " + alighting[i] 
                    
                    + " | Current Occupancy: " + occupancy[i]);
        }

        int maxBoarding = -1;
        
        String busiestStop = "";
        
        for (int i = 0; i < numStops; i++) {
            
            if (boarding[i] > maxBoarding) {
                
                maxBoarding = boarding[i];
                
                busiestStop = stopNames[i];
                
            }
        }

        double averageOccupancy = numStops > 0 ? (double) totalOccupancy / numStops : 0;

        System.out.println("\n=== Statistics ===");
        
        System.out.println("Busiest stop (highest boarding): " + busiestStop + " (" + maxBoarding + " passengers)");
        
        System.out.printf("Average occupancy across all stops: %.2f\n", averageOccupancy);
        
        System.out.println("Number of stops exceeding bus capacity: " + overCapacityCount);
        

        int finalOccupancy = (numStops > 0) ? occupancy[numStops - 1] : 0;
        
        if (finalOccupancy != 0) {
            
            System.out.println("Warning: " + finalOccupancy + " passengers still on the bus after the final stop — please check your data.");
            
        }

    }
}