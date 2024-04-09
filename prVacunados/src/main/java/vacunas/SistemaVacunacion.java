package vacunas;

import java.util.Arrays;

public class SistemaVacunacion {
    private static final int CAP_INICIAL = 5;
    private int numPeople;
    private int vaccines;
    private Persona[] people;
    public SistemaVacunacion(){
        this.people=new Persona[CAP_INICIAL];
        this.vaccines = 0;
    }
    private int searchPerson(String n, int a){
        Persona aux = new Persona(n, a);
        boolean found = false;
        int pPos = 0;
        while(pPos < numPeople && !found){
            if(people[pPos].getName().equalsIgnoreCase(aux.getName()) && people[pPos].getAge()==aux.getAge()){
                found = true;
            }else{
                pPos++;
            }
        }
        if(!found){
            pPos=-1;
        }
        return pPos;
    }
    public void addPerson(String n, int a){
        Persona aux = new Persona(n, a);
        addGuy(aux);
    }

    protected void addGuy(Persona aux) {
        int help = searchPerson(aux.getName(), aux.getAge());
        if(help==-1) {
           if(numPeople==people.length){
               people = Arrays.copyOf(people, people.length*2);
               people[numPeople]=aux;
           }
            people[numPeople]=aux;
            numPeople++;
        }

    }
    public void buyVaccines(int num){
        if(num>0){
            this.vaccines+=num;
        }
    }
    public void vaccinate(int minAge, int maxAge){
        int aux = 0;
        while(aux<numPeople && vaccines>0){
            if(minAge<=people[aux].getAge()&&people[aux].getAge()<=maxAge){
                while(!people[aux].isInmune()){
                    people[aux].vaccinate();
                    this.vaccines-=1;
                }
            }
            aux++;
        }
    }

    @Override
    public String toString() {
        return "Vacunas : "+vaccines+" "+ Arrays.toString(people);
    }
}
