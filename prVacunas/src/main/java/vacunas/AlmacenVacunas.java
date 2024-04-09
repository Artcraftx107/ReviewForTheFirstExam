package vacunas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlmacenVacunas {
    private static final int CAP_INICIAL = 3;
    private String name;
    private int numVacunas=0;
    private List<Vacuna> vacunas;
    public AlmacenVacunas(String n, int num){
        if(n==""||num<=0){
            throw new IllegalArgumentException("El nombre o el tamaño del array no es valido");
        }else{
            this.name=n;
            this.vacunas = new ArrayList<>(num);
        }
    }
    public AlmacenVacunas(String name){
        if (name == "") {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }else{
            this.name=name;
            this.vacunas = new ArrayList<>(CAP_INICIAL);
        }
    }

    public String getName() {
        return name;
    }
    public void almacenar(String n, int d, int v){
        int found = buscar(n);
        if(found!=-1){
            vacunas.get(found).viales+=v;
        }else{
            Vacuna aux = new Vacuna(n, d, v);
            vacunas.add(aux);
            numVacunas++;
        }
    }
    public void inocularTodas(String n){
        int found = buscar(n);
        if(found!=-1){
            vacunas.remove(found);
            numVacunas--;
        }
    }
    public double totalDosis(){
        double total = 0;
        for(int i = 0; i<numVacunas; i++){
            total+=vacunas.get(i).dosisTotales();
        }
        return total;
    }
    private int buscar(String name){
        int pos= 0;
        boolean found = false;
        while(pos<this.numVacunas && !found){
            if(name.equalsIgnoreCase(vacunas.get(pos).codigo)){
                found=true;
            }else{
                pos++;
            }
        }
        if(!found){
            pos = -1;
        }
        return pos;
    }

    @Override
    public String toString() {
        return this.name+" = "+vacunas.toString();
    }
}
