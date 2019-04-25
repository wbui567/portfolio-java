package iu;
import om.*;
import java.util.*;
import java.util.Enumeration;
//Main.java

	class Main {
		public static void main(String argv[]) 
		{
			Bibliotheque bibliotheque = new Bibliotheque("Bibliotheque de la Villette");
			
			Livre livre1 = new Livre("Visual Modeling with Rose", 222, "Terry Quatrani", "Addison Wesley" );
			
			Periodique periodique1 = new Periodique("programmez", 150, "mensuel");
			
			Cassette cassette1 = new Cassette("That's the way it is", "Elvis Presley", 120);
			
			System.out.println("livre => " + livre1 ); System.out.println("periodique => " + periodique1); System.out.println("cassette => " + cassette1); Document i = livre1;
			
			System.out.println("Le document => " + i); bibliotheque.ajouterDocument(livre1); bibliotheque.ajouterDocument(periodique1); bibliotheque.ajouterDocument(cassette1); System.out.println(bibliotheque.getNom()); bibliotheque.listerDocuments();
		} 
      	public Enumeration documents() {
      		for (Enumeration<om.Bibliotheque.Vector<String>> e = om.Bibliotheque.this.vector.elements(); e.hasMoreElements();)
      	       System.out.println(e.nextElement());
      	}
}
