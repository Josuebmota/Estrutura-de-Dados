package Encadeada;



public class Lista {
	
	public static void main(String[] args) { //Main
		Lista l = new Lista();
		l.inserefim(5);
		l.inserefim(99);
		l.inserefim(23);
		l.inserefim(12);
		l.insereinicio(62);
		l.mostrar();
		l.inserepos(32, 2);
		l.mostrar();
		l.retirarpos(2);
		l.mostrar();
		l.inicioParaFinal();
		l.mostrar();
		l.inverter();
		//l.ordDecre();
		//l.ordCre();
		/*l.retirarinicio();
		l.mostrar();
		l.retirarfinal();
		l.mostrar();*/
	}
	
	private No cabeca; //cabeca do No
	int tam; //S� pra eu saber o tamanho
	
	public Lista() {
		cabeca = null; 
		tam = 0;
	}
	
	public No getCabeca() {
		return cabeca;
	}

	public No getcauda() {
		if(cabeca==null) {
			System.out.println("Fila Vazia.");
			return null;
		}
		No aux=cabeca;
		for(int i=1;i<tam;i++) {
			aux=aux.getProximo();
		}
		return aux;
	}
	
	public No penultimo() {
		if(cabeca==null) {
			System.out.println("Fila Vazia.");
			return null;
		}
		No aux=cabeca;
		for(int i=0;i<tam-2;i++) {
			aux=aux.getProximo();
		}
		return aux;
	}
	public No antepenultimo() {
		if(cabeca==null) {
			System.out.println("Fila Vazia.");
			return null;
		}
		No aux=cabeca;
		for(int i=0;i<tam-3;i++) {
			aux=aux.getProximo();
		}
		return aux;
	}
	
	public void insereOrdenado(Integer valor) {
		No aux=cabeca;
		for(int k=0;k<tam;k++) {
			aux=aux.getProximo();
			if(valor<aux.getValor()) {
				inserepos(valor,k);
				return;
			}
		}
		inserefim(valor);
	}
	/*public No AntePost(int n, int pos) {
		No Noanterior=cabeca;
		No Nolocal=cabeca;
		No Noposterior=cabeca;
		if(n==0) {
			for(int i=0;i<pos-1;i++) 
				Noanterior=Noanterior.getProximo();
			return Noanterior;
		}else if(n==1) {
			for(int i=0;i<pos;i++) 
				Nolocal=Nolocal.getProximo();
			return Nolocal;
		}else if(n==2) {
			for(int i=0;i<pos+1;i++) 
				Noposterior=Noposterior.getProximo();
			return Noposterior;
		}
		return null;
	}*/
	
	public void inserefim(Integer valor) {
		if(cabeca == null) { 
			cabeca = new No(valor,null);
			tam++;
		}
		else {
			No aux=new No(valor,null);
			getcauda().setProximo(aux);
			tam++;
		}
	}
	
	public void insereinicio(Integer valor) {
		if(cabeca == null) { 
			cabeca = new No(valor,null);
			tam++;
		}
		else {
			No aux=cabeca;
			cabeca=new No(valor,aux);
			tam++;
		}
	}
	
	public void inserepos(Integer valor, int pos) {
		No aux=cabeca;
		if(cabeca==null||pos>tam||pos<0) 
			System.out.println("Inconsitencia");
		else if(pos==0) 
			insereinicio(valor);
		else if(pos==tam-1) 
			inserefim(valor);
		else {
			for(int k=1;k<pos;k++)
				aux=aux.getProximo();
			aux.setProximo(new No(valor, aux.getProximo()));
		}
	}
	
	public void inverter() {
		for (No aux = cabeca;aux!=null;aux=aux.getProximo()) {
		    for (No aux2 = cabeca;aux!=aux2;aux2=aux2.getProximo()) {
		        Integer temp=aux.getValor();
		        aux.setValor(aux2.getValor());
		        aux2.setValor(temp);
		    }
		}
	mostrar();
	}
	
	public void retirarinicio() {
		if(cabeca==null) {
			System.out.println("Lista Vazia.");
		}
		else {
			cabeca = cabeca.getProximo();
			tam--;	
		}
	}
	
	public void retirarfinal() {
		if(cabeca==null) {
			System.out.println("Lista Vazia.");
		}
		else {
			penultimo().setProximo(null);
		}
	}
	
	public void retirarpos(int pos) {
		No aux=cabeca;
		if(cabeca==null||pos>tam||pos<0) 
			System.out.println("Inconsitencia");
		else if(pos==0) 
			retirarinicio();
		else if(pos==tam-1) 
			retirarfinal();
		else {
			for(int k=1;k<pos;k++)
				aux=aux.getProximo();
			//aux.getProximo().setValor(null);
			aux.setProximo(aux.getProximo().getProximo());
		}
	}
	
	public void ordDecre() {
		for (No aux = cabeca;aux!=null;aux=aux.getProximo()) {
		    for (No aux2 = cabeca;aux!=aux2;aux2=aux2.getProximo()) {
		        if (aux.getValor() > aux2.getValor()) {
		        	Integer temp=aux.getValor();
		            aux.setValor(aux2.getValor());
		            aux2.setValor(temp);
		        }
		    }
		}
		mostrar();
	}
	
	public void ordCre() {
		for (No aux = cabeca;aux!=null;aux=aux.getProximo()) {
		    for (No aux2 = cabeca;aux!=aux2;aux2=aux2.getProximo()) {
		        if (aux.getValor() < aux2.getValor()) {
		        	Integer temp=aux.getValor();
		            aux.setValor(aux2.getValor());
		            aux2.setValor(temp);
		        }
		    }
		}
		mostrar();
	}
	public void inicioParaFinal(){
		No aux = cabeca;
		retirarinicio();
		inserefim(aux.getValor());
		
	}
	public void mostrar() {
		No aux = cabeca;
		if(cabeca==null) {
			System.out.println("Lista vazia.");
			return;
		}
		for(aux = cabeca;aux!=null;aux=aux.getProximo()) {
			System.out.print(" "+aux.getValor()+" ");
		}
		System.out.println();
	}
}