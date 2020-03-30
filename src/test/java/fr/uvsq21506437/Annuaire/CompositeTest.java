package fr.uvsq21506437.Annuaire;

import java.time.LocalDate;
import java.util.HashMap;

import junit.framework.TestCase;

public class CompositeTest extends TestCase {
	
	public void testComposite() {
		HashMap<String, String > telephones = new HashMap<String, String>();
    	telephones.put("alaoshade", "0708050999");
    	telephones.put("afolabiaweni", "0708440921");
        Personnel personnel = new Personnel.Builder("ALAO AFOLABI", "Shadé").Fonction("étuidante").Birth(LocalDate.of(1996, 8, 03)).Tel(telephones).build();
        
        
        HashMap<String, String > telephones2 = new HashMap<String, String>();
    	telephones2.put("VideClem", "0715800999");
    	telephones2.put("dinadore", "0708464821");
        Personnel personnel2 = new Personnel.Builder("DURANT", "Julia").Fonction("Commercante").Birth(LocalDate.of(1960, 11, 15)).Tel(telephones2).build();
        
        HashMap<String, String > telephones3 = new HashMap<String, String>();
    	telephones3.put("delatorehelena", "068050949");
    	telephones3.put("MocheMartine", "0701540925");
        Personnel personnel3 = new Personnel.Builder("Yunes", "Rabiu").Fonction("PDG").Birth(LocalDate.of(1978, 4, 21)).Tel(telephones3).build();
        
        
        CompositeGroupe grp = new CompositeGroupe();
        CompositeGroupe grp2 = new CompositeGroupe();
        CompositeGroupe grp3 = new CompositeGroupe();
        
        grp2.add(personnel);
        grp2.add(personnel2);
        grp3.add(personnel3);
        
        grp.add(grp2);
        grp.add(grp3);
        
        grp.affiche();
        
	}
}
