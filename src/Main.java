
public class Main {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanša();
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
