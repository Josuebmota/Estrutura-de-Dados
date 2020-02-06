package Links;

public class teste {
	public static void main(String[] args) {
		Web l =new Web();
		l.insereinicio("l", "s.com");
		l.insereinicio("o", "a.com");
		l.insereinicio("r", "zz.com");
		l.insereinicio("p", "papa.com");
		l.insereinicio("s", "xc.com");
		l.mostrar();
		busca(l,"o");
		l.mostrar();
	}
	public static void busca(Web l,String label) {
		No busca=l.getCabeca();
		String link = null;
		for(int i=0;i<l.tam;i++) {
			if(busca.getNome()==label) {
				l.retirarpos(i);
				link=busca.getLink();
			}
			else if(i==l.tam-1) {
				System.out.println("Não possui um link");
				return;
			}
			else
				busca=busca.getProximo();
				
		}
		l.insereinicio(label,link);	
	}
}
