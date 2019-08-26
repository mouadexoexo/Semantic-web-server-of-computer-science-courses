package com.javaschedule.dao;

import java.util.*;
import java.util.Collection;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.util.FileManager;

import com.javaschedule.beans.EmploiBean;
import com.javaschedule.main.MainClass;

public class EmploiDao {
	
	public static Collection<EmploiBean>  getSchedule(){
		Collection<EmploiBean> list = new ArrayList<EmploiBean>();
		
		FileManager.get().addLocatorClassLoader(MainClass.class.getClassLoader());
		Model model = FileManager.get().loadModel("C:\\Users\\DEAR-JOE\\eclipse-workspace\\1_0_0_Project_Web_Semantique\\Ontologie_DI.owl");
		
		String querySelect ="prefix : <http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#>" +  
				"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + 
				"SELECT * WHERE {"+
							"?Enseignant :Enseigne ?matiere ."+
							"?Enseignant :nom ?nom." +
							"?matiere :c_matiere ?c_matiere . "+
							"?matiere :libelle_matiere ?libelle_matiere . "+
							"?matiere :Enseigner_A ?seance." +
							"?seance :c_seance ?c_seance ."+
							"?seance :type_seance ?type_seance ."+
							"?seance :h_debut ?h_debut ."+
							"?seance :h_fin ?h_fin ."+
							"?seance :jour ?jour ."+
							"?seance :Reserver_A ?salle ." +
							"?salle :c_salle ?c_salle."+
							"?salle :type_salle ?type_salle."+
							"?salle :Equipe_De ?materiel ." +
							"?materiel :libelle_materiel ?libelle_materiel ."+
							
									
			"}order by ?c_seance";
		
		Query query = QueryFactory.create(querySelect);
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		try {
				ResultSet results = qexec.execSelect();
				while (results.hasNext()) {
					QuerySolution soln = results.nextSolution();
					String c_matiere = soln.getLiteral("c_matiere").getString();
				    String libelle_matiere = soln.getLiteral("libelle_matiere").getString();
				    String seance = soln.getLiteral("c_seance").getString();
				    String type_seance = soln.getLiteral("type_seance").getString();
				    String h_debut= soln.getLiteral("h_debut").getString();
				    String h_fin= soln.getLiteral("h_fin").getString();
				    String jour= soln.getLiteral("jour").getString();
				    String c_salle = soln.getLiteral("c_salle").getString();
				    String type_salle = soln.getLiteral("type_salle").getString();
				    //String libelle_materiel = soln.getLiteral("libelle_materiel").getString(); 
				    String nom = soln.getLiteral("nom").getString(); 
				    
				    EmploiBean emploi =new EmploiBean(jour, h_debut, h_fin, seance, type_seance, c_salle, type_salle, libelle_matiere, c_matiere, nom);
				    list.add(emploi);
				    
				 
				}
		}finally {
			qexec.close();
		}
		
		return list;
	}

}
