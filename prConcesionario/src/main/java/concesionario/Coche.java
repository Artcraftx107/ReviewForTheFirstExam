package concesionario;

public class Coche {
    private static double precioTramites = 100.0;
    private static double porcIVA = 10.0;
    private int numRef;
    private String model;
    private static int nextNumRef=1;
    private double precioBase;

    public Coche(String mod, double p){
        if(mod.equals("")||p<0){
            throw new IllegalArgumentException("One of the arguments needed to register a car is not correct");
        }else{
            this.model=mod;
            this.precioBase=p;
            this.numRef=nextNumRef++;
        }
    }
    public String getModel(){
        return model;
    }
    public int getNumRef(){
        return numRef;
    }
    public double getPrecioBase(){
        return precioBase;
    }
    public void setPrecioBase(double p){
        if(p<0){
            throw new IllegalArgumentException("The price sent to the method setPrecioBase is not valid");
        }else{
            this.precioBase=p;
        }
    }
    public static double getPrecioTramites(){
        return precioTramites;
    }
    public static double getPorcIVA(){
        return porcIVA;
    }
    public static void setPorcIVA(double i){
        if(i<0){
            throw new IllegalArgumentException("The IVA recieved by the method is not valid.");
        }else{
            porcIVA = i;
        }
    }
    public double calcPrecioFinal(){
        double totalNoIva = precioBase+precioTramites;
        return totalNoIva+(totalNoIva*(porcIVA/100));
    }

    @Override
    public String toString() {
        return "("+numRef+", "+model+", "+calcPrecioFinal()+")";
    }
}
