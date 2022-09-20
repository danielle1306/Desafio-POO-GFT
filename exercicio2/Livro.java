package exercicio2;

public class Livro extends Produto implements Imposto {
	
	private String autor;
	
	private String tema;
	
	private int quantidadePag;
	
	

	//CONSTRUTOR
	public Livro(String nome, double preco, int quantidade, String autor, String tema, int quantidadePag) {
		super(nome, preco, quantidade);
		this.autor = autor;
		this.tema = tema;
		this.quantidadePag = quantidadePag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

		
	public int getQuantidadePag() {
		return quantidadePag;
	}

	public void setQuantidadePag(int quantidadePag) {
		this.quantidadePag = quantidadePag;
}

	@Override
	public double calcularImposto() {
		if (getTema() == "educativo")
			System.out.println("Taxa de imposto é zero" + this.getPreco()+ this.getNome());
		
	} else {
		System.out.println ("O valor final, considerando o imposto é: R$ "  + this.getPreco()* 0.1);
	}
	
	

}
