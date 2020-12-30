package sn.sentransfert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import sn.sentransfert.dao.IEmetteur;
import sn.sentransfert.dao.IRecepteur;
import sn.sentransfert.entities.Emetteur;
import sn.sentransfert.entities.Recepteur;

@SpringBootApplication
public class BackgestiontransfertargentApplication implements CommandLineRunner {

//    private final IEmetteur emetteurdao;
//    private final IRecepteur recepteurdao;

    //par défaut Spring datarest n'affiche pas les Id
    // pour afficher les Id on fait
    //private final RepositoryRestConfiguration restConfiguration;

//    public BackgestiontransfertargentApplication(IEmetteur emetteurdao, IRecepteur recepteurdao, RepositoryRestConfiguration restConfiguration) {
//        this.emetteurdao = emetteurdao;
//        this.recepteurdao = recepteurdao;
//        this.restConfiguration = restConfiguration;
//    }

    public static void main(String[] args) {

        SpringApplication.run(BackgestiontransfertargentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //on lui demande d'afficher à chaque fois l'Id
//        restConfiguration.exposeIdsFor(Emetteur.class);
//        Emetteur emetteur = new Emetteur();
//        emetteur.setNom("DIENE");
//        emetteur.setPrenom("Moussa");
//        emetteur.setTel("100");
//        emetteur.setCni("200");

        //emetteurdao.save(emetteur);

//        emetteurdao.findAll().forEach(c -> System.out.println(c.getNom()));
//
//        //on lui demande d'afficher à chaque fois l'Id
//        restConfiguration.exposeIdsFor(Recepteur.class);
//        Recepteur recepteur = new Recepteur();
//        recepteur.setNom("MBOW");
//        recepteur.setPrenom("Cheikh");
//        recepteur.setTel("101");

        //recepteurdao.save(recepteur);

        //recepteurdao.findAll().forEach(c -> System.out.println(c.getNom()));
    }
}
