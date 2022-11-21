package calculadora;

import java.util.Scanner;

public class SolicitaValor {

    private static double valor1, valor2;

    public static double getValor1() {
        return valor1;
    }

    public static double getValor2() {
        return valor2;
    }
    
    public static void requestDoubles(Scanner scanner) {
        System.out.print("Insira o primeiro valor: ");
        valor1 = scanner.nextDouble();
        System.out.print("Insira o segundo valor: ");
        valor2 = scanner.nextDouble();
    }

    public static void cleanValues() {
    	valor1 = 0;
        valor2 = 0;
    }

}
