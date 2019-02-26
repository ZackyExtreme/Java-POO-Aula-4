
public class Conta {
	String banco;
	String numero;
	double saldo;
	double limite;
	
	public void extrato() {
		System.out.println("##########");
		System.out.println("Extrato da Conta");
		System.out.println("Banco: "+banco);
		System.out.println("Numero: "+numero);
		System.out.println("Saldo R$ "+saldo);
		System.out.println("Limite R$ "+limite);
		System.out.println("##########");
	}
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public void sacar(double valor) {
		if(saldo<valor)
			System.out.println("Saldo Insuficiente. ");
		else {
			saldo-=valor;
			System.out.println("Saque realizado com sucesso!.");
		}
	}

}
