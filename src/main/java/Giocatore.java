import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "giocatori_table")
public class Giocatore extends TimeStampEntity{

    @Id
    private String codiceFiscale;

    @Column
    private String nome;

    @Column
    private String cognome;

    @Column
    private String telefono;

    @Column
    private int età;

    @OneToMany(mappedBy = "giocatore")
    private List<Membro> squadre;

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }
}
