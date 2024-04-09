import vacunas.*;

public class TestEverything {
    public static void main(String[] args) {
        // Simulating usage of SistemaVacunacion
        System.out.println("SIMULATING USAGE OF SistemaVacunacion");
        System.out.println("--------------------------------------");
        SistemaVacunacion sistemaVacunacion = new SistemaVacunacion();

        // Adding people to the system
        sistemaVacunacion.addPerson("Alice", 30);
        sistemaVacunacion.addPerson("Bob", 40);
        sistemaVacunacion.addPerson("Charlie", 25);
        sistemaVacunacion.addPerson("David", 50);
        sistemaVacunacion.addPerson("Emma", 35);
        //sistemaVacunacion.addPerson("Monkey", 39);

        // Buying vaccines
        sistemaVacunacion.buyVaccines(10);

        // Vaccinating people between 25 and 40 years old
        sistemaVacunacion.vaccinate(25, 40);

        // Displaying the status of the vaccination system
        System.out.println(sistemaVacunacion);
        System.out.println();

        // Simulating usage of SistemaVacunacionDosis
        System.out.println("SIMULATING USAGE OF SistemaVacunacionDosis");
        System.out.println("------------------------------------------");
        SistemaVacunacionDosis sistemaVacunacionDosis = new SistemaVacunacionDosis(2);

        // Adding people to the system with specified vaccine doses needed
        sistemaVacunacionDosis.addPerson("Eve", 20);
        sistemaVacunacionDosis.addPerson("Frank", 45);

        // Buying vaccines for the dosis system
        sistemaVacunacionDosis.buyVaccines(5);

        // Vaccinating people in the dosis system
        sistemaVacunacionDosis.vaccinate(20, 50);

        // Displaying the status of the vaccination system with dosis
        System.out.println(sistemaVacunacionDosis);
    }
}

