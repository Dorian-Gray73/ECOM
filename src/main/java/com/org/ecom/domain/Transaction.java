package com.org.ecom.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.org.ecom.domain.enumeration.EtatProduit;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Transaction.
 */
@Entity
@Table(name = "transaction")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "transaction_id")
    private Long transactionID;

    @Column(name = "utilisateur_id")
    private Long utilisateurID;

    @Enumerated(EnumType.STRING)
    @Column(name = "etat")
    private EtatProduit etat;

    @Column(name = "date")
    private LocalDate date;

    @OneToMany(mappedBy = "transaction")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "caracteristiqueID", "transaction" }, allowSetters = true)
    private Set<LigneTransaction> ligneTransactions = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties(value = { "transactions" }, allowSetters = true)
    private Utilisateur utilisateur;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Transaction id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransactionID() {
        return this.transactionID;
    }

    public Transaction transactionID(Long transactionID) {
        this.setTransactionID(transactionID);
        return this;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public Long getUtilisateurID() {
        return this.utilisateurID;
    }

    public Transaction utilisateurID(Long utilisateurID) {
        this.setUtilisateurID(utilisateurID);
        return this;
    }

    public void setUtilisateurID(Long utilisateurID) {
        this.utilisateurID = utilisateurID;
    }

    public EtatProduit getEtat() {
        return this.etat;
    }

    public Transaction etat(EtatProduit etat) {
        this.setEtat(etat);
        return this;
    }

    public void setEtat(EtatProduit etat) {
        this.etat = etat;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public Transaction date(LocalDate date) {
        this.setDate(date);
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<LigneTransaction> getLigneTransactions() {
        return this.ligneTransactions;
    }

    public void setLigneTransactions(Set<LigneTransaction> ligneTransactions) {
        if (this.ligneTransactions != null) {
            this.ligneTransactions.forEach(i -> i.setTransaction(null));
        }
        if (ligneTransactions != null) {
            ligneTransactions.forEach(i -> i.setTransaction(this));
        }
        this.ligneTransactions = ligneTransactions;
    }

    public Transaction ligneTransactions(Set<LigneTransaction> ligneTransactions) {
        this.setLigneTransactions(ligneTransactions);
        return this;
    }

    public Transaction addLigneTransaction(LigneTransaction ligneTransaction) {
        this.ligneTransactions.add(ligneTransaction);
        ligneTransaction.setTransaction(this);
        return this;
    }

    public Transaction removeLigneTransaction(LigneTransaction ligneTransaction) {
        this.ligneTransactions.remove(ligneTransaction);
        ligneTransaction.setTransaction(null);
        return this;
    }

    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Transaction utilisateur(Utilisateur utilisateur) {
        this.setUtilisateur(utilisateur);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Transaction)) {
            return false;
        }
        return id != null && id.equals(((Transaction) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Transaction{" +
            "id=" + getId() +
            ", transactionID=" + getTransactionID() +
            ", utilisateurID=" + getUtilisateurID() +
            ", etat='" + getEtat() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }
}
