public class Detergente extends Producto implements ILiquido{
    private float volumen;
    private String tipoEnvase;

    public Detergente(String marca, float precio, float volumen, String tipoEnvase){
        super(marca, precio);
        this.volumen = volumen;
        this.tipoEnvase = tipoEnvase;
    }

    public float getVolumen() {
        return this.volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public String getTipoEnvase() {
        return this.tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    @Override
    public String toString() {
        return "\tDetergente (" + super.toString() + ", volumen: " + getVolumen() + "L" +
            ", Envase: " + getTipoEnvase() + ")";
    }
}