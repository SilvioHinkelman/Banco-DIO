
public class Main {

	public static void main(String[] args) {
		
		Cliente silvio = new Cliente();
		silvio.setNome("Silvio");
		
		IConta cc = new ContaCorrente(silvio);
		IConta poupanca = new ContaPoupanca(silvio);
		
		cc.depositar(2000);	
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		System.out.println("----------------------------------");
		poupanca.imprimirExtrato();
	}

}
