package exercicio4;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		//EXERCÍCIO 4
		List<Pessoa> pessoa = new ArrayList<>();
		
		pessoa p1 = new Pessoa("João", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jéssica", 18);
		
		pessoa.add(p1);
		pessoa.add(p2);
		pessoa.add(p3);
		pessoa.add(p4);
		
	}
	int maiorIdade = 0;
	for(int i = 0; i < lista.size(); i++) {
		if (Pessoa.get(i).getIdade(i) > maiorIdade) {
			maiorIdade = Pessoa.get(i).getIdade(i);
			System.out.println(Pessoa.get(i).getIdade(maiorIdade));
		} else {
			System.out.println("Lista vazia");
		}
	}

	//EXERCÍCIO 5
	
	System.out.println(pessoa.size());
	pessoa.removeIf(pessoa => pessoa.getIdade() < 18);
	for (var pessoa : pessoas) {
		System.out.println(pessoa.getNome);
		System.out.println(pessoa.size());
	}
	
	//EXERCÍCIO 6
	
	for (var pessoa : pessoas) {
		if (pessoa.getNome().equalsIgnoreCase("Jessica")) {
			System.out.println("Nome encontrado na lista" + getIdade());
		} else {
			System.out.println("Nome não encontrado");
		}
	}
	
	}


}
