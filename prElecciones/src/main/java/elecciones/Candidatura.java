package elecciones;

import java.util.ArrayList;
import java.util.List;

public class Candidatura {
    private String partido;
    private String circunscripcion;
    private List<Candidata> candidatura;
    public Candidatura(String p, String circun){
        this.partido=p;
        this.circunscripcion=circun;
        this.candidatura= new ArrayList<>();
    }
    public String getPartido(){
        return partido;
    }
    public String getCircunscripcion(){
        return circunscripcion;
    }
    public void addMember(Candidata can){
        int aux = searchDNI(can.getDNI());
        if(aux != -1){
            candidatura.set(aux, can);
        }else{
            candidatura.add(can);
        }

    }
    public void deleteMember(Candidata cand){
        int aux = searchDNI(cand.getDNI());
        if(aux!=-1) {
            candidatura.remove(aux);
        }else{
            throw new RuntimeException("El miembro especificado no esta en esta lista");
        }
    }
    private int searchDNI(String id){
        boolean found = false;
        int aux = 0;
        while(aux< candidatura.size() && !found){
            if(candidatura.get(aux).getDNI().equalsIgnoreCase(id)){
                found= true;
            }else{
                aux++;
            }
        }
        if(!found){
            aux = -1;
        }
        return aux;
    }
    public void addHeadOfList(Candidata cand){
        candidatura.add(0, cand);
    }
    public Candidata cabezaLista(){
        if(candidatura.isEmpty()){
            throw new RuntimeException("La lista de miembros especificada esta vacia");
        }
        Candidata headOfList = candidatura.get(0);
        return headOfList;

    }
    public int independentMember(){
        int numIndependent = 0;
        for(int i = 0; i<candidatura.size(); i++){
            if(candidatura.get(i).isIndependiente()){
                numIndependent++;
            }
        }
        return numIndependent;
    }
    public boolean esCremallera(){
        boolean cremallera = true;
        int aux = 0;
        while(aux<candidatura.size() && cremallera){
            if(candidatura.get(aux).getSexo().equals(candidatura.get(aux+1).getSexo())){
                cremallera = false;
            }else{
                aux++;
            }
        }
        return cremallera;
    }

    @Override
    public String toString() {
        return partido+"-"+circunscripcion+":"+candidatura;
    }
}
