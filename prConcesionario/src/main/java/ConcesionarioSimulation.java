import concesionario.*;

public class ConcesionarioSimulation {
    public static void main(String[] args) {
        // Create a new car dealership
        Concesionario dealership = new Concesionario();

        // Add some cars to the dealership
        dealership.anyadirCoche(new Coche("Toyota Camry", 25000.0));
        dealership.anyadirCoche(new Coche("Honda Civic", 22000.0));
        dealership.anyadirCoche(new Coche("Ford Mustang", 35000.0));

        // Display the dealership inventory
        System.out.println("Dealership inventory:");
        System.out.println(dealership);

        // Remove a car from the dealership
        System.out.println("\nRemoving Ford Mustang...");
        dealership.removeCar("Ford Mustang");

        // Display the updated dealership inventory
        System.out.println("Updated dealership inventory:");
        System.out.println(dealership);

        // Find the cheapest car in the dealership
        Coche cheapestCar = dealership.cheapestCar();
        System.out.println("\nCheapest car in the dealership:");
        System.out.println(cheapestCar);
    }
}

