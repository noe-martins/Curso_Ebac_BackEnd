package modulo13;

public class ProgramApp {

	public static void main(String[] args) {
		PessoaFisica pessoaF = new PessoaFisica("Noé", "123456789");
		PessoaJuridica pessoaJ = new PessoaJuridica("Empresa", "5556-20");
		
		System.out.println(pessoaF);
		System.out.println(pessoaJ);
	}

}
