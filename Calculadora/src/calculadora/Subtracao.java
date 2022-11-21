package calculadora;

public class Subtracao implements Operacao {

    private double resultado, valor1, valor2;

    public Subtracao(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public double calcular() {
    	resultado = valor1 - valor2;
        return resultado;
    }

}
