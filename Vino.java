import java.util.Date;

public class Vino extends Alimento implements ILiquido{
    private int gradosAlcohol;
    private float volumen;
    private String tipoEnvase;

    public Vino(Date caducidad, String marca, float precio, int gradosAlcohol){
        super(caducidad, marca, precio);
        this.gradosAlcohol = gradosAlcohol;
        super.setCalorias(calcularCalorias());
    }

    private int calcularCalorias(){    
        return gradosAlcohol * 10;
    }

    public int getGradosAlcohol() {
        return this.gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
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
}
