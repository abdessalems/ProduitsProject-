package com.saadaoui.produits.repos;

import com.saadaoui.produits.entities.Categorie;
import com.saadaoui.produits.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
