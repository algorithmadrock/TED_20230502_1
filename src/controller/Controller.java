/*
 RESUMO		 : Construção dos comandos para a ordenação
 PROGRAMADORA: Luiza Felix
 DATA		 : 07/05/2023
 */

package controller;
import br.edu.fateczl.listas.Lista;

public class Controller {

	private static Lista lista = new Lista();
	
	public Controller() {
		super();
	}
	
	public static void loadlista() {
//		segundo os dados que foram requisitados no enunciado
		int[] vetor = {6, 3, 7, 4, 2, 9, 1, 8, 5, 10};
		for(int dado : vetor) {
			lista.addfirst(dado);
		}
		System.out.println("A lista foi carregada!\n" + lista.toString());
	}

	public static void organize() throws Exception {
		int size = lista.size();
		for (int round = 1; round <= size; round++) {
			for(int i = 0; i < (size-round);i++) {
				int n = (int)(lista.get(i));
				if (n > (int)(lista.get(i+1))) {
					lista.remove(i);
					lista.add(n, i+1);
				}
			}
		}
		System.out.println("A lista foi ordenada!\n"+lista.toString());
	}
	
}
