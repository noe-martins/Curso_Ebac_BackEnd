package modulo7;

/**
 * Classe que representa a figura geométrica do retângulo, tendo como atributos
 * a largura e a altura.
 * 
 * @author noe.martins
 */
public class Retangulo {
	private Double largura;
	private Double altura;
	
	public Retangulo(Double largura, Double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	/**
	 * Método responsável por calcular a área do retângulo
	 * 
	 * @return A área do retângulo
	 */
	public Double area() {
		return this.largura * this.altura;
	}
	
}
