package ma.jit.produitSpring.domaine;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import ma.jit.produitSpring.dao.IProduitDao;

public class Produit {

	private int ref;
	private int quantiteStock;
	private float prix;
	private Date date;
   

	public Produit(int ref, int quantiteStock, float prix, Date date) {
		super();
		this.ref = ref;
		this.quantiteStock = quantiteStock;
		this.prix = prix;
		this.date = date;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

}
