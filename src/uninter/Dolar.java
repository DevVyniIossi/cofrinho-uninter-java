package uninter;

// Classe da moeda Dolar
public class Dolar extends Moeda {
	
	public Dolar (double valorInicial) {
		this.valor = valorInicial;
	}
	
// Exibir valor da moeda em Dólar
	@Override
	public void info() {
		System.out.println("Dólar - " + valor);
	}

// Converter Dólar para Real
	@Override
	public double converter() {
		return this.valor *5.06;		
	}	
	
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if(this.valor != objetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}
}