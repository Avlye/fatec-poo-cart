package cart;

import cart.views.GerenciarCompra;

public class MainClass {
	public static void main(String[] args) {
		GerenciarCompra.showMenu();
		GerenciarCompra.getScanner().close();
	}
}
