import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "membri_table")
public class Membro {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInizio;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFine;

    @ManyToOne
    @JoinColumn(name = "codiceFiscale")
    private Giocatore giocatore;

    @ManyToOne
    @JoinColumn(name = "squadra_id")
    private Squadra squadra;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Giocatore getGiocatore() {
        return giocatore;
    }

    public void setGiocatore(Giocatore giocatore) {
        this.giocatore = giocatore;
    }

    public Squadra getSquadra() {
        return squadra;
    }

    public void setSquadra(Squadra squadra) {
        this.squadra = squadra;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }
}
