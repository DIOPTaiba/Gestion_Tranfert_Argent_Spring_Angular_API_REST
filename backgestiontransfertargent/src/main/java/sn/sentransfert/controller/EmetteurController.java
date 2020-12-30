package sn.sentransfert.controller;

import org.springframework.web.bind.annotation.*;
import sn.sentransfert.dao.IEmetteur;
import sn.sentransfert.entities.Emetteur;

import java.util.List;

@RestController
@RequestMapping("/emetteur")
public class EmetteurController {

    private final IEmetteur emetteurdao;

    public EmetteurController(IEmetteur emetteurdao) {
        this.emetteurdao = emetteurdao;
    }

    //pour ajouter l'emetteur
    public Emetteur saveEmetteur(@RequestBody String nomEmetteur, String prenomEmetteur, String telEmetteur, String cniEmetteur) {
        Emetteur e = new Emetteur();
        e.setNomEmetteur(nomEmetteur);
        e.setPrenomEmetteur(prenomEmetteur);
        e.setTelEmetteur(telEmetteur);
        e.setCniEmetteur(cniEmetteur);
        return emetteurdao.save(e);
    }

    @GetMapping(value = "/liste")
    public List<Emetteur> listEmetteurs() {
        return emetteurdao.findAll();
    }

    @GetMapping(value = "/get/{id}")
    public Emetteur getEmetteur(@PathVariable(name = "id") int id) {
        return emetteurdao.findById(id).get();
    }

    //pour mettre à jour
    @PutMapping(value = "/update/{id}")
    public Emetteur update(@PathVariable(name = "id") int id, @RequestBody Emetteur e) {
        e.setId(id);
        return emetteurdao.save(e);
    }

    //pour supprimer
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(name = "id") int id) {
        emetteurdao.deleteById(id);
    }
}
