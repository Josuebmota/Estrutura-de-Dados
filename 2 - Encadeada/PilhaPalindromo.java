package Encadeada;

public class PilhaPalindromo {
	
	public static void main(String[] args) { //Main
		PilhaPalindromo pilha = new PilhaPalindromo();
		pilha.Empilhar('a');
		pilha.Empilhar('b');
		pilha.Empilhar('c');
		pilha.Empilhar('c');
		pilha.Empilhar('b');
		pilha.Empilhar('a');
		
		/*pilha.mostrar();
		pilha.Desempilhar();
		pilha.mostrar();
		pilha.Desempilhar();
		pilha.mostrar();*/
		
		pilha.palindromo();
	}
	
	private NoPalindromo topo; //topo do NoPalindromo
	int tam; //Só pra eu saber o tamanho
	
	public NoPalindromo getTopo() {
		return topo;
	}

	public PilhaPalindromo() {
		topo = null; 
		tam = 0;
	}
	
	public void Empilhar(Object valor) {
		if(topo == null) { 
			topo = new NoPalindromo(valor,null);
			tam++;
		}
		else {
			NoPalindromo aux=topo;
			topo=new NoPalindromo(valor,aux);
			tam++;
		}
	}
	
	public void Desempilhar() {
		if(topo==null) {
			System.out.println("Pilha Vazia.");
		}
		else {
			topo = topo.getProximo();
			tam--;	
		}
	}
	
	public void palindromo() {
		int cont=0; 
		NoPalindromo aux=topo;
		for(int i=0; i<tam-1;i++) {
			NoPalindromo aux2=topo;
			for(int j=0;j<tam-1-i;j++) {
				aux2=aux2.getProximo();
			}
			if(aux.getValor()==aux2.getValor()) {
				cont++;
			}
			aux=aux.getProximo();
		}
		if(cont==(tam-1))
			System.out.println("Palindromo");
		else
			System.out.println("n é");
	}
	
	
	
	public void mostrar() {
		NoPalindromo aux = topo;
		if(topo==null) {
			System.out.println("Pilha vazia.");
			return;
		}
		for(aux = topo;aux!=null;aux=aux.getProximo()) {
			System.out.println(aux.getValor());
		}
		System.out.println("---------");
	}
}
