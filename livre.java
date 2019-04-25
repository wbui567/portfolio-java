package om;

public class Livre extends Document {
		String auteur;
		String editeur;
		int page;
		public Livre (String titre, int page, String auteur, String editeur) {
			super(titre);
			this.editeur=editeur;
			this.auteur=auteur;
			this.page = page;
		}
		public String toString() {
			return  super.toString() + " Auteur = " + auteur + " Editeur = " + editeur + " Page = " + page;
		}
}