package sn.isi.Produit.dao;

import org.springframework.stereotype.Service;
import sn.isi.Produit.entities.Product;

import java.util.List;

public interface BDProduct {
    public void sauverProduct(Product product);
    public List<Product> listerProducts();
    public Product rechercherProduct(Integer codeprod);
}
