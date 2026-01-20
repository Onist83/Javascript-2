package projetfinal.demo.service;

import org.springframework.stereotype.Service;
import projetfinal.demo.model.Membre;
import projetfinal.demo.repository.MembreRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MembreService {
    private MembreRepository membreRepository;
    private List<Membre> listMembres = new ArrayList<>();

    public MembreService(MembreRepository membreRepository) {
        this.membreRepository = membreRepository;
    }

//    Membre par ID
    public Membre getMembreById(Long id) throws IllegalCallerException {
        try {
            return membreRepository.findById(id)
                    .orElseThrow(
                            () -> new IllegalAccessException("Le membre avec l'Id " + id + " n'existe pas")
                    );
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

//    Liste des membres
    public List<Membre> getListMembres() {
        return this.membreRepository.findAll();
    }

//    Membres actifs
    public List<Membre> getActifMembres() {
        List<Membre> listMembres = membreRepository.findAll();
        List<Membre> membresActif = new ArrayList<>();
        for (Membre membre : listMembres) {
            if (membre.getActif() == true) {
                membresActif.add(membre);
            }
        }
        return membresActif;
    }

}
