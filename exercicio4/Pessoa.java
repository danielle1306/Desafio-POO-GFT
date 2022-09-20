package exercicio4;
import java.util.List;

public class Pessoa {
	//ATRIBUTOS
	
	private String nome;
	
	private int idade;
	
	//MÉTODO CONSTRUTOR

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	//GETTERS AND SETTERS
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//TOSTRING
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	
	
	
	
	

}
