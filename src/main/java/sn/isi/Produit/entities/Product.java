package sn.isi.Produit.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Products")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer codeprod;
    @Column(length=50)
    private String nomprod;
    private Integer prix;

    public Product() {

    }

    public Integer getCodeprod() {
        return codeprod;
    }

    public void setCodeprod(Integer codeprod) {
        this.codeprod = codeprod;
    }

    public String getNomprod() {
        return nomprod;
    }

    public void setNomprod(String nomprod) {
        this.nomprod = nomprod;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }
}
