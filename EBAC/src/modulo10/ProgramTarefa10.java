package modulo10;

public class ProgramTarefa10 {

	public static void main(String[] args) {
		Double media = mediaNotas(10.0, 7.0, 5.0, 8.0);
		
		if (media >= 7) {
			System.out.println("Aluno aprovado");
		} else if (media >= 5){
			System.out.println("Aluno em recuperação");
		} else {
			System.out.println("Aluno reprovado");
		}
		
	}
	private static Double mediaNotas(Double nota1, Double nota2, Double nota3, Double nota4) {
		return (nota1 + nota2 + nota3 + nota4)/4;
	}

}
