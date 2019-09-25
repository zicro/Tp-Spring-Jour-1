package ma.jit.produitSpring.dao;

import java.util.List;

import ma.jit.produitSpring.domaine.Produit;

public interface IProduitDao {
public boolean addProduit(Produit produit);
public boolean deleteProduit(Produit produit);
public boolean updateProduit(Produit produit);
public List<Produit> getAll();
public Produit getProduitByRef(int ref);

}
