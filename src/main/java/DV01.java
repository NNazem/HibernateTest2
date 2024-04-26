import jakarta.persistence.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Entity
@Table(name = "DV01_JPA")
public class DV01 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String SUBSTR;

    private String PILLAR;

    private Double DV01PAR;

    public String getSUBSTR() {
        return SUBSTR;
    }

    public void setSUBSTR(String SUBSTR) {
        this.SUBSTR = SUBSTR;
    }

    public String getPILLAR() {
        return PILLAR;
    }

    public void setPILLAR(String PILLAR) {
        this.PILLAR = PILLAR;
    }

    public Double getDV01PAR() {
        return DV01PAR;
    }

    public void setDV01PAR(Double DV01PAR) {
        this.DV01PAR = DV01PAR;
    }

    public static void main(String[] args) {

        try{
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

            String filePath = "C:\\Users\\Nazem\\IdeaProjects\\JDBC-CRUD\\src\\main\\java\\org\\example\\DV01_PAR_CURVE.csv";

            BufferedReader lineReader = new BufferedReader(new FileReader(filePath));

            String lineText = null;

            lineReader.readLine();

            Date inizio = new Date();

            while ((lineText = lineReader.readLine()) != null) {

                String[] parts = lineText.split(";");

                String substr = parts[0];
                String pillar = parts[1];
                Double dv01Par = Double.valueOf(parts[2]);

                DV01 dv01 = new DV01();
                dv01.setSUBSTR(substr);
                dv01.setPILLAR(pillar);
                dv01.setDV01PAR(dv01Par);

                entityManager.persist(dv01);


            }

            entityManager.getTransaction().commit();
            entityManagerFactory.close();

            Date fine = new Date();

            long secondsPassed = TimeUnit.MILLISECONDS.toSeconds(fine.getTime() - inizio.getTime());

            System.out.printf("Inserimento completato in: %d secondi", secondsPassed);



        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
