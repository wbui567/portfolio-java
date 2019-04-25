package om;

public class Cassette extends Document {
		String auteur;
		int duree;
		public Cassette(String titre, String auteur, int duree){
			super (titre);
			this.duree = duree;
			this.auteur = auteur;
		}
		public String toString() {
			return  super.toString() + " auteur = " + auteur + " duree = " + duree;
		}
	}