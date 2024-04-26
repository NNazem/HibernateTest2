import java.io.Serial;
import java.io.Serializable;

public class MembroId implements Serializable {
    private Giocatore giocatore;
    private Squadra squadra;

    public MembroId() {
    }

    public MembroId(Giocatore giocatore, Squadra squadra) {
        this.giocatore = giocatore;
        this.squadra = squadra;
    }
}
