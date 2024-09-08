package view;

import model.Pilha;

public class Main {
	
	public static void main(String[] args) {
		
		Pilha p = new Pilha();
		int[] vetor = { 19, 44, -1, 8, -10, 75, -15, 0 };
		
		System.out.println("Size: " + p.size());
		for (int valor : vetor) {
			p.push(valor);
		}
		System.out.println("Size: " + p.size());
		
		int menor;
		try {
			menor = p.pop();
			while(!p.isEmpty()) {
				int valor = p.pop();
				if (valor < menor) {
					menor = valor;
				}
			}
			System.out.println("Menor valor da pilha: " + menor);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
