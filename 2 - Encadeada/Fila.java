package Encadeada;

public class Fila {
	
	public static void main(String[] args) { //Main
		Fila f = new Fila();
		f.inserir(5);
		f.inserir(99);
		f.inserir(23);
		f.inserir(12);
		f.inserir(62);
		
		f.mostrar();
		f.retirar();
		f.mostrar();
		f.retirar();
		f.mostrar();
		f.getcauda();
	}
	
	private No topo; //topo do No
	private int tam; //Só pra eu saber o tamanho
	
	public Fila() {
		topo = null; 
		tam = 0;
	}
	
	public int getTam() {
		return tam;
	}
	
	public No getcauda() {
		if(topo==null) {
			System.out.println("Fila Vazia.");
			return null;
		}
		No aux=topo;
		for(int i=0;i<tam-1;i++) {
			aux=aux.getProximo();
		}
		return aux;
	}
	
	public void inserir(Integer valor) {
		if(topo == null) { 
			topo = new No(valor,null);
			tam++;
		}
		else {
			No aux=new No(valor,null);
			getcauda().setProximo(aux);
			tam++;
		}
	}
	
	public void retirar() {
		if(topo==null) {
			System.out.println("Fila Vazia.");
		}
		else {
			No aux = topo;
			for(int i=0;i<tam;i++) {
				if(i==tam-1)
					aux.setValor(null);
				aux=aux.getProximo();
			}
			tam--;	
		}
	}
	
	public void mostrar() {
		No aux = topo;
		if(topo==null) {
			System.out.println("Fila vazia.");
			return;
		}
		for(int i=0;i<tam;i++) {
			System.out.print(" "+aux.getValor()+" ");
			aux=aux.getProximo();
		}
		System.out.println();
	}
}

