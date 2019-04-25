package om;
import java.util.Date;

public class Document {
	private String titre;
	private Date creationDate;
	public Document(String mAXDOCUMENT) {
		titre = mAXDOCUMENT;
		creationDate = new Date();
	} 

		public Document() {
		}
		public String toString() {
			return  "Titre = " + titre + " Creation Date = " + creationDate;
		}
		public String getTitre() { return titre; }
		public void setTittre(String s) { titre = s; }
		public Date getCreationDate() { return creationDate;
		}	
}