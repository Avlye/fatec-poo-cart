package cart.models;

public class Produto {
	int codProd = 0;
	double preco;
	
	static int productCount = 0;
	
	String descricao;
	Fornecedor fornecedor;
	
	public Produto(String descricao, double preco, Fornecedor fornecedor) {
		codProd = productCount;
		
		this.descricao = descricao;
		this.preco = preco;
		this.fornecedor = fornecedor;
		
		productCount++;
	}
	
	public void imprimirEtiqueta() {
		// "[cod: %i] %s - %s R$%d"
		System.out.println("------------------");
		System.out.println("Produto ID: " + codProd);
		System.out.println("Descrição: " + descricao);
		System.out.println("Preço: " + preco);
		fornecedor.imprimirFornecedor();
		System.out.println("------------------");
		System.out.println();
	}
}
