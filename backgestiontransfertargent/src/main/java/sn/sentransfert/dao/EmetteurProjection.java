package sn.sentransfert.dao;

import org.springframework.data.rest.core.config.Projection;
import sn.sentransfert.entities.Emetteur;

//permet de selectionner un attribut spécifique (par exemple nom)
@Projection(name = "P1",types = Emetteur.class)
public interface EmetteurProjection {

    //permet de recupérer uniquement les noms
    public String getNom();
    //permet de recupérer uniquement les prénoms
    public String getPrenom();
}
