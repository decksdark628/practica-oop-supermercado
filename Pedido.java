import java.util.Scanner;

public class Pedido{
    private Producto[] productos;

    public Pedido(Producto[] prods){
        productos = prods;
    }

    public int sumarCalorias(){
        System.out.println("Has escogido sumar las calorias de tus productos...");
        int suma = 0;

        if (esListaDeAlimentos()){
            for (int i = 0; i<productos.length; i++){
                IAlimento al = (IAlimento)productos[i];
                suma += al.getCalorias();
            }
        }
        else{
            System.out.println("\tNo todos los productos son alimentos\n¿Deseas sumar las calorias de SOLO los alimentos?(s/n)");
            if(confSumaSoloAlimentos())
                suma = sumarCalSoloAlimentos();
            else
                suma = -1;
        }
        return suma;
    }
    
    private boolean esListaDeAlimentos(){
        boolean conf = true;
        for (int i = 0; i<productos.length && conf; i++){
            if (!(productos[i] instanceof IAlimento))
                conf = false;
        }
        return conf;
    }

    private boolean confSumaSoloAlimentos(){
        boolean yesOrNo = false, validAnswer = false;
        Scanner sc = new Scanner(System.in);
        while (!validAnswer){
            String temp = sc.nextLine();
            if (temp != null){
                temp.trim().toLowerCase();
                if (temp.equals("s")){
                    yesOrNo = true;
                    validAnswer = true;
                }
                else if (temp.equals("n")){
                    yesOrNo = false;
                    validAnswer = true;
                }
                else
                    System.out.println("La respuesta debe ser 's' o 'n'");
            }
        }
        sc.close();
        return yesOrNo;
    }

    private int sumarCalSoloAlimentos(){
        int suma = 0;
        for (int i = 0; i<productos.length; i++){
            if (productos[i] instanceof IAlimento){
                IAlimento alimento = (IAlimento)productos[i];
                suma += alimento.getCalorias();
            }
        }
        return suma;
    }

    public Producto[] getProductos() {
        return this.productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public String toString(){
        String temp ="";
        for (int i = 0; i<productos.length; i++){
            temp += productos[i].toString()+"\n";
        }
        return temp;
    }
}