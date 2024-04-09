package vacunas;

public class PersonaDosis extends Persona{
    private int vaccineDosisGiven;
    private int vaccineDosisNeeded;
    public PersonaDosis(String n, int a, int v){
        super(n,a);
        if(v<=0){
            throw new RuntimeException("Esta persona no necesita ninguna dosis de vacuna");
        }else{
            this.vaccineDosisNeeded = v;
        }
    }

    @Override
    public void vaccinate() {
        if(this.vaccineDosisGiven!=this.vaccineDosisNeeded){
            this.vaccineDosisGiven+=1;
            if(this.vaccineDosisGiven==this.vaccineDosisNeeded){
                this.inmune=true;
            }
        }
    }
}
