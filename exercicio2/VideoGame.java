package exercicio2;

public class VideoGame extends Produto {
	
	private String marca;
	private String modelo;
	private boolean isUsado;

	public VideoGame(String nome, double preco, int quantidade) {
		super(nome, preco, quantidade);
		
	}

	@Override
	public void calcularImposto(double taxa) {
		if (this.isUsado) {
			this.calcularImposto(this.getPreco() + this.getPreco()* 0.25);
		} else {
			this.calcularImposto(this.getPreco() + this.getPreco()* 0.45);
		}
		
		
	}

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

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

}
