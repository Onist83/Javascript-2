package projetfinal.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetfinal.demo.model.Emprunt;
import projetfinal.demo.service.EmpruntService;
import projetfinal.demo.service.LivreService;
import projetfinal.demo.service.MembreService;

import java.util.List;

@RestController
@RequestMapping("/emprunts")
public class EmpruntController {

    private final EmpruntService empruntService;

    @Autowired
    private LivreService livreService;
    @Autowired
    private MembreService membreService;


    public EmpruntController(EmpruntService empruntService) {
        this.empruntService = empruntService;
    }

    //    Recuperation
    @GetMapping("/")
    public List<Emprunt> getEmpruntAll() {
        return empruntService.getListemprunts();
//    Methode qui suit pour MVC
//    public String getEmprunt(Model model) {
//        model.addAttribute("listEmprunts", empruntService.getListemprunts());
//        return "emprunt/";
    }

    //    Recuperation par ID
    @GetMapping("/{id}")
    public Emprunt getEmpruntById(
            @PathVariable Long id
    ) throws IllegalAccessException {
        return empruntService.getEmpruntById(id);
    }

//    Emprunts en cours
    @GetMapping("/en-cours")
    public List<Emprunt> getEnCoursDEmprunt(){
        return empruntService.getEnCoursDEmprunt();
    }

//    Emprunts en retard
    @GetMapping("/en-retard")
    public List<Emprunt> getEnRetard(){
        return empruntService.getEnRetard();
    }
//   Emprunts par un membre
}
