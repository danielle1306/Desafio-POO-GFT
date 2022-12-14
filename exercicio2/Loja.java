package exercicio2;

import java.util.List;

public class Loja {

		//ATRIBUTOS
		public String nome;
		public int cnpj;
		public List<Livro>livros;
		public List<VideoGame>videoGames;

		//CONSTRUTOR
		
		public Loja(String nome, int cnpj, List<Livro> livros, List<VideoGame> videoGames) {
			super();
			this.nome = nome;
			this.cnpj = cnpj;
			this.livros = livros;
			this.videoGames = videoGames;
		}
		
		//GETTERS AND SETTERS

		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getCnpj() {
			return cnpj;
		}


		public void setCnpj(int cnpj) {
			this.cnpj = cnpj;
		}


		public List<Livro> getLivros() {
			return livros;
		}


		public void setLivros(List<Livro> livros) {
			this.livros = livros;
		}


		public List<VideoGame> getVideoGames() {
			return videoGames;
		}


		public void setVideoGames(List<VideoGame> videoGames) {
			this.videoGames = videoGames;
		}

		//MÉTODOS PÚBLICOS
		
		public void listaLivros() {
			if (listaLivros.isEmpty() == true) {
				System.out.println("A loja não tem livros em seu estoque");
			} else {
				System.out.println(livros.toString());
			}
		}		

		public void listaVideoGames() {
			if (videoGames.isEmpty() == true) {
				System.out.println("A loja não tem videogames em seu estoque");

			} else {
				System.out.println(videoGames.toString());
			}
		}
		public double calculaPatrimonio() {
			double totalLivros = 0;
			double totalVideoGames = 0;
			for (int i = 0; i < livros.size(); i++) {
				totalLivros = livros.get(i).getQuantidade() * livros.get(i).getPreco() + totalLivros++;

			}
			for (int i = 0; i < videoGames.size(); i++) {
				totalLivros = videoGames.get(i).getQuantidade() * videoGames.get(i).getPreco() + totalVideoGames++;

			}	
			double patrimonio = totalLivros + totalVideoGames;
			System.out.println("O patrimônio total é R$" + patrimonio);
			return 0;

		}
	}


