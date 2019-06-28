package Duplamente;


public class Duplamente {
	
	private No header;
	private No trailer;
	int tam=0;
	
	Duplamente(){
		header=new No(null,null,trailer);
		trailer=new No(null,header,null);
		header.setProximo(trailer);
	}
	
	public void igualdade(Duplamente lista, Duplamente lista2) {//2
		int cont=0;
		No novo=lista.getHeader();
		No novo2=lista2.getHeader();
		for(int i=0;i<tam;i++) {
			novo=novo.getProximo();
			novo2=novo2.getProximo();
			if(novo.getValor()==novo2.getValor())
				cont++;
		}
		if(cont==tam)
			System.out.println("Igual");
		else
			System.out.println("desigual");
	}
	
	public No getHeader() {
		return header;
	}

	public void insereOrdenado(No novo) { //1
		No aux=header;
		for(int k=0;k<tam-1;k++) {
			aux=aux.getProximo();
			if(novo.getValor()<aux.getValor()) {
				inserepos(novo,k);
				return;
			}
		}
		inserefim(novo);
	}
	
	public void insereinicio(No novo) {
		novo.setAnterior(header);
		novo.setProximo(header.getProximo());
		header.getProximo().setAnterior(novo);
		header.setProximo(novo);
		tam++;
	}
	
	public void inserepos(No novo, int pos) {
		No aux=header;
		if(header==null||pos>tam||pos<0) 
			System.out.println("Inconsitencia");
		else if(pos==0) 
			insereinicio(novo);
		else if(pos==tam) 
			inserefim(novo);
		else {
			for(int k=0;k<pos;k++)
				aux=aux.getProximo();
			novo.setAnterior(aux);
			novo.setProximo(aux.getProximo());
			aux.getProximo().setAnterior(novo);
			aux.setProximo(novo);
			tam++;
		}
	}
	
	public void inserefim(No novo) {
		novo.setProximo(trailer);
		novo.setAnterior(trailer.getAnterior());
		trailer.getAnterior().setProximo(novo);
		trailer.setAnterior(novo);
		tam++;
	}
	
	public void removepos(int pos) {
		No aux=header;
		if(header==null||pos>tam||pos<0) 
			System.out.println("Inconsitencia");
		else if(pos==0) 
			removeinicio();
		else if(pos==tam-1) 
			removefim();
		else {
			for(int k=0;k<pos;k++)
				aux=aux.getProximo();
			No aux2=aux.getProximo().getProximo();
			aux.setProximo(null);
			aux.setProximo(aux2);
			aux2.setAnterior(aux);
			tam--;
		}
	}
	
	public void removeinicio() {
		if(tam==0)
			System.out.println("Vazia");
		else
			header=header.getProximo();
			header.setAnterior(null);
			header.getProximo().setAnterior(header);
			tam--;
	}
	
	public void removefim() {
		if(tam==0)
			System.out.println("Vazia");
		else
			trailer=trailer.getAnterior();
			trailer.setProximo(null);
			trailer.getAnterior().setProximo(trailer);
			tam--;
	}
	
	public void ordDecre() {
		for (No aux = header.getProximo();aux.getValor()!=null;aux=aux.getProximo()) {
		    for (No aux2 = header.getProximo();aux!=aux2;aux2=aux2.getProximo()) {
		        if (aux.getValor() > aux2.getValor()) {
		        	Integer temp=aux.getValor();
		            aux.setValor(aux2.getValor());
		            aux2.setValor(temp);
		        }
		    }
		}
		mostrar();
	}
	
	public void inverter() {
		for (No aux = header.getProximo();aux.getValor()!=null;aux=aux.getProximo()) {
		    for (No aux2 = header.getProximo();aux!=aux2;aux2=aux2.getProximo()) {
		        Integer temp=aux.getValor();
		        aux.setValor(aux2.getValor());
		        aux2.setValor(temp);
		    }
		}
	mostrar();
	}
		
	
	public void ordCre() {
		for (No aux = header.getProximo();aux.getValor()!=null;aux=aux.getProximo()) {
		    for (No aux2 = header.getProximo();aux!=aux2;aux2=aux2.getProximo()) {
		        if (aux.getValor() < aux2.getValor()) {
		        	Integer temp=aux.getValor();
		            aux.setValor(aux2.getValor());
		            aux2.setValor(temp);
		        }
		    }
		}
		mostrar();
	}
	
	public void mostrar() {
		if(header==null) {
			System.out.println("Lista vazia.");
			return;
		}
		for(No aux = header;aux!=null;aux=aux.getProximo()) {
			if(aux==header)
				System.out.print("header");
			else if(aux==trailer)
				System.out.print("trailer");
			else
				System.out.print(" "+aux.getValor()+" ");
		}
		System.out.println();
	}
}
