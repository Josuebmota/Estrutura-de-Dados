package Links;


public class Web {
	
	private No cabeca; //cabeca do No
	int tam; //Se pra eu saber o tamanho
	
	public No getCabeca() {
		return cabeca;
	}
	
	public void insereinicio(String nome, String link) {
		if(cabeca == null) { 
			cabeca = new No(nome,link,null);
			tam++;
		}
		else {
			No aux=cabeca;
			cabeca=new No(nome,link,aux);
			tam++;
		}
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
		No aux=cabeca;
		if(cabeca==null) 
			System.out.println("Lista Vazia.");
		else {
			for(int i=0;i<tam-2;i++) {
				aux=aux.getProximo();
			}
			aux.setProximo(null);
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
			aux.setProximo(aux.getProximo().getProximo());
		}
	}
	public void mostrar() {
		No aux = cabeca;
		if(cabeca==null) {
			System.out.println("Lista vazia.");
			return;
		}
		for(aux = cabeca;aux!=null;aux=aux.getProximo()) {
			System.out.println(" "+aux.getNome()+" "+aux.getLink());
		}
		System.out.println();
	}
	
}
