package exercicio1;

public class Main {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("fusca", "wolksvagem", "FAT1241", "Gelo", 54000, true, 30, 50, 20.0, 10);
		
		veiculo.abastecer(0);
		veiculo.acelerar();
		veiculo.desligar();
		veiculo.frear();
		veiculo.getCor();
		veiculo.getKm();
		veiculo.getLitrosCombustivel();
		veiculo.getMarca();
		veiculo.getModelo();
		veiculo.getPlaca();
		veiculo.getPreco();
		veiculo.isLigado();
		
	}
}
