package com.saadaoui.produits;

import com.saadaoui.produits.entities.Categorie;
import com.saadaoui.produits.entities.Produit;
import com.saadaoui.produits.repos.ProduitRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@Data
@SpringBootTest
class ProduitsApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;
    @Test
    public void testCreateProduit() {
        Produit prod = new Produit("Pc del",40000);
        produitRepository.save(prod);
            Produit P = new Produit("smsng",15000);
            produitRepository.save(P);

        Produit pp = new Produit("Pc mac",45000);
        produitRepository.save(pp);
        Produit ppp = new Produit("nokia",16000);
        produitRepository.save(ppp);

    }

    @Test
    public void testFindProduit()
    {
        Produit p = produitRepository.findById(1L).get();
        System.out.println(p);
    }
    @Test
    public void testUpdateProduit()
    {
        Produit p = produitRepository.findById(1L).get();
        p.setPrixProduit(1000.0);
        produitRepository.save(p);
    }
    @Test
    public void testDeleteProduit()
    {
        produitRepository.deleteById(1L);;
    }

    @Test
    public void testListerTousProduits()
    {
        List<Produit> prods = produitRepository.findAll();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }

    @Test
    public void testFindByNom()
    {
        List<Produit> p = produitRepository.findByNomProduitContains("P");
        System.out.println(p);
    }

    @Test
    public void findByNomPrix()
    {
        List<Produit> p = produitRepository.findByNomPrix("iphone",100.0);
        System.out.println(p);
    }

    public void findByNomPrixx()
    {
        List<Produit> p = produitRepository.findByNomPrix("iphone",100.0);
        System.out.println(p);
    }

    @Test
    public void testfindByCategorie()
    {
        Categorie cat = new Categorie();
        cat.setIdCat(1L);
        List<Produit> prods = produitRepository.findByCategorie(cat);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }


    @Test
    public void testfindByCategorieById()
    {

        List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }



    @Test
    public void findByOrderByNomProduitAsc()
    {

        List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
        for (Produit p : prods)
        {
            System.out.println(p);
        }
    }









}
