package exercicio1;

public class Veiculo {
	
	//ATRIBUTOS
	
	private String marca;
	
	private String modelo;
	
    private String placa;
	
	private String cor;
	
	private float km;
	
	private boolean isLigado;
	
	private int litrosCombustivel;
	
	private int velocidade;
	
	private double preco;

	private int quantidadeDeCombustivel;
	
	//MÉTODO CONSTRUTOR	
		
	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, int quantidadeDeCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
		this.quantidadeDeCombustivel = quantidadeDeCombustivel;
	}
	
	
	//MÉTODOS ACESSORES - GETTERS AND SETTERS

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}


	public int getQuantidadeDeCombustivel() {
		return quantidadeDeCombustivel;
	}


	public void setQuantidadeDeCombustivel(int quantidadeDeCombustivel) {
		this.quantidadeDeCombustivel = quantidadeDeCombustivel;
	}
	
	
	//MÉTODOS PÚBLICOS
	
	public void acelerar() {
		if(isLigado) {
			setVelocidade(getVelocidade()+20);
		}

	}

	public void abastecer(int quantidadeDeCombustivel) {
		
		int litrosCombustivel = combustivelAdicionado + getQuantidadeDeCombustivel();
		if (quantidadeDeCombustivel > 60) {
			System.out.println("Capacidade do tanque é limitada a 60 litros");
		} else {
			System.out.println("O tanque possui " + quantidadeDeCombustivel + "litros");
		}
	}

	public void frear() {

		if (isLigado == true && velocidade > 0) {
			this.velocidade = - 20;
		} else {
			System.out.println("O carro está parado ou desligado");

		}

	}

	public void pintar(String corEscolhida) {
		this.cor = corEscolhida;

	}

	public void ligar() {
		this.isLigado = isLigado;

	}

	public void desligar() {
		if (velocidade == 0) {
			this.isLigado = false;
		} else {
			this.isLigado = true;
		}
		


	}


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
