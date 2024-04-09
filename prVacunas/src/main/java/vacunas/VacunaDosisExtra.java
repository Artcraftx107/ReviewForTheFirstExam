package vacunas;

public class VacunaDosisExtra extends Vacuna{
    public VacunaDosisExtra(String c, int v, int d){
        super(c, d, v);
    }
    public int dosisTotales(){
        return super.dosisTotales()+dosis;
    }

    @Override
    public String toString() {
        return super.toString()+" + "+getViales()+" extra";
    }
}
