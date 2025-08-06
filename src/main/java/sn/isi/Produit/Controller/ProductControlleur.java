package sn.isi.Produit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import sn.isi.Produit.dao.BDProduct;
import sn.isi.Produit.entities.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ctProduct")
public class ProductControlleur {
    @Autowired
    private BDProduct bdp;

    @GetMapping("/")
    public String redirectToListerProducts() {
        return "redirect:/ctProduct/listerproducts";
    }

    @GetMapping("/ajout")
    public String presenteFormulaireAjout(Model modele)
    {
        Product product = new Product();
        modele.addAttribute("product",product);
        return "ajoutproduct";

    }

    @PostMapping("/enregistre")
    public String creerProduct(@Valid @ModelAttribute("product") Product product, BindingResult resultat, Model modele)
    {
        if (resultat.hasErrors()) {
            return "ajoutproduct";
        }

        bdp.sauverProduct(product);

        return "redirect:/ctProduct/listerproducts";


    }

    @GetMapping("/listerproducts")
    public String afficherProducts(Model modele)
    {
        List<Product> listeprod = bdp.listerProducts();
        modele.addAttribute("listeprod",listeprod);
        return "listeproducts";
    }
}
