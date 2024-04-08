package golf;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private List<Jugador> inscritos;
    private int parCampo;
    public Torneo(List<Jugador> players, int par){
        this.parCampo=par;
        this.inscritos=players;
    }
    private int search(String name){
        boolean found = false;
        int aux = 0;
        while(aux<inscritos.size() && !found){
            if(name==inscritos.get(aux).getName()){
                found = true;
            }else{
                aux++;
            }
        }
        if(!found){
            aux=-1;
        }
        return aux;
    }
    public void addHits(String name, int hits){
        int aux = search(name);
        if(aux!=-1){
            inscritos.get(aux).addHits(hits);
        }else{
            throw new RuntimeException("Este jugador no esta inscrito en el torneo indicado.");
        }
    }
    public int cardOf(String name){
        int total;
        int found = search(name);
        if(found!=-1){
            total=inscritos.get(found).score()-parCampo;
        }else{
            throw new RuntimeException("Este jugador no esta inscrito en este torneo.");
        }
        return total;
    }
    private int betterCard(List<String> aux){
        int best_pos = 0;
        int best_score = cardOf(aux.get(0));
        for(int i = 0; i<aux.size(); i++){
            if(best_score<cardOf(aux.get(i))){
                best_pos=i;
            }
        }
        return best_pos;
    }
    public List<Jugador> classification(){
         List<Jugador> board = new ArrayList<>();
         List<String> auxNames = new ArrayList<>();
         for(int i = 0; i<inscritos.size(); i++){
             auxNames.add(i, inscritos.get(i).getName());
         }
         while(!auxNames.isEmpty()){
             int best_pos = betterCard(auxNames);
             int found = search(auxNames.get(best_pos));
             board.add(inscritos.get(found));
             auxNames.remove(best_pos);
         }
         return board;

    }
}
