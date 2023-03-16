

public class Calca extends Vestimenta{


		private int numero;
		
		public Calca(String cor, String tecido, int numero) {
			super(cor, tecido);
			this.numero = numero;
		
		}

		@Override
		public String toString() {
			return "Calca [Numero= " + this.numero + "]\n"
					+"[Tecido= " + getTecido() + "]\n"
					+"[Cor= " + getCor() + "]\n";
		}
}