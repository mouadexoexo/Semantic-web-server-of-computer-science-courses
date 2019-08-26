package com.javaschedule.main;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.sys.JenaSystem;
import org.apache.jena.util.FileManager;
import org.apache.log4j.BasicConfigurator;

public class MainClass {
	
	public MainClass(int stuffId) {
		super();
	}

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom = sparqlTest();
		
	}*/
	
	
	public String sparqlTest()
	{
		JenaSystem.init();

		FileManager.get().addLocatorClassLoader(MainClass.class.getClassLoader());
		Model model = FileManager.get().loadModel("C:\\Users\\DEAR-JOE\\eclipse-workspace\\1_0_0_Project_Web_Semantique\\Ontologie_DI.owl");
		
		//Exemple Requete Select
		String querySelect ="prefix : <http://www.semanticweb.org/dear-joe/ontologies/2019/5/professor#>" +  
				"prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" + 
				"prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> " + 
							"SELECT * WHERE {" +
							"?Professor :id ?id ."+
							"?Professor :nom ?nom ."+
							"?Professor :prenom ?prenom ."+
							"?Professor :email ?email ."+
							"?Professor :password ?password ."+
							"}";
				
		
					Query query = QueryFactory.create(querySelect);
					QueryExecution qexec = QueryExecutionFactory.create(query, model);
					try {
							ResultSet results = qexec.execSelect();
							while (results.hasNext()) {
								QuerySolution soln = results.nextSolution();
								int id = soln.getLiteral("id").getInt();
								String nom = soln.getLiteral("nom").getString();
							    String prenom = soln.getLiteral("prenom").getString();
							    String email = soln.getLiteral("email").getString();
							    String password = soln.getLiteral("password").getString();
							}
					}finally {
						qexec.close();
					}
			BasicConfigurator.configure();
			return null;
			
	}
}
