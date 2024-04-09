import vacunas.*;
public class PruebasAdicionales {
    public static void main(String[] args){
        //Create Vacuna
        Vacuna v1 = new Vacuna("PFIZER-001", 5, 150);
        System.out.println(v1);
        //Create VacunaDosisExtra
        VacunaDosisExtra vde1 = new VacunaDosisExtra("PFIZER-001", 150, 5);
        System.out.println(vde1);

        // Create AlmacenVacunas instances
        AlmacenVacunas carlosHaya = new AlmacenVacunas("Carlos Haya");
        AlmacenVacunas hospitalMaterno = new AlmacenVacunas("Hospital Materno");
        AlmacenVacunas hospitalClinico = new AlmacenVacunas("Hospital Clínico");

        // Store vaccines in AlmacenVacunas instances
        carlosHaya.almacenar("MODERNA-001", 5, 300);
        carlosHaya.almacenar("ASTRAZENECA-001", 8, 360);
        carlosHaya.almacenar("J&J-001", 10, 200);
        carlosHaya.almacenar("PFIZER-001", 6, 150);

        hospitalMaterno.almacenar("J&J-001", 10, 400);
        hospitalMaterno.almacenar("MODERNA-001", 10, 100);

        hospitalClinico.almacenar("PFIZER-001", 6, 200);

        // Display initial vaccine storage
        System.out.println(carlosHaya);
        System.out.println(hospitalMaterno);
        System.out.println(hospitalClinico);

        // Display total doses in Carlos Haya
        System.out.println("El número total de dosis en el Hospital Carlos Haya es: " + carlosHaya.totalDosis());

    }
}
