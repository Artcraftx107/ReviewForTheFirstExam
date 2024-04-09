package vacunas;

public class Persona {
    private String name;
    private int age;
    boolean inmune;
    public Persona(String n, int a){
        if(a<0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }else{
            this.name=n;
            this.age=a;
            this.inmune=false;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isInmune() {
        return inmune;
    }
    public void vaccinate(){
        this.inmune=true;
    }

    @Override
    public String toString() {
        return "("+getName()+", "+getAge()+", "+(inmune? "INMUNIDAZO" : "NO INMUNIZADO")+")";
    }
}
