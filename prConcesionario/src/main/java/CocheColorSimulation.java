import concesionario.*;
public class CocheColorSimulation {
    public static void main(String[] args) {
        // Creating CocheColor objects

        // Using constructor with color as string
        CocheColor car1 = new CocheColor("Toyota Camry", 25000.0, "Negro");

        // Using constructor with color as enum
        CocheColor car2 = new CocheColor("Honda Civic", 22000.0, Color.Azul);

        // Using setColourString method
        CocheColor car3 = new CocheColor("Ford Mustang", 35000.0, "Rojo");

        // Displaying the details of the cars
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);

        // Getting the base price of car3 after changing the color
        System.out.println("Base price of Car 3 after changing color: " + car3.getPrecioBase()+"\n");

        // Displaying the available colors
        System.out.println("Available colors:");
        String[] availableColors = CocheColor.coloursAvailable();
        for (String color : availableColors) {
            System.out.println(color);
        }
    }
}
