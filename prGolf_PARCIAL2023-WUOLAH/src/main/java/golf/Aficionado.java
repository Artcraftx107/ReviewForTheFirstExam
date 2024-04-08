package golf;

public class Aficionado {
    private int skillIssue;
    public Aficionado(String name, int score){
        if(1<=score && score<=54){
            Jugador rookie = new Jugador(name);
            this.skillIssue = score;
        }else{
            throw new IllegalArgumentException("El handicap indicado no es valido.");
        }
    }
    public int score(){
        int finalScore =
    }
}
