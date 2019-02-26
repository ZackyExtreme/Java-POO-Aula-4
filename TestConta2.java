
public class TestConta2 {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.banco="Itau";
		c1.numero="1234-5";
		c1.saldo=1000.00;
		c1.limite=0.00;
		c1.extrato();
		c1.depositar(100.00);
		c1.extrato();
		c1.sacar(500.00);
		c1.extrato();
		
		c2.banco="Nubank";
		c2.numero="0001-1";
		c2.saldo=500.00;
		c2.limite=100.00;
		c2.extrato();
		c2.depositar(500.00);
		c2.extrato();
		
		c1.extrato();
		c2.extrato();

	}

}
