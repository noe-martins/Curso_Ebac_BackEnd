package modulo13;

public final class PessoaJuridica extends Pessoa{
	private String cnpj;

	public PessoaJuridica(String nome, String cnpj) {
		super();
		this.cnpj = cnpj;
		setNome(nome);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", Nome=" + super.getNome() + "]";
	}

	
}
