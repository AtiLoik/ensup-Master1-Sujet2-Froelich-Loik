package Iservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Metier.Personne;

public class Crud_Personne {
	
		public void creerPersonne(List<Personne> list, Personne personne)
		{
			list.add(personne);
		}
	
		public Personne getPersonne(List<Personne> list,int idPersonne)
		{
			Personne p = new Personne();
			for (int i = 0; i < list.size(); i++)
			{
				if(i == idPersonne)
				{
					p = list.get(i);
				}
			}
			return p;
		}
		
		public void deletePersonne(List<Personne> list,int idPersonne)
		{
			Personne p = new Personne();
			for (int i = 0; i < list.size(); i++)
			{
				if(i == idPersonne)
				{
					list.remove(i);
				}
			}
		}
		
		public void updatePersonne(List<Personne> list,Personne p, String nom, String prenom, Date dateNaissance)
		{
			for (int i = 0; i < list.size(); i++)
			{
				if(i == p.getId())
				{
					p.setNom(nom);
					p.setPrenom(prenom);
					p.setDateNaissance(dateNaissance);
				}
			}
		}
		
		public List<Personne> findAllPersonnes()
		{
			List<Personne> LP = new ArrayList();
			return LP;
		}
		
		public int getPersonneId(List<Personne> list,Personne p)
		{
			return p.getId();
		}
		
		public void affichePersonnes()
		{
			System.out.println("Voici la personne demandée");
		}
		
		public void afficheAnnoncesPersonne(Personne p)
		{}

}
