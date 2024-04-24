import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "squadre_table")
public class Squadra {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String nome;

    @Column
    private String stadio;

    @Column
    private String città;

    @OneToMany(mappedBy = "squadra")
    private List<Membro> giocatori;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStadio() {
        return stadio;
    }

    public void setStadio(String stadio) {
        this.stadio = stadio;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }
}
