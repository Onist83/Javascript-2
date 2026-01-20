package projetfinal.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import projetfinal.demo.model.Emprunt;
import projetfinal.demo.repository.EmpruntRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmpruntService {
    private EmpruntRepository empruntRepository;
    private List<Emprunt> listEmprunts = new ArrayList<>();


    public EmpruntService(EmpruntRepository empruntRepository) {
        this.empruntRepository = empruntRepository;
    }

    //    Emprunt par ID
    public Emprunt getEmpruntById(Long id) throws IllegalAccessException {
        return empruntRepository.findById(id)
                .orElseThrow(
                        () -> new IllegalAccessException("L'emprunt avec l'Id " + id + " n'existe pas")
                );
    }

    //    Liste des Emprunts
    public List<Emprunt> getListemprunts() {
        return this.empruntRepository.findAll();
    }


//        Emprunt en cours
    public List<Emprunt> getEnCoursDEmprunt() {
        List<Emprunt> listEmprunts = empruntRepository.findAll();
        List<Emprunt> empruntsEnCours = new ArrayList<>();
        for (Emprunt emprunt : listEmprunts) {
            if (emprunt.getDateRetourEffective() == null) {
                empruntsEnCours.add(emprunt);
            }
        }
        return empruntsEnCours;
    }

    public List<Emprunt> getEnRetard() {
        List<Emprunt> listEmprunts = empruntRepository.findAll();
        List<Emprunt> empruntsEnRetard = new ArrayList<>();
        for (Emprunt emprunt : listEmprunts) {
            if (emprunt.getDateRetourEffective() == null && emprunt.getDateRetourPrevue().isBefore(LocalDate.now())) {
                empruntsEnRetard.add(emprunt);
            }
        }
        return empruntsEnRetard;
    }
}



//        Emprunt en retard
