package calculadora;

public class Divisao implements Operacao {
	
    private double resultado, valor1, valor2;

    public Divisao(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public double calculate() {
    	resultado = valor1 / valor2;
        return resultado;
    }

}
