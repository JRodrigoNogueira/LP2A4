package calculadora;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int operacao = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu\n---------------------------\n[1] Adição\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Encerrar\n---------------------------\n");

            operacao = scanner.nextInt();

            System.out.println();

            if(new Validacao().isOptionValid(operacao)){
                SolicitaValor.requestDoubles(scanner);
                Calculadora calculadora = new Calculadora(operacao);
                System.out.println("\nO resultado é: " + calculadora.getResultado());
                System.out.println();
                SolicitaValor.cleanValues();
            }

        } while (operacao != 0);

        scanner.close();

    }

}
