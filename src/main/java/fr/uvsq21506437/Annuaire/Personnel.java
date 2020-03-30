package fr.uvsq21506437.Annuaire;

import java.time.LocalDate;
import java.util.HashMap;

public final class Personnel {
	private final String nom;
	private final String prenom;
	private final String fonction;
	private final LocalDate birth;
	private HashMap<String, String > telephones = new HashMap<String, String>();
	
	public static class  Builder {
		private final String nom;
		private final String prenom;
		private String fonction;
		private LocalDate birth;
		private HashMap<String, String > telephones = new HashMap<String, String>();
		
		public Builder(String nom, String prenom) {
			this.nom = nom;
			this.prenom = prenom;
		}
		
		public Builder Fonction(String fonction) {
			this.fonction = fonction;
			return this;
		}
		
		public Builder Birth(LocalDate birth) {
			this.birth = birth;
			return this;
		}
		
		public Builder Tel(HashMap<String, String >  telephones) {
			this.telephones = telephones;
			return this;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	
	public Personnel(Builder builder) {
		this.nom = builder.nom;
		this.prenom = builder.prenom;
		this.fonction = builder.fonction;
		this.birth = builder.birth;
		this.telephones = builder.telephones;
	}
	
	public void getInfo() {
		String info = "Nom : "+ this.nom +"\tPérnom: "+this.prenom + "\tFonctin : "+ this.fonction + "\tAnniversaire : "+ this.birth + "\n";
		String tel = "Contacts : \n";
		if (! telephones.isEmpty()) {
			for ( String key : telephones.keySet() ) {
				tel += "\tnom : "+ key + " N° : "+ telephones.get(key) + "\n";
			}
		}
		info += tel;
		System.out.println(info);
		
	}
}

