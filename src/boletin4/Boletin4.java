package boletin4;

public class Boletin4 {

    public static void main(String[] args) {
        consumo consumo1 = new consumo();

        consumo1.setLitros(50);
        consumo1.setPGas(1.57);

        consumo consumo2 = new consumo(500.0, 60.0, 120.0, 1.63);

        System.out.println("consumo medio= " + consumo2.consumoMedio());
        System.out.println("veloidad media= " + consumo2.getVMed());

    }

}
