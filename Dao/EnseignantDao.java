package com.javaschedule.dao;


import java.util.*;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.util.FileManager;

import com.javaschedule.beans.EnseignantBean;
import com.javaschedule.beans.EnseignantJobBean;
import com.javaschedule.main.MainClass;


public class EnseignantDao {
	
	/*public static int save(EnseignantBean bean){
		int status=0;
		
		FileManager.get().addLocatorClassLoader(MainClass.class.getClassLoader());
		Model model = FileManager.get().loadModel("C:\\Users\\DEAR-JOE\\eclipse-workspace\\1_0_0_Project_Web_Semantique\\Ontologie_DI.owl");
		
		
		int id = bean.getId();
		String nom = bean.getNom();
		String prenom = bean.getPrenom();
		String cin = bean.getCin();
		String tel = bean.getTel();
		String adresse = bean.getAdresse();
		String email = bean.getEmail();
		String departement = bean.getDepartement();
		String sexe = bean.getSexe();
		String password = bean.getPassword();
		
		String queryInsert ="prefix : <http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#>" +  
				"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + 
				 "INSERT DATA{"+ 
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :id '"+id+"' ."+
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :nom '"+nom+"' ."+
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :prenom '"+prenom+"' ."+
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :cin '"+cin+"' ."+
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :tel '"+tel+"' ."+
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :adresse '"+adresse+"' ."+
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :email '"+email+"' ."+
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :departement '"+departement+"' ."+
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :sexe '"+sexe+"' ."+
							"<http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#enseignant3> :password '"+password+"' ."+

							"}";
		Query query = QueryFactory.create(queryInsert);
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		try {
				ResultSet results = qexec.execSelect();
				while (results.hasNext()) {
					QuerySolution soln = results.nextSolution();
					
				}
		}finally {
			qexec.close();
		}
		try {
			model.write(new FileOutputStream("C:\\Users\\DEAR-JOE\\eclipse-workspace\\1_0_0_Project_Web_Semantique\\Ontologie_DI_out.owl"),"RDFXML");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}*/
	
