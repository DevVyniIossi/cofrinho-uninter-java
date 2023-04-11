package uninter;

// Classe da moeda Real
public class Real extends Moeda {
	
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}

// Exibir valor da moeda em Euro
	@Override
	public void info() {
		System.out.println("Real - " + valor);
	}

// Converter Real, retorno de 1:1.
	@Override
	public double converter() {
		return this.valor;		
	}
	
	@Override
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real objetoDeReal = (Real) objeto;
		
		if(this.valor != objetoDeReal.valor) {
			return false;
		}
		
		return true;
	}
}
