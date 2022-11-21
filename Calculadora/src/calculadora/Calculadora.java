package calculadora;

public class Calculadora {
	
	 private double resultado;
	    private int operacao;

	    public Calculadora(int operacao) {
	        this.operacao = operacao;
	        calcular();
	    }

	    private void calcular() {
	        switch (operacao) {
	            case 1:
	            	resultado = new Soma(SolicitaValor.getValor1(), SolicitaValor.getValor2()).calcular();
	                break;
	            case 2:
	            	resultado = new Subtracao(SolicitaValor.getValor1(), SolicitaValor.getValor2()).calcular();
	                break;
	            case 3:
	            	resultado = new Multiplicacao(SolicitaValor.getValor1(), SolicitaValor.getValor2()).calcular();
	                break;
	            case 4:
	            	resultado = new Divisao(SolicitaValor.getValor1(), SolicitaValor.getValor2()).calcular();
	                break;
	        }
	    }

	    public double getResultado() {
	        return resultado;
	    }
	    
}
