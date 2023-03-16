public class Camisa extends Vestimenta {
	

	private String tipo;
	private int numero;
	
	public Camisa(String cor, String tecido, String tipo, int numero) {
		super(cor, tecido);
		this.tipo = tipo;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Camisa: [Numero= " + this.numero + "]\n"
				+"[Tipo= " + tipo +"]\n"
				+"[Tecido= " + getTecido() + "]\n"
				+"[Cor= " + getCor() + "]\n";
	}
}
