package projetfinal.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetfinal.demo.model.Livre;
import projetfinal.demo.service.EmpruntService;
import projetfinal.demo.service.LivreService;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {

    private LivreService livreService = null;

    @Autowired
    private EmpruntService empruntService;
    @Autowired
    private MembreController membreService;

    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    //    Recuperation de tout les livres
    @GetMapping("/")
    public List<Livre> getLivreAll() {
        return livreService.getListlivres();
//        Methode qui suit c'est pour MVC
//    public String getLivre(Model model) {
//        model.addAttribute("listLivres", livreService.getListlivres());
//        return "livre/";
    }

    //    Recuperation par ID
    @GetMapping("/{id}")
    public Livre getLivreById(
            @PathVariable Long id
    ) {
        return livreService.getLivreById(id);
    }

    //    Livres disponibles
    @GetMapping("/disponible")
    public List<Livre> getDisponibleLivres(){
        return livreService.getDisponibleLivres();
    }

    //    Recherche par catégorie
    @GetMapping("/categorie/{categorie}")
    public List<Livre> getRechercheParCategorie(@PathVariable String categorie) {
        return livreService.getRechercheParCategorie(categorie);
    }
}

