package projetfinal.demo.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "livre")
public class Livre {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "titre")
    private String titre;

    @Column(name = "auteur")
    private String auteur;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "annee_publication")
    private int anneePublication;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "exemplaires_total")
    private int exemplairesTotal;

    @Column(name = "exemplaires_disponibles")
    private int exemplairesDisponibles;

    @OneToMany(mappedBy = "livre", cascade = CascadeType.ALL)
    private List<Emprunt> emprunts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getExemplairesTotal() {
        return exemplairesTotal;
    }

    public void setExemplairesTotal(int exemplairesTotal) {
        this.exemplairesTotal = exemplairesTotal;
    }

    public int getExemplairesDisponibles() {
        return exemplairesDisponibles;
    }

    public void setExemplairesDisponibles(int exemplairesDisponibles) {
        this.exemplairesDisponibles = exemplairesDisponibles;
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    //    Constructor vide
    public Livre() {

    }

    //    Constructor sans ID
    public Livre(String titre, String auteur, String isbn, int anneePublication, String categorie, int exemplairesTotal, int exemplairesDisponibles, List<Emprunt> emprunts) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.anneePublication = anneePublication;
        this.categorie = categorie;
        this.exemplairesTotal = exemplairesTotal;
        this.exemplairesDisponibles = exemplairesDisponibles;
        this.emprunts = emprunts;
    }

    //    Constructor avec ID
    public Livre(Long id, String titre, String auteur, String isbn, int anneePublication, String categorie, int exemplairesTotal, int exemplairesDisponibles, List<Emprunt> emprunts) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.anneePublication = anneePublication;
        this.categorie = categorie;
        this.exemplairesTotal = exemplairesTotal;
        this.exemplairesDisponibles = exemplairesDisponibles;
        this.emprunts = emprunts;
    }
}