	public static Collection<EnseignantBean>  getAllEnseignants(){
	 	Collection<EnseignantBean> list = new ArrayList<EnseignantBean>();
			
		FileManager.get().addLocatorClassLoader(MainClass.class.getClassLoader());
		Model model = FileManager.get().loadModel("C:\\Users\\DEAR-JOE\\eclipse-workspace\\1_0_0_Project_Web_Semantique\\Ontologie_DI.owl");
		
		String querySelect ="prefix : <http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#>" +  
				"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + 
							"SELECT * WHERE {" +
							"?Enseignant :id ?id ."+
							"?Enseignant :nom ?nom ."+
							"?Enseignant :prenom ?prenom ."+
							"?Enseignant :cin ?cin ."+
							"?Enseignant :tel ?tel ."+
							"?Enseignant :adresse ?adresse ."+
							"?Enseignant :email ?email ."+
							"?Enseignant :departement ?departement ."+
							"?Enseignant :sexe ?sexe ."+
							"?Enseignant :password ?password ."+
							
				"}order by ?id";
		
		Query query = QueryFactory.create(querySelect);
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		try {
				ResultSet results = qexec.execSelect();
				while (results.hasNext()) {
					QuerySolution soln = results.nextSolution();
					
					
					int id = soln.getLiteral("id").getInt();
					String nom = soln.getLiteral("nom").getString();
				    String prenom = soln.getLiteral("prenom").getString();
				    String cin = soln.getLiteral("cin").getString();
				    String tel= soln.getLiteral("tel").getString();
				    String adresse= soln.getLiteral("adresse").getString();
				    String email = soln.getLiteral("email").getString();
				    String departement = soln.getLiteral("departement").getString();
				    String sexe= soln.getLiteral("sexe").getString();
				    String password= soln.getLiteral("password").getString();
				 
				    
				  EnseignantBean enseignant = new EnseignantBean(id, nom, prenom, cin, tel, adresse, email, departement, sexe, password);
				  list.add(enseignant);
				}
		}finally {
			qexec.close();
		}
		return list;
	}

	
	public static Collection<EnseignantJobBean>  getAllSessionsByEmail(String email){
		 	Collection<EnseignantJobBean> list = new ArrayList<EnseignantJobBean>();
				
			FileManager.get().addLocatorClassLoader(MainClass.class.getClassLoader());
			Model model = FileManager.get().loadModel("C:\\Users\\DEAR-JOE\\eclipse-workspace\\1_0_0_Project_Web_Semantique\\Ontologie_DI.owl");
			
			String querySelect ="prefix : <http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#>" +  
					"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
					"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + 
						"SELECT  * WHERE {" +
						"?enseignant :email '"+ email +"' ." +
						"?enseignant :Enseigne ?matiere ." +
						"?matiere :c_matiere ?c_matiere ." +
						"?matiere :Enseigner_A ?seance ." +
						"?seance :c_seance ?c_seance ." +
						"?seance :Reserver_A ?salle ." +
						"?salle :c_salle ?c_salle." +
						"?salle :Equipe_De ?materiel ." +
						"?materiel :c_materiel ?c_materiel ." +
						"?materiel :libelle_materiel ?libelle_materiel ." +					
				"}";
			
			Query query = QueryFactory.create(querySelect);
			QueryExecution qexec = QueryExecutionFactory.create(query, model);
			try {
					ResultSet results = qexec.execSelect();
					while (results.hasNext()) {
						QuerySolution soln = results.nextSolution();
						
						String matiere = soln.getLiteral("c_matiere").getString();
					    String seance = soln.getLiteral("c_seance").getString();
					    String salle = soln.getLiteral("c_salle").getString();
					    String materiel = soln.getLiteral("libelle_materiel").getString(); 
					    
					  EnseignantJobBean ejb = new EnseignantJobBean(matiere, seance, salle, materiel);
					  list.add(ejb);
					}
			}finally {
				qexec.close();
			}
			return list;
		}
	public static Collection<EnseignantJobBean>  getAllSessions(){
	 	Collection<EnseignantJobBean> list = new ArrayList<EnseignantJobBean>();
			
		FileManager.get().addLocatorClassLoader(MainClass.class.getClassLoader());
		Model model = FileManager.get().loadModel("C:\\Users\\DEAR-JOE\\eclipse-workspace\\1_0_0_Project_Web_Semantique\\Ontologie_DI.owl");
		
		String querySelect ="prefix : <http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#>" +  
				"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + 
					"SELECT  * WHERE {" +
					"?enseignant :nom ?nom ." +
					"?enseignant :Enseigne ?matiere ." +
					"?matiere :c_matiere ?c_matiere ." +
					"?matiere :Enseigner_A ?seance ." +
					"?seance :c_seance ?c_seance ." +
					"?seance :Reserver_A ?salle ." +
					"?salle :c_salle ?c_salle." +
					"?salle :Equipe_De ?materiel ." +
					"?materiel :c_materiel ?c_materiel ." +
					"?materiel :libelle_materiel ?libelle_materiel ." +					
			"}";
		
		Query query = QueryFactory.create(querySelect);
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		try {
				ResultSet results = qexec.execSelect();
				while (results.hasNext()) {
					QuerySolution soln = results.nextSolution();
					
					String matiere = soln.getLiteral("c_matiere").getString();
				    String seance = soln.getLiteral("c_seance").getString();
				    String salle = soln.getLiteral("c_salle").getString();
				    String materiel = soln.getLiteral("libelle_materiel").getString(); 
				    
				  EnseignantJobBean ejb = new EnseignantJobBean(matiere, seance, salle, materiel);
				  list.add(ejb);
				}
		}finally {
			qexec.close();
		}
		return list;
	}
	
	public static boolean validate(String email,String password){
		boolean status=false;
		
		FileManager.get().addLocatorClassLoader(MainClass.class.getClassLoader());
		Model model = FileManager.get().loadModel("C:\\Users\\DEAR-JOE\\eclipse-workspace\\1_0_0_Project_Web_Semantique\\Ontologie_DI.owl");
		
		String querySelect ="prefix : <http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#>" +  
				"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + 
				"SELECT * WHERE {" +
				//"?Enseignant :email '"+ v_email +"'."+
				"?Enseignant :email ?email ."+
				//"?Enseignant :password  '"+ v_password +"' ."+
				"?Enseignant :password  ?password ."+
				"}";
		
		
		
		Query query = QueryFactory.create(querySelect);
		QueryExecution qexec = QueryExecutionFactory.create(query, model);
		
		try {
			ResultSet results = qexec.execSelect();
			while (results.hasNext()) {
				QuerySolution soln = results.nextSolution();
				
				String p_email = soln.getLiteral("email").getString();
			    String p_password = soln.getLiteral("password").getString();
			    
			    if(email.equals(p_email) && password.equals(p_password)){
					status = true;
			    }
			    /*else { 
			    	status = false;
			    }*/
			}
	}finally {
		qexec.close();
	}
		return status;
	}
}
