package concesionario;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private static int TAM = 10;
    private List<Coche> concesionario;
    public Concesionario(){
        this.concesionario=new ArrayList<>(TAM);
    }
    public Concesionario(int tam){
        if(tam<=0){
            throw new IllegalArgumentException("El tamaño inicial de almacenamiento es menor o igual a 0");
        }else{
            this.concesionario=new ArrayList<>(tam);
        }
    }
    public void anyadirCoche(Coche car){
        int aux = 0;
        boolean found = false;
        while(aux<concesionario.size() && !found){
            if(car.getModel().equalsIgnoreCase(concesionario.get(aux).getModel())){
                found = true;
            }else{
                aux++;
            }
        }
        if(found){
            concesionario.set(aux, car);
        }else{
            concesionario.add(car);
        }
    }
    public void removeCar(String s){
        int aux = 0;
        boolean found = false;
        while(aux<concesionario.size() && !found){
            if(concesionario.get(aux).getModel()!=s){
                aux++;
            }else{
                found = true;
            }
        }
        if(found){
            concesionario.remove(aux);
        }else{
            throw new RuntimeException("Car not found in the list.");
        }
    }
    public Coche cheapestCar() {
        Coche aux = concesionario.get(0);
        for(int i = 0; i<concesionario.size(); i++){
            if(aux.calcPrecioFinal()>concesionario.get(i).calcPrecioFinal()){
                aux=concesionario.get(i);
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        String end="[";
        for (int i = 0; i<concesionario.size(); i++){
            end+=concesionario.get(i).toString();
            if(i<concesionario.size()-1){
                end+=", ";
            }
        }
        return end+="]";
    }
}
