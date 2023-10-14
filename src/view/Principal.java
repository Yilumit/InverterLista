package view;

import controller.InverterController;
import model.Lista;

public class Principal {

	public static void main(String[] args) {
		InverterController inverte = new InverterController();
		Lista<Integer> lista = new Lista<>();
		
		//Adicionando valores a lista
		lista.addFirst(16);
		lista.addFirst(4);
		lista.addFirst(13);
		lista.addFirst(2);
		lista.addFirst(6);
		lista.addFirst(7);
		lista.addFirst(9);
		lista.addFirst(12);
		lista.addFirst(18);
		lista.addFirst(5);
		lista.addFirst(3);
		
		int tamanho = lista.size();
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.print(lista.get(i) + " ");
			} catch (Exception e) {
				e.getMessage();
			}
		}
		System.out.println();
		
		lista = inverte.inverterLista(lista);
		
		for (int i = 0; i < tamanho; i++) {
			try {
				System.out.print(lista.get(i) + " ");
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}

}
