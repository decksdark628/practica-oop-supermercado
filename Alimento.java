import java.util.Date;

public abstract class Alimento extends Producto implements IAlimento{
    private int calorias;
    private Date caducidad;

    public Alimento(Date caducidad, String marca, float precio) {
        super(marca, precio);
        this.caducidad = caducidad;
    }

    public int getCalorias() {
        return this.calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Date getCaducidad() {
        return this.caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", calorias: " + getCalorias() + 
            ", Caducidad: " + getCaducidad();
    }

}
