package Normal;

public class Fila {
	public Integer[] vetor;
	public Integer pos;
	
	Fila(int n){
		pos=-1;
		vetor=new Integer[n];
	}
	
	public boolean vazia() {
		if(this.pos==-1) {
			System.out.println("Fila vazia");
			return true;
		}
		return false;
	}
	
	public boolean cheia() {
		if(pos==vetor.length-1) {
			System.out.println("Fila cheia");
			return true;
		}
		return false;
	}
	
	public void mostrar() {
		for(int i=0;i<=pos;i++) {
			System.out.print(" "+vetor[i]+" ");
		}
		System.out.println();
	}
	 	
	public void inserir(int n) { 
		if(!cheia()) {
			vetor[++pos]=n;
			mostrar();
		}
	}
	
	public void retirar() { 
		if(!vazia()) {
			for(int i=0;i<pos;i++) {
				vetor[i]=vetor[i+1];
			}
		pos--;
		mostrar();
		}
	}
}
