
public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		c.n1=8;
		c.n2=2;
		
		System.out.println("Soma de "+c.n1+" + "+c.n2+" = "+c.soma());
		System.out.println("Produto de "+c.n1+" * "+c.n2+" = "+c.produto());
		System.out.println("Potencia de "+c.n1+" ^ "+c.n2+" = "+c.potencia());
		

	}

}
