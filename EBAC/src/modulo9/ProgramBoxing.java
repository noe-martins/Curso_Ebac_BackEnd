package modulo9;

import java.util.Scanner;

public class ProgramBoxing {
	private static Scanner leitor;
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		int num = Integer.parseInt(textInput("Digite um número inteiro: "));
		Integer num_2 = num;
		
		System.out.println("Número digitado usando o seu Wrapper: " + num_2);
	}
	private static String textInput(String label) {
		System.out.print(label);
		return leitor.nextLine();
	}

}
