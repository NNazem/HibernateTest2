import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public class TimeStampEntity {

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInserimento;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltimaModifica;

    public TimeStampEntity() {
    }

    public TimeStampEntity(Date dataInserimento, Date dataUltimaModifica) {
        this.dataInserimento = dataInserimento;
        this.dataUltimaModifica = dataUltimaModifica;
    }

    public Date getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(Date dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public Date getDataUltimaModifica() {
        return dataUltimaModifica;
    }

    public void setDataUltimaModifica(Date dataUltimaModifica) {
        this.dataUltimaModifica = dataUltimaModifica;
    }
}
