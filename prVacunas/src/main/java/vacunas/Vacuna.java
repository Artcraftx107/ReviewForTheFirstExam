package vacunas;

public class Vacuna {
    protected String codigo;
    protected int dosis;
    protected int viales;
    public Vacuna(String c, int d, int v){
        if(d<=0&&v<=0){
            throw new RuntimeException("El numero de viales o de dosis no puede ser menor o igual que 0");
        }else{
            this.codigo=c;
            this.dosis=d;
            this.viales=v;
        }
    }
    public String getCodigo(){
        return codigo;
    }

    public int getDosis() {
        return dosis;
    }

    public int getViales() {
        return viales;
    }
    public void setDosis(int num){
        if(num<=0){
            throw new RuntimeException("El nuevo numero de dosis no puede ser menor o igual que 0");
        }else{
            this.dosis=num;
        }
    }
    public void setViales(int num) {
        if(num<=0){
            throw new RuntimeException("El nuevo numero de viales no puede ser menor o igual que 0");
        }else{
            this.viales = num;
        }
    }
    public int dosisTotales(){
        return this.dosis*this.viales;
    }

    @Override
    public String toString() {
        return "("+getCodigo().toUpperCase()+": "+getViales()+" x "+getDosis() + " dosis)";
    }
}
