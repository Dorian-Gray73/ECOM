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
@SuppressWarnings("common-java:DuplicatedBlocks")
public class LigneTransaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "transaction_id")
    private Long transactionID;

    @Column(name = "caracteristique_id")
    private Long caracteristiqueID;

    @Column(name = "quantite")
    private Integer quantite;

    @Column(name = "prix_unitaire")
    private Float prixUnitaire;

    @JsonIgnoreProperties(value = { "caracteristiqueID", "images", "produit" }, allowSetters = true)
    @OneToOne(mappedBy = "caracteristiqueID")
    private Caracteristique caracteristiqueID;

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

    public Long getTransactionID() {
        return this.transactionID;
    }

    public LigneTransaction transactionID(Long transactionID) {
        this.setTransactionID(transactionID);
        return this;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public Long getCaracteristiqueID() {
        return this.caracteristiqueID;
    }

    public LigneTransaction caracteristiqueID(Long caracteristiqueID) {
        this.setCaracteristiqueID(caracteristiqueID);
        return this;
    }

    public void setCaracteristiqueID(Long caracteristiqueID) {
        this.caracteristiqueID = caracteristiqueID;
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

    public Caracteristique getCaracteristiqueID() {
        return this.caracteristiqueID;
    }

    public void setCaracteristiqueID(Caracteristique caracteristique) {
        if (this.caracteristiqueID != null) {
            this.caracteristiqueID.setCaracteristiqueID(null);
        }
        if (caracteristique != null) {
            caracteristique.setCaracteristiqueID(this);
        }
        this.caracteristiqueID = caracteristique;
    }

    public LigneTransaction caracteristiqueID(Caracteristique caracteristique) {
        this.setCaracteristiqueID(caracteristique);
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
            ", transactionID=" + getTransactionID() +
            ", caracteristiqueID=" + getCaracteristiqueID() +
            ", quantite=" + getQuantite() +
            ", prixUnitaire=" + getPrixUnitaire() +
            "}";
    }
}
