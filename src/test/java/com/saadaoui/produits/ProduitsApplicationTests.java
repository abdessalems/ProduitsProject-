package com.saadaoui.produits;

import com.saadaoui.produits.dto.ProduitDTO;
import com.saadaoui.produits.entities.Categorie;
import com.saadaoui.produits.entities.Produit;
import com.saadaoui.produits.repos.ProduitRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@SpringBootTest
class ProduitsApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;

    @Test
    public void testCreateProduit() {
        Produit prod = new Produit("Pc mac del", 40000, new Date(1994, 05, 19) );
        produitRepository.save(prod);
        Produit P = new Produit("iphone 15", 70000, new Date(1995, 05, 19) );
        produitRepository.save(P);

        Produit pp = new Produit("Pc Gaming", 90000,new Date(1998, 05, 19) );
        produitRepository.save(pp);
        Produit ppp = new Produit("NOKIA 10", 40040,new Date(2023, 05, 19) );
        produitRepository.save(ppp);

    }


    @Test
    public void testDeleteProduit() {
        produitRepository.deleteById(1L);
    }


    @Test
    public void testFindByNom() {
        List<Produit> p = produitRepository.findByNomProduitContains("P");
        System.out.println(p);
    }

    @Test
    public void findByNomPrix() {
        List<Produit> p = produitRepository.findByNomPrix("iphone", 100.0);
        System.out.println(p);
    }

    public void findByNomPrixx() {
        List<Produit> p = produitRepository.findByNomPrix("iphone", 100.0);
        System.out.println(p);
    }

    @Test
    public void testfindByCategorie() {
        Categorie cat = new Categorie();
        cat.setIdCat(1L);
        List<Produit> prods = produitRepository.findByCategorie(cat);
        for (Produit p : prods) {
            System.out.println(p);
        }
    }


    @Test
    public void testfindByCategorieById() {

        List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
        for (Produit p : prods) {
            System.out.println(p);
        }
    }


    @Test
    public void findByOrderByNomProduitAsc() {

        List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
        for (Produit p : prods) {
            System.out.println(p);
        }
    }


}
