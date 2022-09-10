package com.org.ecom.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Caracteristique.
 */
@Entity
@Table(name = "caracteristique")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Caracteristique implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "couleur")
    private String couleur;

    @Column(name = "quantite")
    private Integer quantite;

    @Column(name = "lien_image")
    private String lienImage;

    @JsonIgnoreProperties(value = { "caracteristique", "transaction" }, allowSetters = true)
    @OneToOne
    @JoinColumn(unique = true)
    private LigneTransaction ligneTransaction;

    @ManyToOne
    @JsonIgnoreProperties(value = { "caracteristiques" }, allowSetters = true)
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

    public String getLienImage() {
        return this.lienImage;
    }

    public Caracteristique lienImage(String lienImage) {
        this.setLienImage(lienImage);
        return this;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
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
            ", couleur='" + getCouleur() + "'" +
            ", quantite=" + getQuantite() +
            ", lienImage='" + getLienImage() + "'" +
            "}";
    }
}
