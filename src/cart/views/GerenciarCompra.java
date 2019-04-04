package cart.views;

import java.util.Scanner;

import cart.models.Cesta;
import cart.models.Fornecedor;
import cart.models.Produto;

public class GerenciarCompra {
	static Cesta cesta;
	static Produto produto;
	static Fornecedor fornecedor;
	
	static boolean empty = true;
	
	static Scanner sc = new Scanner(System.in);
	
	private GerenciarCompra() {}
	
	public static void showMenu() {
		int optionMenu = 0;
		
		abrirCarrinho();
		
		do {
			System.out.println("1. Cadastrar Fornecedor");
			System.out.println("2. Cadastrar Produto");
			System.out.println("3. Abrir Carrinho");
			System.out.println("4. Fechar Carrinho");
			System.out.println("9. Sair");
			System.out.print("\nEscolha sua opção: ");
			
			
			optionMenu = sc.nextInt();
			System.out.println();
			
			switch (optionMenu) {
			case 1:
				cadastrarFornecedor();
				break;
				
			case 2:
				cadastrarProduto();
				break;
				
			case 3:
				abrirCarrinho();
				break;
				
			case 4:
				fecharCarrinho();
				break;
				
			case 9:
				System.out.println("Obrigado pela preferência. (^-^)");
				break;
				
			default:
				System.out.println("Opção inválida");
			}
			
		} while (optionMenu != 9);
	}

	public static void cadastrarFornecedor() {
		fornecedor = new Fornecedor();
		sc = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		fornecedor.setNome(sc.nextLine());
		
		System.out.print("Digite o contato: ");
		fornecedor.setContato(sc.nextLine());
		
		System.out.print("Digite o fone: ");
		fornecedor.setFone(sc.nextLine());
		
		System.out.print("Digite o email: ");
		fornecedor.setEmail(sc.nextLine());
		System.out.println();
		
		empty = false;
	} 

	public static void cadastrarProduto() {
		
		if (empty) {
			System.out.println("Nenhum fornecedor adicionado.");
			System.out.println("Por favor, cadastre um fornecedor.");
			cadastrarFornecedor();
		}
		
		String descricao;
		double preco;
		
		System.out.println("Digite as informações do produto.");
		System.out.print("Descrição: ");
		descricao = sc.next();
		
		System.out.print("Preço: R$ ");
		preco = sc.nextDouble();
		
		produto = new Produto(descricao, preco, fornecedor);
		
		cesta.adicionarItem(produto);
	}

	public static void abrirCarrinho() {
		System.out.println("Criando Cesta de Produtos ....");
		System.out.print("Quantos itens no máximo? -> ");
		
		int limit = sc.nextInt();
		cesta = new Cesta(limit);
		
		System.out.println("Cesta criada \\o/");
		System.out.println("Adicione novos fornecedores e produtos a cesta pelo menu de opções.");
	}

	public static void fecharCarrinho() {
		cesta.calcularTotal();
	}
	
	public static Scanner getScanner() {
		return sc;
	}

}
