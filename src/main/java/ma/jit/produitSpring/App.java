package ma.jit.produitSpring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ma.jit.produitSpring.dao.IProduitDao;
import ma.jit.produitSpring.dao.ProduitDaoImp;
import ma.jit.produitSpring.domaine.Produit;

/**
 * Hello world!
 *
 */
public class App {
	

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ProduitDaoImp p2 = context.getBean(ProduitDaoImp.class);
		Produit p = new Produit(1, 50, 500, new Date());
		p2.addProduit(p);
		System.out.println(p2.getAll());
	}
}
