package sn.isi.Produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.Produit.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
