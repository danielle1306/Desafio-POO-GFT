package exercicio3;


import java.util.List;
import java.util.Random;


public class Mago extends Personagem {
	
	private List<String> magia;
	
	//CONSTRUTOR
	
	public Mago(String nome, int vida, int inteligencia, float f, int level, float xp, int mana) {
		super(nome, vida, inteligencia, f, level, xp, mana, qtdPersonagens);
	}
	
	//GETTERS AND SETTERS
	
	public List<String> getMagia() {
		return magia;
	}
	public void setMagia(List<String> magia) {
		this.magia = magia;
	}
	
	//MÉTODO SOBRESCRITO
	@Override
	public int levelUp() {
		this.setInteligencia(getInteligencia()+5);
		this.setMana(getMana()+5);

		return super.levelUp();
	}
	
	//MÉTODOS PÚBLICOS
	
	public int attack() {
		Random aleatorio = new Random();
		return super.getInteligencia()*super.getLevel()+aleatorio.nextInt(300);
	
	}
	public void aprenderMagia(String magia) {
		this.magia.add(magia);
		System.out.println(magia);
	}
	
	
	
	
}
