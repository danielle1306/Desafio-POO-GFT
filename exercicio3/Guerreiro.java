package exercicio3;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {		
	
	private List<String> habilidade;
	
	//CONSTRUTOR
	
	public Guerreiro(String nome, int vida, int inteligencia, float forca, int level, float xp, int mana) {
		super(nome, vida, inteligencia, forca, level, xp, mana, qtdPersonagens);
	}
	
	//GETTERS AND SETTERS

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	//MÉTODO SOBRESCRITO
	
	@Override
	public int levelUp() {
		
		return super.levelUp();
	}
	
	

	public int attack() {
		Random aleatorio = new Random();
		return super.getForca()*super.getLevel()+aleatorio.nextInt(300);
	
   }
	public void aprenderHabilidade(String habilidade) {
		this.habilidade.add(habilidade);
		System.out.println(habilidade);
	}
	
}

	

