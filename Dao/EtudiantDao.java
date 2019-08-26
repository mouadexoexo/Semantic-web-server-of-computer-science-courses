package com.javaschedule.dao;

import java.util.Collection;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.util.FileManager;

import com.javaschedule.beans.EtudiantBean;
import com.javaschedule.beans.EtudiantFiliereCursusBean;
import com.javaschedule.main.MainClass;

public class EtudiantDao {
public static Collection<EtudiantFiliereCursusBean> getAllRecords(){
		
	Collection<EtudiantFiliereCursusBean> list = new ArrayList<EtudiantFiliereCursusBean>();
		
		FileManager.get().addLocatorClassLoader(MainClass.class.getClassLoader());
		Model model = FileManager.get().loadModel("C:\\Users\\DEAR-JOE\\eclipse-workspace\\1_0_0_Project_Web_Semantique\\Ontologie_DI.owl");
		
		String querySelect ="prefix : <http://www.fs.uit.ac.ma/ontologies/2019/UIT/DI#>" +  
				"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + 
							"SELECT * WHERE {" +
							"?Etudiant :id ?id ."+
							"?Etudiant :nom ?nom ."+
							"?Etudiant :prenom ?prenom ."+
							"?Etudiant :cin ?cin ."+
							"?Etudiant :tel ?tel ."+
							"?Etudiant :adresse ?adresse ."+
							"?Etudiant :email ?email ."+
							"?Etudiant :departement ?departement ."+
							"?Etudiant :sexe ?sexe ."+
							"?Etudiant :cne ?cne ."+
							"?Etudiant :apogee ?apogee ."+
							"?Etudiant :Inscrit_Dans ?filiere ."+
							"?filiere :libelle_filiere ?libelle_filiere ."+
							"?filiere :Appartient ?cursus ." +
							"?cursus :libelle_cursus ?libelle_cursus ." +

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
				    String cne= soln.getLiteral("cne").getString();
				    String apogee= soln.getLiteral("apogee").getString();
				    String filiere = soln.getLiteral("libelle_filiere").getString();
				    String cursus = soln.getLiteral("libelle_cursus").getString();
					
				    EtudiantBean etudiant = new EtudiantBean(id, nom, prenom, cin, tel, adresse, email, departement, sexe, cne, apogee);
					EtudiantFiliereCursusBean efc = new EtudiantFiliereCursusBean(etudiant, filiere, cursus);
				    
					list.add(efc);
				}
		}finally {
			qexec.close();
		}
		return list;
	}
}
