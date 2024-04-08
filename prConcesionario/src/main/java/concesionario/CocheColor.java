package concesionario;

public class CocheColor extends Coche {
    private Color colour;

    public CocheColor(String m, double pb, String cl) {
        super(m, pb);
        switch (cl) {
            case "Negro":
                setColour(Color.Negro);
                break;
            case "Rojo":
                setColour(Color.Rojo);
                break;
            case "Verde":
                setColour(Color.Verde);
                break;
            case "Azul":
                setColour(Color.Azul);
                break;
            case "Amarillo":
                setColour(Color.Amarillo);
                break;
            case "Magenta":
                setColour(Color.Magenta);
                break;
            case "Cian":
                setColour(Color.Cian);
                break;
            case "Blanco":
                setColour(Color.Blanco);
                break;
            default:
                throw new IllegalArgumentException("Ese color no esta disponible en la enumeracion.");
        }
    }

    public CocheColor(String m, double bp, Color c) {
        super(m, bp);
        setColour(c);
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color c) {
        colour = c;
    }

    public void setColourString(String s) {
        switch (s) {
            case "Negro":
                setColour(Color.Negro);
                break;
            case "Rojo":
                setColour(Color.Rojo);
                break;
            case "Verde":
                setColour(Color.Verde);
                break;
            case "Azul":
                setColour(Color.Azul);
                break;
            case "Amarillo":
                setColour(Color.Amarillo);
                break;
            case "Magenta":
                setColour(Color.Magenta);
                break;
            case "Cian":
                setColour(Color.Cian);
                break;
            case "Blanco":
                setColour(Color.Blanco);
                break;
            default:
                throw new IllegalArgumentException("Ese color no esta disponible en la enumeracion.");
        }
    }

    @Override
    public String getModel() {
        return super.getModel() + " " + colour.toString();
    }

    public double getPrecioBase() {
        int colourFee = 0;
        switch (this.colour) {
            case Negro:
                colourFee = 0;
                break;
            case Rojo:
                colourFee = 10;
                break;
            case Verde:
                colourFee = 20;
                break;
            case Azul:
                colourFee = 30;
                break;
            case Amarillo:
                colourFee = 40;
                break;
            case Magenta:
                colourFee = 50;
                break;
            case Cian:
                colourFee = 60;
                break;
            case Blanco:
                colourFee = 70;
                break;
        }
        return super.getPrecioBase() + colourFee;
    }

    @Override
    public String toString() {
        return "(" + getNumRef() + ", " + getModel() + ", " + super.calcPrecioFinal() + ")";
    }

    public static String[] coloursAvailable() {
        String[] colours = new String[Color.values().length];
        for (int i = 0; i < Color.values().length; i++) {
            colours[i] = Color.values()[i].name();
        }
        return colours;
    }
}

