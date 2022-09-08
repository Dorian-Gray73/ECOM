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

    @Column(name = "lien_image")
    private String lienImage;

    @ManyToOne
    @JsonIgnoreProperties(value = { "ligneTransaction", "caracteristiqueIDS", "produit" }, allowSetters = true)
    private Caracteristique produitID;

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

    public Caracteristique getProduitID() {
        return this.produitID;
    }

    public void setProduitID(Caracteristique caracteristique) {
        this.produitID = caracteristique;
    }

    public Image produitID(Caracteristique caracteristique) {
        this.setProduitID(caracteristique);
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
            ", lienImage='" + getLienImage() + "'" +
            "}";
    }
}
