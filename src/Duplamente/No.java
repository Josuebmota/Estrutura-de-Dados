package Duplamente;

public class No {
	
	private Integer valor;
	private No proximo;
	private No anterior;
	
	public No(Integer valor, No anterior,No proximo) {
		this.valor=valor;
		this.anterior=anterior;
		this.proximo = proximo;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer elemento) {
		this.valor = elemento;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	
}
