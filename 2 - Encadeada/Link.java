package Encadeada;

public class Link {
	public static void main(String[] args) {
		Lista links=new Lista();
		links.inserefim(1);
		links.inserefim(5);
		links.inserefim(7);
		links.inserefim(8);
		
		links.mostrar();
		
		busca(links,5);
		links.mostrar();
	}
	public static void busca(Lista web,Integer link) {
		No busca=web.getCabeca();
		Integer rotacao = null;
		for(int i=0;i<web.tam;i++) {
			if(busca.getValor()==link) {
				rotacao=busca.getValor();
				busca=web.getCabeca();
				web.retirarpos(i);
			}
			else
				busca=busca.getProximo();
		}
		web.insereinicio(rotacao);	
	}
}
