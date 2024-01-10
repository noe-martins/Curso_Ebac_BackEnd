package modulo11;

import java.util.ArrayList;
import java.util.List;

public class ProgramColecoesParte1 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Ana");
		nomes.add("Zé");
		nomes.add("Maria");
		nomes.add("Joaquim");
		nomes.sort((n1, n2) -> n1.toUpperCase().compareTo(n2.toUpperCase()));
		System.out.println(nomes);
	}

}
