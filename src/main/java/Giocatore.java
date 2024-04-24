import jakarta.persistence.*;

@Entity
@Table(name = "giocatori_table")
public class Giocatore {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;


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
}
