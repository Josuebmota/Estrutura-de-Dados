package Links;

public class No {
	
	private String nome;
	private String link;

	private No proximo;
	
	public No(String n, String l, No proximo) {
		this.nome=n;
		this.link = l;
		this.proximo = proximo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String valor) {
		this.link = valor;
	}
	
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
}