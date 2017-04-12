

public class Cnpj {

	
	private String valor;
	
	public boolean ehValido(){
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
		
	}

	private int segundoDigitoCorreto() {
		// TODO Auto-generated method stub
		return 2;
	}

	private int segundoDigitoVerificador() {
		// TODO Auto-generated method stub
		return 2;
	}

	private int primeiroDigitoCorreto() {
		// TODO Auto-generated method stub
		return 1;
	}

	private int primeiroDigitoVerificador() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String novoValor) {
		this.valor = novoValor;
	}
	
	@Override
	public String toString() {
		
		return this.getValor();
	}
}
