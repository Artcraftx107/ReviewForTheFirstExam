import vacunas.*;

public class TestSistemaVacunacion {
    public static void main(String[] args) {
        // Creating an instance of the vaccination system
        SistemaVacunacion sistemaVacunacion = new SistemaVacunacion();

        // Adding people to the system
        sistemaVacunacion.addPerson("Alice", 30);
        sistemaVacunacion.addPerson("Bob", 40);
        sistemaVacunacion.addPerson("Charlie", 25);
        sistemaVacunacion.addPerson("David", 50);
        sistemaVacunacion.addPerson("Emma", 35);

        // Buying vaccines
        sistemaVacunacion.buyVaccines(10);

        // Vaccinating people between 25 and 40 years old
        sistemaVacunacion.vaccinate(25, 40);

        // Displaying the status of the vaccination system
        System.out.println(sistemaVacunacion);
    }
}

