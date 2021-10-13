package valts.valts;

public class Main {

    public static void main(String[] args) {

        double precio = CalculoIva(10);
        System.out.println(precio);
    }


    private static double CalculoIva(double precio) {
        return precio * 1.21;
    }


}
