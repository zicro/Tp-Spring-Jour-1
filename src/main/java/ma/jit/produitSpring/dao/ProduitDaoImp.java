package ma.jit.produitSpring.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import ma.jit.produitSpring.domaine.Produit;
@Component
@Primary
public class ProduitDaoImp implements IProduitDao {
  List<Produit> listProduits = new ArrayList<Produit>();
  
	public ProduitDaoImp() {
		
		Produit P1 = new Produit(0, 50, 700, new Date("05/08/2020"));
	listProduits.add(P1);
}

	public boolean addProduit(Produit produit) {
		listProduits.add(produit);
		return false;
	}

	public boolean deleteProduit(Produit produit) {
		listProduits.remove(produit);
		return false;
	}

	public boolean updateProduit(Produit produit) {
	
		return false;
	}

	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return listProduits;
	}

	public Produit getProduitByRef(int ref) {
		for(int i=0; i<listProduits.size(); i++) {
			if(listProduits.get(i).getRef() == ref) 
				return listProduits.get(i);
		}
		return null;
	}

}
