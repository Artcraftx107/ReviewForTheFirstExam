package vacunas;

public class SistemaVacunacionDosis extends SistemaVacunacion{
    private int vaccineDosis;
    public SistemaVacunacionDosis(int num){
        super();
        if(num<=0){
            throw new RuntimeException("El numero de dosis necesarias no puede ser menor o igual que 0");
        }else{
            this.vaccineDosis=num;
        }
    }

    @Override
    public void addPerson(String n, int a) {
        PersonaDosis aux = new PersonaDosis(n, a, vaccineDosis);
        addGuy(aux);
    }
}
