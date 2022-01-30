
public class Main {

	public static void main(String[] args) {
		Cliente lais = new Cliente();
		lais.setNome("Laís");
		
		Conta cc = new ContaCorrente(lais);
		Conta poupanca = new ContaPoupanca(lais);

		cc.depositar(1000);
		cc.transferir(1000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}