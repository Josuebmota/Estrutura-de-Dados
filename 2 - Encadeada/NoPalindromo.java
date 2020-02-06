package Encadeada;

public class NoPalindromo {
	
	private Object valor;
	private NoPalindromo proximo;
	
	public NoPalindromo(Object valor, NoPalindromo proximo) {
		this.valor = valor;
		this.proximo = proximo;
	}
	
	public Object getValor() {
		return valor;
	}
	
	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	public NoPalindromo getProximo() {
		return proximo;
	}
	
	public void setProximo(NoPalindromo proximo) {
		this.proximo = proximo;
	}
	
}
