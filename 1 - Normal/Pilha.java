package Normal;


public class Pilha {
	public Integer[] vetor;
	public Integer quantidade;
	
	Pilha(int n){
		quantidade=-1; //pilha esta vazia, ou seja ele esta no topo
		vetor=new Integer[n];
	}
	
	public boolean vazia() {
		if(quantidade==-1) {
			System.out.println("Pilha vazia");
			return true;
		}
		return false;
	}
	
	public boolean cheia() {
		if(quantidade==vetor.length-1) {
			System.out.println("Pilha cheia");
			return true;
		}
		return false;
	}
	
	public void mostrar() {
		for(int i=quantidade;i>=0;i--) {
			System.out.println(vetor[i]);
		}
		System.out.println("-----------");
	}
	
	public void desimpilhar() { //pop
		if(!vazia()) {
			vetor[quantidade]=(Integer) null;
			quantidade--;
			mostrar();
		}
	}
	
	public void empilhar(int valor) { //push
		if(!cheia()) {
			this.vetor[++quantidade]=valor;
			mostrar();
		}
	}
	
	public void palindromo() {
		int cont=0;
		for(int i=0; i<=quantidade;i++) {
			if(vetor[i]==vetor[quantidade-i]) 
				cont++;
		}
		if(cont==quantidade+1)
			System.out.println("Palindromo");
		else
			System.out.println("n é");
	}
	
	public void inveter() {
		for (int i = 1; i <=quantidade; i++) {
		    for (int j = 0; j < i; j++) {
		            int temp = vetor[i];
		            vetor[i] = vetor[j];
		            vetor[j] = temp;
		        }
		    }
		mostrar();
	}
}
