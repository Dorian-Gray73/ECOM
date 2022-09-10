package com.org.ecom.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A LigneTransaction.
 */
@Entity
@Table(name = "ligne_transaction")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class LigneTransaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "quantite")
    private Integer quantite;

    @Column(name = "prix_unitaire")
    private Float prixUnitaire;

    @JsonIgnoreProperties(value = { "ligneTransaction", "produit" }, allowSetters = true)
    @OneToOne(mappedBy = "ligneTransaction")
    private Caracteristique caracteristique;

    @ManyToOne
    @JsonIgnoreProperties(value = { "ligneTransactions", "utilisateur" }, allowSetters = true)
    private Transaction transaction;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public LigneTransaction id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantite() {
        return this.quantite;
    }

    public LigneTransaction quantite(Integer quantite) {
        this.setQuantite(quantite);
        return this;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Float getPrixUnitaire() {
        return this.prixUnitaire;
    }

    public LigneTransaction prixUnitaire(Float prixUnitaire) {
        this.setPrixUnitaire(prixUnitaire);
        return this;
    }

    public void setPrixUnitaire(Float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Caracteristique getCaracteristique() {
        return this.caracteristique;
    }

    public void setCaracteristique(Caracteristique caracteristique) {
        if (this.caracteristique != null) {
            this.caracteristique.setLigneTransaction(null);
        }
        if (caracteristique != null) {
            caracteristique.setLigneTransaction(this);
        }
        this.caracteristique = caracteristique;
    }

    public LigneTransaction caracteristique(Caracteristique caracteristique) {
        this.setCaracteristique(caracteristique);
        return this;
    }

    public Transaction getTransaction() {
        return this.transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public LigneTransaction transaction(Transaction transaction) {
        this.setTransaction(transaction);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LigneTransaction)) {
            return false;
        }
        return id != null && id.equals(((LigneTransaction) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "LigneTransaction{" +
            "id=" + getId() +
            ", quantite=" + getQuantite() +
            ", prixUnitaire=" + getPrixUnitaire() +
            "}";
    }
}
