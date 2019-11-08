package Iservice;

import java.util.ArrayList;
import java.util.List;

import Metier.Annonce;
import Metier.Personne;

public class Crud_Annonce {
	
		public int creerAnnonce(Personne personne, Annonce a)
		{
			return 1;
		}
		
		public Annonce getAnnonce(Personne personne,int idAnnonce)
		{
			Annonce A = new Annonce();
			return A;
		}
		
		public void deleteAnnonce(Personne personne,int idAnnonce)
		{}
		
		public void updateAnnonce(Personne personne,Annonce a)
		{}
		
		public List<Annonce> findAllAnnonce(Personne personne)
		{
			List<Annonce> LA = new ArrayList();
			return LA;
		}
}
