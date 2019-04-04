package cart.models;

public class Fornecedor {
	int idForn;
	
	String nome;
	String contato;
	String fone;
	String email;
	
	public int getIdForn() {
		return idForn;
	}

	public void setIdForn(int idForn) {
		this.idForn = idForn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void imprimirFornecedor() {
		System.out.println("--------------------------");
		System.out.println("Fornecedor ID: " + this.getIdForn());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Contato: " + this.getContato());
		System.out.println("Telefone: " + this.getFone());
		System.out.println("Email: " + this.getEmail());
	}
}
