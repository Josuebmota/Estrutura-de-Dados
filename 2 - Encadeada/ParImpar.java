package Encadeada;

import java.util.Scanner;

public class ParImpar { //4
	private static Scanner ob;

	public static void main(String args[]) {
		Pilha ale=new Pilha();
		ob = new Scanner(System.in);
		Integer coisa=ob.nextInt();
		while(coisa>0) {
			ale.Empilhar(coisa);
			coisa=ob.nextInt();
		}
		Fila par=new Fila();
		Fila impar=new Fila();
		No topo=ale.getTopo();
		for(int i=0;i<ale.tam;i++) {
			if(topo.getValor()%2==0)
				par.inserir(topo.getValor());
			if(topo.getValor()%2!=0)
				impar.inserir(topo.getValor());
			topo=topo.getProximo();
		}
		System.out.println("Pilha");
		ale.mostrar();
		if (par.getTam()==0) {
			System.out.println("Nao ha valores pares");
		}
		else {
		System.out.print("Fila Par ");
		par.mostrar();
		}
		if (impar.getTam()==0) {
			System.out.println("Nao ha valores impares");
		}
		else {
		System.out.print("Fila Impar ");
		impar.mostrar();
		}
	}
}
