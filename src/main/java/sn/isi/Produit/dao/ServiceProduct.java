package sn.isi.Produit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.isi.Produit.dao.BDProduct;
import sn.isi.Produit.entities.Product;
import sn.isi.Produit.repository.ProductRepository;

import java.util.List;
@Service
public class ServiceProduct implements BDProduct {
    @Autowired
    private ProductRepository prepo;
    @Override
    public void sauverProduct(Product product)
    {
        prepo.save(product);
    }
    @Override
    public List<Product> listerProducts() {
        return prepo.findAll();
    }

    @Override
    public Product rechercherProduct(Integer codeprod)
    {
        Product product=null;
        product=prepo.findById(codeprod).get();
        return product;
    }

}
