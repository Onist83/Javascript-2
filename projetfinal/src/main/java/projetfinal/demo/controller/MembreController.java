package projetfinal.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetfinal.demo.model.Membre;
import projetfinal.demo.service.EmpruntService;
import projetfinal.demo.service.LivreService;
import projetfinal.demo.service.MembreService;

import java.util.List;

@RestController
@RequestMapping("/membres")
public class MembreController {

    private final MembreService membreService;

    @Autowired
    private EmpruntService empruntService;
    @Autowired
    private LivreService livreService;

    public MembreController(MembreService membreService) {
        this.membreService = membreService;
    }

    //    Recuperation de tout les membres
    @GetMapping("/")
    public List<Membre> getMembreAll() {
        return membreService.getListMembres();
    }

    //    Recuperation par ID
    @GetMapping("/{id}")
    public Membre getMembreById(
            @PathVariable Long id
    ) {
        return membreService.getMembreById(id);
    }

//    Membre actif
    @GetMapping("/actif")
    public List<Membre> getActifMembres(){
        return membreService.getActifMembres();
    }
}
