
public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupan�a();
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
