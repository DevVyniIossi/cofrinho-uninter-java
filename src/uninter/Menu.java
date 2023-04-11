package uninter;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	public void mostrarMenu() {
		System.out.println("COFRINHO DO VYNICIUS IOSSI RU:4018558:");
		System.out.println("1-Adicionar moeda:");
		System.out.println("2-Remover moeda:");
		System.out.println("3-Listar moedas:");
		System.out.println("4-Calcular valor total da conversão para real:");
		System.out.println("0-Encerrar");
		
		String opcaoSelecionada = sc.next();
		
		switch (opcaoSelecionada) {
// Finalizar sistema
			case "0":
				System.out.println("Sistema finalizado!");
				break;

// Caso de adicionar moeda
			case"1":	
			exibirMenuAdicionarMoeda();	 		
			mostrarMenu(); 
			break;
			
// Caso de remover moeda			
			case "2":
				exibirMenuRemoverMoeda();	 		
				mostrarMenu(); 
				break;
			
// Caso de listar moedas
			case "3":
				cofrinho.listagemMoedas();
				mostrarMenu(); 
				break;
				
// Caso de converter valor total moedas	para real
			case "4":
				double valorTotalDaConversao = cofrinho.totalConvertido();
				String valorTotalDaConversaoTextual = String.format("%.2f",valorTotalDaConversao);
				valorTotalDaConversaoTextual = valorTotalDaConversaoTextual.replace(".", ",");
				System.out.println("O valor total convertido para real é de: " + valorTotalDaConversaoTextual + " reais ");
				mostrarMenu();
				break;
				
			default:
				System.out.println("Opção inválida");
				mostrarMenu(); 
				break;
				
		}		
	}

	
// Método de adicionar moeda
private void exibirMenuAdicionarMoeda() {
	 System.out.println("Escolha sua moeda:");
		System.out.println("1 - Real:");
		System.out.println("2 - Dólar:");
		System.out.println("3 - Euro:");
		
		int opcaoMoedaSelecionada = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		
		String valorTextualMoeda = sc.next();
		valorTextualMoeda = valorTextualMoeda.replace(",","." );
		
		double valorMoeda = Double.valueOf(valorTextualMoeda);
		
		Moeda moeda = null;
		
		if (opcaoMoedaSelecionada == 1) {
			 moeda = new Real(valorMoeda);
			
			} else if (opcaoMoedaSelecionada == 2) {
			 moeda = new Dolar(valorMoeda);
			
			} else if (opcaoMoedaSelecionada == 3) {
				 moeda = new Euro(valorMoeda);
			} else {
				System.out.println("Não existe essa moeda!");
				mostrarMenu(); 
			}
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada!");
 }
	
// Método de remover moeda
private void exibirMenuRemoverMoeda() {
	 System.out.println("Escolha sua moeda:");
		System.out.println("1 - Real:");
		System.out.println("2 - Dólar:");
		System.out.println("3 - Euro:");
		
		int opcaoMoedaSelecionada = sc.nextInt();
		
		System.out.println("Digite o valor: ");
		
		String valorTextualMoeda = sc.next();
		valorTextualMoeda = valorTextualMoeda.replace(",","." );
		
		double valorMoeda = Double.valueOf(valorTextualMoeda);
		
		Moeda moeda = null;
		
		if (opcaoMoedaSelecionada == 1) {
			 moeda = new Real(valorMoeda);
			
			} else if (opcaoMoedaSelecionada == 2) {
			 moeda = new Dolar(valorMoeda);
			
			} else if (opcaoMoedaSelecionada == 3) {
				 moeda = new Euro(valorMoeda);
			} else {
				System.out.println("Não existe essa moeda!");
				mostrarMenu(); 
			}
		
		boolean removeMoeda = cofrinho.remover(moeda);
		
// Print de resposta
		if(removeMoeda) {
			System.out.println("Moeda removida!");
		} else {
			System.out.println("Não foi encontrada nenhuma moeda com esse valor!");
		}
}

}
