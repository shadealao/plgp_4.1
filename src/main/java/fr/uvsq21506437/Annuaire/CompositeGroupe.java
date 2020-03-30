package fr.uvsq21506437.Annuaire;

import java.util.ArrayList;

public class CompositeGroupe implements Groupe {
	
	private ArrayList<Groupe> grpPersonnel = new ArrayList<Groupe>();
	
	public CompositeGroupe() {
		super();
	}

	public void add(Groupe p) {
		grpPersonnel.add(p);
	}
	
	public void remove(Groupe p) {
		grpPersonnel.remove(p);
	}
	public void affiche() {
		for(Groupe grp : grpPersonnel) {
			grp.affiche();
		}
		
	}
	

}
