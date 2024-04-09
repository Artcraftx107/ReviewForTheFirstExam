import vacunas.Vacuna;
public class PruebaVacuna {
    private static void iguales(Vacuna v, Vacuna b){
        if(v.getCodigo().equalsIgnoreCase(b.getCodigo())&&v.dosisTotales()==b.dosisTotales()){
            System.out.println("Las vacunas "+v+" y "+b+" son iguales");
        }else{
            System.out.println("Las vacunas "+v+" y "+b+" no son iguales");
        }
    }
    public static void main(String[] args){
        Vacuna v1 = new Vacuna("Moderna-001", 5, 100);
        Vacuna v2 = new Vacuna("AstraZeneca-001", 8, 200);
        Vacuna v3 = new Vacuna("astrazeneca-001", 10, 160);
        System.out.println("El numero total de dosis de la vacuna "+v1+" es "+v1.dosisTotales());
        System.out.println("El numero total de dosis de la vacuna "+v2+" es "+v2.dosisTotales());
        System.out.println("El numero total de dosis de la vacuna "+v3+" es "+v3.dosisTotales());
        iguales(v1, v2);
        iguales(v2,v3);
        iguales(v3,v1);
    }
}
