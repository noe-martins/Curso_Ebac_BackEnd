package modulo8;

public class ProgramMedia {

	public static void main(String[] args) {
		
		Double media = mediaNotas(10.0, 7.0, 5.0, 8.0);
		boolean avaliacao = media >= 7.0;
		
		System.out.println("Média do Aluno: " + media);
		System.out.println("Aprovação (true -> Aprovado | false -> Reprovado): " + avaliacao);
	}
	
	private static Double mediaNotas(Double nota1, Double nota2, Double nota3, Double nota4) {
		return (nota1 + nota2 + nota3 + nota4)/4;
	}

}
