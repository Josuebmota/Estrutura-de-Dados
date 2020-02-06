package Encadeada;

public class Pilha {
	
	public static void main(String[] args) { //Main
		Pilha pilha = new Pilha();
		pilha.Empilhar(1);
		pilha.Empilhar(7);
		pilha.Empilhar(2);
		pilha.Empilhar(5);
		pilha.Empilhar(10);
		pilha.Empilhar(3);
		
		/*pilha.mostrar();
		pilha.Desempilhar();
		pilha.mostrar();
		pilha.Desempilhar();
		pilha.mostrar();*/
		
		pilha.palindromo();
	}
	
	private No topo; //topo do No
	int tam; //Só pra eu saber o tamanho
	
	public No getTopo() {
		return topo;
	}

	public Pilha() {
		topo = null; 
		tam = 0;
	}
	
	public void Empilhar(Integer valor) {
		if(topo == null) { 
			topo = new No(valor,null);
			tam++;
		}
		else {
			No aux=topo;
			topo=new No(valor,aux);
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
		No aux=topo;
		for(int i=0; i<tam-1;i++) {
			if(i!=0) {
				aux=aux.getProximo();
			}
			No aux2=topo;
			for(int j=0;j<tam-1-i;j++) {
				aux2=aux2.getProximo();
			}
			if(aux.getValor()==aux2.getValor()) {
				cont++;
			}
		}
		if(cont==(tam-1))
			System.out.println("Palindromo");
		else
			System.out.println("n é");
	}
	
	
	
	public void mostrar() {
		No aux = topo;
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
