package om;

		public class Periodique extends Document {
			String frequence;
			int page;
			public Periodique (String titre, int page, String frq){
				super (titre);
				frequence=frq;
				this.page = page;
			}
			public String toString() {
				return  super.toString() + " frequence = " + frequence + " page = " + page;
			}
		}

