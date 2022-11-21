package calculadora;

public class Validacao {

    public boolean isOptionValid(int operacao) {
    	
        if(operacao == 0) {
            System.out.println("Programa encerrado");
            return false;
        } else if (operacao < 0 || operacao > 4) {
            System.out.println("Opção inválida. Por favor, tente novamente.");
            return false;
        }
        return true;
    }

}
