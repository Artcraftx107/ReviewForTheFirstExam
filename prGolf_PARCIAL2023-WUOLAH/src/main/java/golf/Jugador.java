package golf;

public class Jugador {
    private int numHits;
    private String name;
    public Jugador(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void addHits(int hits){
        this.numHits+=hits;
    }
    public int score(){
        return numHits;
    }

    @Override
    public String toString() {
        return "nombre= "+getName()+", golpes= "+score();
    }
}
