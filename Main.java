import java.util.Date;

public class Main {
    public static void main(String[] args){
        DateGenerator dgen = new DateGenerator();
        Date date1 = dgen.generateDate(2026, 10, 9);
        Date date2 = dgen.generateDate(2028, 2, 20);
        Date date3 = dgen.generateDate(2025, 12, 5);
        Date date4 = dgen.generateDate(2028, 6, 15);

        Cereal cer1 = new Cereal(date1, "Schar", 2.30f, "maiz");
        Cereal cer2 = new Cereal(date2, "Davert", 13.5f, "espelta");
        Vino vin1 = new Vino(date3, "Lopez Cristobal La Linde 2023", 9, 10);
        Vino vin2 = new Vino(date4, "Ponte da Boga P. Mencia 2023", 10, 14);
        Detergente det = new Detergente("Bosque Verde", 2.39f, 1.95f, "flexible");

        Producto[] prods = {cer1, vin1, vin2, cer2, det};
        Pedido pedido = new Pedido(prods);

        System.out.println(pedido);
        pedido.sumarCalorias();
    }   
}
