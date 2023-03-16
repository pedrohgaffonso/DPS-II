


public class Vestimenta {
	
	private String cor;
	private String tecido;
	private int cont;



	public Vestimenta( String cor, String tecido) {
		
		this.cor = cor;
		this.tecido = tecido;

	}
	
	public int obterNumeroDeVestimentas() {
		
		return cont;
		
	}

 	
 	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getTecido() {
		return tecido;
	}



	public void setTecido(String tecido) {
		this.tecido = tecido;
	}



	public int getCont() {
		return cont;
	}



	public void setCont(int cont) {
		this.cont = cont;
	}


	@Override
	public String toString() {
		return "Vestimenta [cor=" + this.cor + ", tecido=" + this.tecido + ", cont=" + this.cont + "]";
	}

}

