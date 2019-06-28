package Duplamente;

public class main {
	public static void main(String[] args) { //Main
		Duplamente lista = new Duplamente();
		lista.insereinicio(new No(10, null, null));
		lista.mostrar();
		
		lista.insereinicio(new No(7, null, null));
		lista.mostrar();
		
		lista.inserefim(new No(12, null, null));
		lista.mostrar();
		
		lista.inserefim(new No(14, null, null));
		lista.mostrar();
		
		lista.inserepos((new No(50,null,null)),3);
		lista.mostrar();
		
		lista.insereOrdenado(new No(15,null,null));
		lista.mostrar();
		
		
		
		
		/*---------------------------------------------------------------*/
		
		
		
		Duplamente lista2 = new Duplamente();
		lista2.insereinicio(new No(10, null, null));
		lista.mostrar();
		
		lista2.insereinicio(new No(7, null, null));
		lista2.mostrar();
		
		lista2.inserefim(new No(12, null, null));
		lista2.mostrar();
		
		lista2.inserefim(new No(14, null, null));
		lista2.mostrar();
		
		lista2.inserepos((new No(50,null,null)),3);
		lista2.mostrar();
		
		lista2.insereOrdenado(new No(15,null,null));
		lista2.mostrar();
		
		/*lista.removepos(3);
		lista.mostrar();
		
		lista.ordDecre();
		
		lista.removeinicio();
		lista.mostrar();
		
		lista.removefim();*/
		System.out.println("---------------");
		lista.mostrar();
		
		System.out.println("---------------");
		
		lista2.mostrar();
		
		lista.igualdade(lista,lista2);
		lista2.inverter();
	}
}
