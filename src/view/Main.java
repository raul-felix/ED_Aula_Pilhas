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
		
		while(p.size() > 1) {
			try {
				int topo = p.pop();
				int abaixoTopo = p.pop();
				if (topo < abaixoTopo) {
					p.push(topo);
				} else {
					p.push(abaixoTopo);
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		try {
			System.out.println("Menor valor da pilha: " + p.top());
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}
