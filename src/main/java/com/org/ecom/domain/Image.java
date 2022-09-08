package com.org.ecom.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Image.
 */
@Entity
@Table(name = "image")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "produit_id")
    private Long produitID;

    @Column(name = "lien_image")
    private String lienImage;

    @ManyToOne
    @JsonIgnoreProperties(value = { "ligneTransaction", "images", "produit" }, allowSetters = true)
    private Caracteristique caracteristique;

    @ManyToOne
    @JsonIgnoreProperties(value = { "caracteristiques", "images" }, allowSetters = true)
    private Produit produit;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Image id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProduitID() {
        return this.produitID;
    }

    public Image produitID(Long produitID) {
        this.setProduitID(produitID);
        return this;
    }

    public void setProduitID(Long produitID) {
        this.produitID = produitID;
    }

    public String getLienImage() {
        return this.lienImage;
    }

    public Image lienImage(String lienImage) {
        this.setLienImage(lienImage);
        return this;
    }

    public void setLienImage(String lienImage) {
        this.lienImage = lienImage;
    }

    public Caracteristique getCaracteristique() {
        return this.caracteristique;
    }

    public void setCaracteristique(Caracteristique caracteristique) {
        this.caracteristique = caracteristique;
    }

    public Image caracteristique(Caracteristique caracteristique) {
        this.setCaracteristique(caracteristique);
        return this;
    }

    public Produit getProduit() {
        return this.produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Image produit(Produit produit) {
        this.setProduit(produit);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Image)) {
            return false;
        }
        return id != null && id.equals(((Image) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Image{" +
            "id=" + getId() +
            ", produitID=" + getProduitID() +
            ", lienImage='" + getLienImage() + "'" +
            "}";
    }
}
