package golf;

public class Aficionado extends Jugador{
    private int skillIssue;
    public Aficionado(String name, int score){
        super(name);
        if(1<=score && score<=54){
            this.skillIssue = score;
        }else{
            throw new IllegalArgumentException("El handicap indicado no es valido.");
        }
    }
    public int score(){
        return super.score()-skillIssue;
    }

    @Override
    public String toString() {
        return "nombre= "+super.getName()+", golpes= "+super.score()+", handicap= "+skillIssue;
    }
}
