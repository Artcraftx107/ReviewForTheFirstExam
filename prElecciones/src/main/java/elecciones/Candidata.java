package elecciones;

public class Candidata {
    private String name;
    private String DNI;
    private String partido;
    private Sexo sexo;
    private static final String independiente = "Candidato/a Independiente";
    public static enum Sexo{
        F, M
    }
    public Candidata(String n, String id, Sexo s, String p){
        this.name=n;
        this.DNI=id;
        this.sexo=s;
        if(p == null){
            this.partido=independiente;
        }else{
            this.partido=p;
        }
    }
    public Candidata(String n, String id, Sexo s){
        this.name=n;
        this.DNI=id;
        this.sexo=s;
        this.partido=independiente;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getDNI(){
        return DNI;
    }
    public String getPartido(){
        return partido;
    }
    public void setPartido(String p){
        this.partido=p;
    }
    public boolean isIndependiente(){
        boolean independent = false;
        if(this.partido == independiente){
            independent=true;
        }else{
            independent=false;
        }
        return independent;
    }

    public Sexo getSexo() {
        return sexo;
    }
    public void changeSexo(){
        if(this.sexo==Sexo.F){
            this.sexo=Sexo.M;
        }else{
            this.sexo=Sexo.F;
        }
    }

    @Override
    public String toString() {
        String aux = this.name.toUpperCase();
        if(isIndependiente()){
            aux+=" (Independiente)";
        }
        return aux;
    }
}
