package projetfinal.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "emprunt")
public class Emprunt {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "date_emprunt")
    private LocalDate dateEmprunt;

    @Column(name = "date_retour_prevue")
    private LocalDate dateRetourPrevue;

    @Column(name = "date_retour_effective")
    private LocalDate dateRetourEffective;

    @ManyToOne
    @JoinColumn(name = "membre_id")
    private Membre membre;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    private Livre livre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public LocalDate getDateRetourPrevue() {
        return dateRetourPrevue;
    }

    public void setDateRetourPrevue(LocalDate dateRetourPrevue) {
        this.dateRetourPrevue = dateRetourPrevue;
    }

    public LocalDate getDateRetourEffective() {
        return dateRetourEffective;
    }

    public void setDateRetourEffective(LocalDate dateRetourEffective) {
        this.dateRetourEffective = dateRetourEffective;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    //    Constructor vide
    public Emprunt() {

    }

    //    Constructor sans ID
    public Emprunt(LocalDate dateEmprunt, LocalDate dateRetourPrevue, LocalDate dateRetourEffective, Membre membre) {
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
        this.dateRetourEffective = dateRetourEffective;
        this.membre = membre;
    }

    //    Constructor avec ID
    public Emprunt(Long id, LocalDate dateEmprunt, LocalDate dateRetourPrevue, LocalDate dateRetourEffective, Membre membre) {
        this.id = id;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourPrevue = dateRetourPrevue;
        this.dateRetourEffective = dateRetourEffective;
        this.membre = membre;
    }
}
