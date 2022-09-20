package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor doa Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		
		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		
		VideoGame ps4 = new VideoGame("PS4", 1800, 100);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500);
		
		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		
		Loja americanas = new Loja();
		
		l2.calcularImposto();
		l3.calcularImposto();
		
		ps4Usado.calcularImposto();
		ps4.calcularImposto();
		
		americanas.listaLivros();
		americanas.listaVideoGames();
		americanas.calculaPatrimonio();
		

	}

}
