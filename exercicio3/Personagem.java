package exercicio3;

public class Personagem {
	
	//ATRIBUTOS
	
	private String nome;
	private int vida;
	private int inteligencia;
	private int forca;
	private int level;
	private float xp;
	private int mana;
	static int qtdPersonagens;
	
	//CONSTRUTOR

	public Personagem(String nome, int vida, int inteligencia, int forca, int level, float xp, int mana, int qtdPersonagens) {
		//super();
		this.nome = nome;
		this.vida = vida;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
		this.xp = xp;
		this.mana = mana;
		this.qtdPersonagens ++;
	}
	
	//GETTERS AND SETTERS

	public static int getQtdPersonagens() {
		return qtdPersonagens;
	}

	public static void setQtdPersonagens(int qtdPersonagens) {
		Personagem.qtdPersonagens = qtdPersonagens;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
	//MÉTODOS PÚBLICOS
	
	public int levelUp() {
		return level ++;
	}
	
	

}
