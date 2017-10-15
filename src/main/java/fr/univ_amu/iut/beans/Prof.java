package fr.univ_amu.iut.beans;

import javax.persistence.*;

@Entity
public class Prof{
    @Id
    @GeneratedValue
    @Column (name = "NUM_PROF")
    private int numProf;
    @Column (name = "NOM_PROF")
    private String nomProf;
    @Column (name = "PRENOM_PROF")
    private String prenomProf;
    @Column (name = "ADR_PROF")
    private String adrProf;
    @Column (name = "CP_PROF")
    private String cpProf;
    @Column (name = "VILLE_PROF")
    private String villeProf;
    @ManyToOne
    @JoinColumn (name = "MAT_SPEC")
    private Module matSpec;

    public Prof() {
    }

    public String getAdrProf() {
        return adrProf;
    }

    public String getCpProf() {
        return cpProf;
    }

    public Module getMatSpec() {
        return matSpec;
    }

    public String getNomProf() {
        return nomProf;
    }

    public int getNumProf() {
        return numProf;
    }

    public String getPrenomProf() {
        return prenomProf;
    }

    public String getVilleProf() {
        return villeProf;
    }

    public void setAdrProf(String adrProf) {
        this.adrProf = adrProf;
    }

    public void setCpProf(String cpProf) {
        this.cpProf = cpProf;
    }

    public void setMatSpec(Module matSpec) {
        this.matSpec = matSpec;
    }

    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

    public void setNumProf(int numProf) {
        this.numProf = numProf;
    }

    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }

    public void setVilleProf(String villeProf) {
        this.villeProf = villeProf;
    }

    @Override
    public String toString() {
        return "Prof [numProf=" + numProf + ", "
                + (nomProf != null ? "nomProf=" + nomProf + ", " : "")
                + (prenomProf != null ? "prenomProf=" + prenomProf + ", " : "")
                + (adrProf != null ? "adrProf=" + adrProf + ", " : "")
                + (cpProf != null ? "cpProf=" + cpProf + ", " : "")
                + (villeProf != null ? "villeProf=" + villeProf + ", " : "")
                + (matSpec != null ? "matSpec=" + matSpec.getCode() : "") + "]";
    }
}
