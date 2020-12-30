package sn.sentransfert.dao;

import org.springframework.data.rest.core.config.Projection;
import sn.sentransfert.entities.Recepteur;

//permet de selectionner un attribut spécifique (par exemple nom)
@Projection(name = "P1",types = Recepteur.class)
public interface RecepteurProjection {

    //permet de recupérer uniquement les noms
    public String getNom();
    //permet de recupérer uniquement les prénoms
    public String getPrenom();
}
