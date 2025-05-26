import java.util.Date;

public class Cereal extends Alimento{
    String tipoCereal;

    public Cereal(Date caducidad, String marca, float precio, String tipoCereal) {
        super(caducidad, marca, precio);
        this.tipoCereal = tipoCereal;
        super.setCalorias(calcularCalorias());
    }

    private int calcularCalorias(){
        int calorias = 0;
        String cereal = tipoCereal.toLowerCase();
        
        if (cereal.equals("espelta"))
            calorias = 5;
        else if (cereal.equals("maiz"))
            calorias = 8;
        else if (cereal.equals("trigo"))
            calorias = 12;
        else
            calorias = 15;

        return calorias;
    }

    public String getTipoCereal() {
        return this.tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }
}
