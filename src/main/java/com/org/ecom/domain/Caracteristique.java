package com.org.ecom.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Caracteristique.
 */
@Entity
@Table(name = "caracteristique")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Caracteristique implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "caracteristique_id")
    private Long caracteristiqueID;

    @Column(name = "produit_id")
    private Long produitID;

    @Column(name = "couleur")
    private String couleur;

    @Column(name = "quantite")
    private Integer quantite;

    @JsonIgnoreProperties(value = { "caracteristique", "transaction" }, allowSetters = true)
    @OneToOne
    @JoinColumn(unique = true)
    private LigneTransaction ligneTransaction;

    @OneToMany(mappedBy = "produitID")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "produitID", "produit" }, allowSetters = true)
    private Set<Image> caracteristiqueIDS = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties(value = { "caracteristiques", "images" }, allowSetters = true)
    private Produit produit;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Caracteristique id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCaracteristiqueID() {
        return this.caracteristiqueID;
    }

    public Caracteristique caracteristiqueID(Long caracteristiqueID) {
        this.setCaracteristiqueID(caracteristiqueID);
        return this;
    }

    public void setCaracteristiqueID(Long caracteristiqueID) {
        this.caracteristiqueID = caracteristiqueID;
    }

    public Long getProduitID() {
        return this.produitID;
    }

    public Caracteristique produitID(Long produitID) {
        this.setProduitID(produitID);
        return this;
    }

    public void setProduitID(Long produitID) {
        this.produitID = produitID;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public Caracteristique couleur(String couleur) {
        this.setCouleur(couleur);
        return this;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Integer getQuantite() {
        return this.quantite;
    }

    public Caracteristique quantite(Integer quantite) {
        this.setQuantite(quantite);
        return this;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public LigneTransaction getLigneTransaction() {
        return this.ligneTransaction;
    }

    public void setLigneTransaction(LigneTransaction ligneTransaction) {
        this.ligneTransaction = ligneTransaction;
    }

    public Caracteristique ligneTransaction(LigneTransaction ligneTransaction) {
        this.setLigneTransaction(ligneTransaction);
        return this;
    }

    public Set<Image> getCaracteristiqueIDS() {
        return this.caracteristiqueIDS;
    }

    public void setCaracteristiqueIDS(Set<Image> images) {
        if (this.caracteristiqueIDS != null) {
            this.caracteristiqueIDS.forEach(i -> i.setProduitID(null));
        }
        if (images != null) {
            images.forEach(i -> i.setProduitID(this));
        }
        this.caracteristiqueIDS = images;
    }

    public Caracteristique caracteristiqueIDS(Set<Image> images) {
        this.setCaracteristiqueIDS(images);
        return this;
    }

    public Caracteristique addCaracteristiqueID(Image image) {
        this.caracteristiqueIDS.add(image);
        image.setProduitID(this);
        return this;
    }

    public Caracteristique removeCaracteristiqueID(Image image) {
        this.caracteristiqueIDS.remove(image);
        image.setProduitID(null);
        return this;
    }

    public Produit getProduit() {
        return this.produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Caracteristique produit(Produit produit) {
        this.setProduit(produit);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Caracteristique)) {
            return false;
        }
        return id != null && id.equals(((Caracteristique) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Caracteristique{" +
            "id=" + getId() +
            ", caracteristiqueID=" + getCaracteristiqueID() +
            ", produitID=" + getProduitID() +
            ", couleur='" + getCouleur() + "'" +
            ", quantite=" + getQuantite() +
            "}";
    }
}
