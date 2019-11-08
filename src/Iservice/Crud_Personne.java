package Iservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Metier.Personne;

public class Crud_Personne {
	
		public int creerPersonne(List<Personne> list, Personne personne)
		{
			return 1;
		}
	
		public Personne getPersonne(List<Personne> list,int idPersonne)
		{
			Personne p = new Personne();
			return p;
		}
		
		public void deletePersonne(List<Personne> list,int idPersonne)
		{}
		
		public void updatePersonne(List<Personne> list,Personne p, String nom, String prenom, Date dateNaissance)
		{}
		
		public List<Personne> findAllPersonnes()
		{
			List<Personne> LP = new ArrayList();
			return LP;
		}
		
		public int getPersonneId(List<Personne> list,Personne p)
		{
			return 1;
		}
		
		public void affichePersonnes()
		{
			System.out.println("Voici la personne demandée");
		}
		
		public void afficheAnnoncesPersonne(Personne p)
		{}

}
