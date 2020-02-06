package Normal;

public class Lista {
	public Integer pos;
	public Integer vetor[];
	
	Lista(int n){
		pos=-1;
		this.vetor=new Integer[n];
	}
	
	public boolean vazia() {
		if(this.pos==-1) {
			System.out.println("Lista vazia");
			return true;
		}
		return false;
	}
	
	public boolean cheia() {
		if(pos==vetor.length-1) {
			System.out.println("Lista cheia");
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
	
	public void inseririnicio(int n) {
		if(!cheia()) {
			pos++;
			for(int i=pos;i>0;i--) 
				vetor[i]=vetor[i-1];
			vetor[0]=n;
			mostrar();
		}
	}
	
	public void inserirpos(int posicao, int n) {
		if(!cheia()) {
			pos++;
			for(int i=pos;i>posicao;i--)  
				vetor[i]=vetor[i-1];
			vetor[posicao]=n;
			mostrar();
		}
	}
	
	public void inserirfim(int n) {
		if(!cheia()) {
			vetor[++pos]=n;
		}
		mostrar();
	}
	
	public void insereOrdenado(int n) {
		for(int i=0;i<vetor.length;i++) {
			if(n<vetor[i]) {
				inserirpos(i,n);
				return;
			}
		}
		inserirfim(n);
		
	}
	
	public void retirarincio() {
		if(!vazia()) {
		for(int i=0;i<pos;i++)
			vetor[i]=vetor[i+1];
		vetor[pos]=null;
		pos--;
		mostrar();
		}
	}
	
	public void retirarpos(int n) {
		if(!vazia()) {
			for(int i=n;i<pos;i++) 
				vetor[i]=vetor[n+1];
			vetor[pos]=null;
			pos--;
			mostrar();
		}
	}
	
	public void retirarfim() {
		if(!vazia()) {
			vetor[pos]=null;
			pos--;
			mostrar();
		}
	}
	public void ordDecre() {
		for (int i = 1; i < vetor.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (vetor[i] > vetor[j]) {
		            int temp = vetor[i];
		            vetor[i] = vetor[j];
		            vetor[j] = temp;
		        }
		    }
		}
		mostrar();
	}
	
	public void ordCre() {
		for (int i = 1; i < vetor.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (vetor[i] <  vetor[j]) {
		            int temp = vetor[i];
		            vetor[i] = vetor[j];
		            vetor[j] = temp;
		        }
		    }
		}
		mostrar();
	}
	
	public void antipenultimo() {
		if(pos>1) {
			int a=pos-2;
			System.out.println(vetor[a]);
		}
		else
			System.out.println("n TEM ");
	}
	
	public void inverter() {
		for (int i = 1; i <=pos; i++) {
		    for (int j = 0; j < i; j++) {
		            int temp = vetor[i];
		            vetor[i] = vetor[j];
		            vetor[j] = temp;
		        }
		    }
		mostrar();	
	}
	
	public void buscador(int valor) {
		for (int i = 0; i < vetor.length; i++) {
			if(valor==vetor[i]) {
				retirarpos(i);
				inseririnicio(valor);
				break;
			}
		}
	}
}
