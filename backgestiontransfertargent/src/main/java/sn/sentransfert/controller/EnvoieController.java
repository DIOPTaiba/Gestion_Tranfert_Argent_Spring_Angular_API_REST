package sn.sentransfert.controller;

import org.springframework.web.bind.annotation.*;
import sn.sentransfert.dao.IEmetteur;
import sn.sentransfert.dao.IEnvoie;
import sn.sentransfert.dao.IRecepteur;
import sn.sentransfert.entities.Emetteur;
import sn.sentransfert.entities.Envoie;
import sn.sentransfert.entities.Recepteur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/envoie")
public class EnvoieController {

    private final IEnvoie envoiedao;
    private final IEmetteur emetteursao;
    private final IRecepteur recepteurdao;

    public EnvoieController(IEnvoie envoiedao, IEmetteur emetteursao, IRecepteur recepteurdao) {
        this.envoiedao = envoiedao;
        this.emetteursao = emetteursao;
        this.recepteurdao = recepteurdao;
    }

    //pour ajouter
    @PostMapping(value = "/add")
    public Object save(String nomEmetteur, String prenomEmetteur, String telEmetteur, String cniEmetteur,
                       String nomRecepteur, String prenomRecepteur, String telRecepteur, double montant) {
        if (montant<=0 || cniEmetteur==null || telEmetteur==null || telRecepteur==null){
            return "Veillez renseigner tous les champs";
        }else {
            SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            String dateFormat = s.format(date);
            EmetteurController e = new EmetteurController(emetteursao);
            Emetteur emetteurSave = e.saveEmetteur(nomEmetteur,prenomEmetteur,telEmetteur,cniEmetteur);
            RecepteurController r = new RecepteurController(recepteurdao);
            Recepteur recepteurSave = r.saveRecepteur(nomRecepteur,prenomRecepteur,telRecepteur);
            Envoie envoie = new Envoie();
            envoie.setDateEnvoie(dateFormat);
            envoie.setMontant(montant);
            envoie.setEmetteur(emetteurSave);
            envoie.setRecepteur(recepteurSave);

            return envoiedao.save(envoie);
        }
    }

    @GetMapping(value = "/liste")
    public List<Envoie> listeEnvoies() {
        return envoiedao.findAll();
    }

    @GetMapping(value = "/get/{id}")
    public Envoie getEnvoie(@PathVariable(name = "id") int id) {
        return envoiedao.getOne(id);
    }

    //pour mettre à jour
    @PutMapping(value = "/update/{id}")
    public Envoie update(@PathVariable(name = "id") int id, @RequestBody Envoie e) {
        e.setId(id);
        return envoiedao.save(e);
    }

    //pour supprimer
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(name = "id") int id) {
        envoiedao.deleteById(id);
    }
}
