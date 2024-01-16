package modulo12;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProgramColecoesPt2 {
	
	private static Scanner leitor;
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Map<String, String> cadastros = new TreeMap<>();
		
		//CADASTRO DOS USUÁRIOS
		int numeroCadastros = Integer.parseInt(textInput("Digite a quantidade de pessoas que deseja cadastrar: "));
		for (int i = 0; i < numeroCadastros; i++) {
			String cadastro = textInput("Digite o nome-sexo da pessoa N°" + (i+1) + " (Ex: Ana-F): ");
			String[] filder = cadastro.split("-");
			cadastros.put(filder[0], filder[1]);
		}
		
		//IMPRESSÃO POR SEXO
		System.out.println("\nMulheres");
		for (String nomes : cadastros.keySet()) {
			if (cadastros.get(nomes).equalsIgnoreCase("F")) {
				System.out.println(nomes + ": " + cadastros.get(nomes));
			}
		}
		
		System.out.println("\nHomens");
		for (String nomes : cadastros.keySet()) {
			if (cadastros.get(nomes).equalsIgnoreCase("M")) {
				System.out.println(nomes + ": " + cadastros.get(nomes));
			}
		}
		
		leitor.close();
		
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}
}
