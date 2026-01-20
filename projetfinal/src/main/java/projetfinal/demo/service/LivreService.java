package projetfinal.demo.service;

import org.springframework.stereotype.Service;
import projetfinal.demo.model.Livre;
import projetfinal.demo.repository.LivreRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivreService {
    private LivreRepository livreRepository;
    private List<Livre> listLivres = new ArrayList<>();

    public LivreService(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    //    Livre par ID
    public Livre getLivreById(Long id) throws IllegalCallerException {
        try {
            return livreRepository.findById(id)
                    .orElseThrow(
                            () -> new IllegalAccessException("Le livre avec l'Id " + id + " n'existe pas")
                    );
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    //    Liste des livres
    public List<Livre> getListlivres() {
        return this.livreRepository.findAll();
    }

    //    Livres disponibles
    public List<Livre> getDisponibleLivres() {
        List<Livre> listLivres = livreRepository.findAll();
        //Type de la variable/nom de la variable = montre tout les livres
        List<Livre> livresDisponible = new ArrayList<>();
//      Creation liste vide pour stocker dedans
        for (Livre livre : listLivres) {
//             Classe puis : son objet
            if (livre.getExemplairesDisponibles() > 0) {
//          Si livre.Attribut que l'on souhaite > 0
                livresDisponible.add(livre);
//          Je l'ajoute à ma liste vide
            }
        }
        return livresDisponible;
//        return ma liste
    }

    //      Recherche par categorie
    public List<Livre> getRechercheParCategorie(String categorie) {
//        System.out.println(categorie); print la categorie recherche
        List<Livre> listLivres = livreRepository.findAll();
        List<Livre> livresRechercher = new ArrayList<>();
        for (Livre livre : listLivres) {
//            System.out.println(livre.getCategorie()); print toutes les categories
            if (livre.getCategorie().equals(categorie)) {
//                System.out.println("ajout"); print l'ajout
                livresRechercher.add(livre);
            }
        }
        return livresRechercher;
    }
}
