/*
 RESUMO		 : Classe de execução da demonstração
 PROGRAMADORA: Luiza Felix
 DATA		 : 07/05/2023
 */


package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {
	public static void main(String[] args) {
		int opcao = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Carregar a lista\n2. Mostrar valores ordenados\nPara SAIR digite 0;"));
			
			switch(opcao) {
			case 1:
				Controller.loadlista();
				break;
			case 2:
				try {
					Controller.organize();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 0:
				System.out.println("Programa finalizado com sucesso!");
			}
		}	while(opcao!=0);

	}
}

