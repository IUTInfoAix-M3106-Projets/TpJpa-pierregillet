package fr.univ_amu.iut.beans;

import javax.persistence.*;

import java.util.Collection;

@Entity
public class Module{
    @Id
    private String code;

    private String libelle;

    @Column(name = "H_COURS_PREV")
    private int hCoursPrev;
    @Column (name = "H_COURS_REA")
    private int hCoursRea;
    @Column (name = "H_TP_PREV")
    private int hTpPrev;
    @Column (name = "H_TP_REA")
    private int hTpRea;
    private String discipline;
    @Column (name = "COEFF_TEST")
    private int coefTest;
    @Column (name = "COEFF_CC")
    private int coefCc;

    @ManyToOne
    @JoinColumn (name = "RESP")
    private Prof responsable;
    @ManyToOne
    @JoinColumn (name = "CODEPERE")
    private Module pere;
    @OneToMany (targetEntity = Prof.class, mappedBy = "matSpec")
    private Collection<Prof> specialistes;

    @ManyToMany
            (mappedBy="NOTATION")
    private Collection<Etudiant> etudiants;

    public Module() {
    }

    public String getCode() {
        return code;
    }

    public int getCoefCc() {
        return coefCc;
    }

    public int getCoefTest() {
        return coefTest;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int gethCoursPrev() {
        return hCoursPrev;
    }

    public int gethCoursRea() {
        return hCoursRea;
    }

    public int gethTpPrev() {
        return hTpPrev;
    }

    public int gethTpRea() {
        return hTpRea;
    }

    public String getLibelle() {
        return libelle;
    }

    public Module getPere() {
        return pere;
    }

    public Prof getResponsable() {
        return responsable;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCoefCc(int coefCc) {
        this.coefCc = coefCc;
    }

    public void setCoefTest(int coeffTest) {
        this.coefTest = coeffTest;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void sethCoursPrev(int hCoursPrev) {
        this.hCoursPrev = hCoursPrev;
    }

    public void sethCoursRea(int hCoursRea) {
        this.hCoursRea = hCoursRea;
    }

    public void sethTpPrev(int hTpPrev) {
        this.hTpPrev = hTpPrev;
    }

    public void sethTpRea(int hTpRea) {
        this.hTpRea = hTpRea;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPere(Module pere) {
        this.pere = pere;
    }

    public void setResponsable(Prof responsable) {
        this.responsable = responsable;
    }

    public Collection<Prof> getSpecialistes() {
        return specialistes;
    }

    @Override
    public String toString() {
        return "Module [" + (code != null ? "code=" + code + ", " : "")
                + (libelle != null ? "libelle=" + libelle + ", " : "")
                + "hCoursPrev=" + hCoursPrev + ", hCoursRea=" + hCoursRea
                + ", hTpPrev=" + hTpPrev + ", hTpRea=" + hTpRea + ", "
                + (discipline != null ? "discipline=" + discipline + ", " : "")
                + "coeffTest=" + coefTest + ", coefCc=" + coefCc + ", "
                + (responsable != null ? "responsable=" + responsable.getNomProf() + ", " : "")
                + (pere != null ? "pere=" + pere.getCode() : "") + "]";
    }
}
