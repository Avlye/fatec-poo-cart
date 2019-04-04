package cart.models;

import java.util.Arrays;
import java.util.Objects;

public class Cesta implements ICesta {
	Produto[] itens;
	
	public Cesta(int limit) {
		itens = new Produto[limit];
	}
	
	@Override
	public void adicionarItem(Produto produto) {
		int index = Arrays.asList(itens).indexOf(null);
		if (index != -1) itens[index] = produto;
		else {
			System.out.println("----------------------------------");
			System.err.println("Cesta cheia! Impossível adicionar.");
			System.out.println("----------------------------------");
		}
	}
	
	@Override
	public void exibirLista() {		
		Arrays.asList(itens).stream()
			.filter(Objects::nonNull)
			.forEach(Produto::imprimirEtiqueta);
	}
	
	@Override
	public void calcularTotal() {
		double total = 0.0;
		
		for (Produto produto : itens) {
			if (produto != null) {
				this.exibirLista();
				total += produto.preco;
			}
		}
		
		System.out.println("Valor Total: R$ " + total);
		System.out.println();
	}
}
