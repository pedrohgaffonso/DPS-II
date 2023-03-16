


public class Vestido extends Vestimenta {

		private boolean longo;

		public Vestido(String cor, String tecido, boolean longo) {
			super(cor, tecido);
			this.longo = longo;
		}

		public boolean isLongo() {
			return longo;
		}

		public void setLongo(boolean longo) {
			this.longo = longo;
		}
		
		public String toString()
		{
			if (this.longo == true)
			{
				return 	"Vestido: [cor = " + getCor() + "]" 
						+"\n[tecido = " + getTecido() + "]"
						+"\nO vestido é longo.\n"; 
			}
				return  "Vestido: [cor = " + getCor() + "]"
						+"\n[tecido = " + getTecido() + "]"
						+"\nO vestido é curto.\n";
		}
}

	