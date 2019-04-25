package om;
import java.util.Enumeration;
import java.util.Vector;
import iu.*;

public class Bibliotheque {
	// Creation du Vector 
	public Vector<String> vector = new Vector<String>();	    
      String     nom;
      int nbDocuments;
      final int MAXDOCUMENT = 200;
      	Document[] tdocument = new Document[MAXDOCUMENT];
      	public Bibliotheque (String nom){
      		this.nom = nom;
      	}
      	
      	public String toString() {
      		return  "Nom de la Bibliotheque = " + nom;
      	}

      	public void ajouterDocument (Document doc) { if(nbDocuments == MAXDOCUMENT) { System.out.println("La bibliotheque est plein"); System.exit(1);
      	}
      	
      	else tdocument[nbDocuments++] = doc;
      	}
   /*   	public void listerDocuments() {
      		for(int i = 0; i < nbDocuments; i++)
      			System.out.println(tdocument[i]);
      	}*/

      	public String getNom () {
      		return nom; 
      	}
	}