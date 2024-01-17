package modulo13;

public final class PessoaFisica extends Pessoa{
	private String cpf;

	public PessoaFisica(String nome, String cpf) {
		super();
		this.cpf = cpf;
		setNome(nome);
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", nome=" + super.getNome() + "]";
	}

}
