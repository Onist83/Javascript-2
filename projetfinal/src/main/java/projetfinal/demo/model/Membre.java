package projetfinal.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "membre")
public class Membre {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "date_inscription")
    private LocalDate dateInscription;

    @Column(name = "actif")
    private Boolean actif;

    @OneToMany(mappedBy = "membre", cascade = CascadeType.ALL)
    private List<Emprunt> emprunts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    //    Constructor vide
    public Membre() {

    }

    //    Constructor sans ID
    public Membre(String nom, String prenom, String email, String telephone, LocalDate dateInscription, Boolean actif) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.dateInscription = dateInscription;
        this.actif = actif;
    }

    //    Constructor avec ID
    public Membre(Long id, String nom, String prenom, String email, String telephone, LocalDate dateInscription, Boolean actif) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.dateInscription = dateInscription;
        this.actif = actif;
    }
}
