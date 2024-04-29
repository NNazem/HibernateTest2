import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");


        Giocatore giocatore = new Giocatore();
        giocatore.setDataInserimento(new Date());
        giocatore.setDataUltimaModifica(new Date());
        giocatore.setCodiceFiscale("LTRMRTZ20202020");
        giocatore.setNome("Lautaro");
        giocatore.setCognome("Martinez");
        giocatore.setEtà(27);
        giocatore.setTelefono("202020202020");

        Membro membro = new Membro();
        membro.setDataInserimento(new Date());
        membro.setDataUltimaModifica(new Date());
        membro.setGiocatore(giocatore);
        membro.setDataInizio(new Date());
        membro.setDataFine(new Date());

        Squadra squadra = new Squadra();
        squadra.setDataInserimento(new Date());
        squadra.setDataUltimaModifica(new Date());
        squadra.setNome("Inter");
        squadra.setCittà("Milano");
        squadra.setStadio("Giuseppe Meazza");

        membro.setSquadra(squadra);
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(giocatore);
        entityManager.persist(squadra);
        entityManager.persist(membro);

        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}