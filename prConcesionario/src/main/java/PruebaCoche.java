import concesionario.*;

public class PruebaCoche {
    public static void main(String[] args) {
        // Create a new car object
        Coche car1 = new Coche("Toyota Camry", 25000.0);

        // Display car details
        System.out.println("Car details:");
        System.out.println("Model: " + car1.getModel());
        System.out.println("Reference Number: " + car1.getNumRef());
        System.out.println("Base Price: $" + car1.getPrecioBase());
        System.out.println("Price for administrative procedures: $" + Coche.getPrecioTramites());
        System.out.println("IVA Rate: " + Coche.getPorcIVA() + "%");
        System.out.println("Final Price (including taxes and administrative fees): $" + car1.calcPrecioFinal());

        // Change base price
        System.out.println("\nChanging base price...");
        car1.setPrecioBase(27000.0);
        System.out.println("New base price: $" + car1.getPrecioBase());
        System.out.println("New final price (including taxes and administrative fees): $" + car1.calcPrecioFinal());

        // Change IVA rate
        System.out.println("\nChanging IVA rate...");
        Coche.setPorcIVA(15.0);
        System.out.println("New IVA rate: " + Coche.getPorcIVA() + "%");
        System.out.println("New final price (including taxes and administrative fees): $" + car1.calcPrecioFinal());

        // Display car details using toString method
        System.out.println("\nCar details using toString method:");
        System.out.println(car1);
    }
}

