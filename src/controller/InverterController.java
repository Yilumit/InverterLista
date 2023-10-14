package controller;

import model.Lista;

public class InverterController {
		
	public Lista<Integer> inverterLista(Lista<Integer> lista) {
		int tamanho = lista.size();
		try {
			for (int i = 0; i < tamanho; i++) {
			
				int auxiliar = lista.get(tamanho-1);
				lista.add(auxiliar, i);
				lista.removeLast();
			} 
		} catch (Exception e) {
			e.getMessage();
		}
		return lista;
	}

}
