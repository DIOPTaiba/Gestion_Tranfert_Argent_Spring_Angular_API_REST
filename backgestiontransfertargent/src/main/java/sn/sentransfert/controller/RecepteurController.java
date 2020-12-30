package sn.sentransfert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.sentransfert.dao.IRecepteur;

import sn.sentransfert.entities.Recepteur;

import java.util.List;

@RestController
@RequestMapping("/recepteur")
public class RecepteurController {

    private final IRecepteur recepteurdao;

    public RecepteurController(IRecepteur recepteurdao) {
        this.recepteurdao = recepteurdao;
    }

    //pour ajouter
    public Recepteur saveRecepteur(String nomRecepteur, String prenomRecepteur, String telRecepteur) {
        Recepteur r = new Recepteur();
        r.setNomRecepteur(nomRecepteur);
        r.setPrenomRecepteur(prenomRecepteur);
        r.setTelRecepteur(telRecepteur);
        return recepteurdao.save(r);
    }

    @GetMapping(value = "/liste")
    public List<Recepteur> listRecepteurs() {
        return recepteurdao.findAll();
    }

    @GetMapping(value = "/get/{id}")
    public Recepteur getRecepteur(@PathVariable(name = "id") int id) {
        return recepteurdao.findById(id).get();
    }

    //pour mettre à jour
    @PutMapping(value = "/update/{id}")
    public Recepteur update(@PathVariable(name = "id") int id, @RequestBody Recepteur r) {
        r.setId(id);
        return recepteurdao.save(r);
    }

    //pour supprimer
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(name = "id") int id) {
        recepteurdao.deleteById(id);
    }
}
