import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "membri_table")
@IdClass(MembroId.class)
public class Membro extends TimeStampEntity{

    @ManyToOne
    @JoinColumn(name = "codiceFiscale")
    @Id
    private Giocatore giocatore;

    @ManyToOne
    @JoinColumn(name = "squadra_id")
    @Id
    private Squadra squadra;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInizio;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFine;



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
