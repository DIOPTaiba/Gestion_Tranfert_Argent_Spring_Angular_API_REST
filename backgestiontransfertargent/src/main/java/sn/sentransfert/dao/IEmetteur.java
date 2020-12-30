package sn.sentransfert.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import sn.sentransfert.entities.Emetteur;

import java.util.List;

@RepositoryRestResource
public interface IEmetteur extends JpaRepository<Emetteur, Integer> {

//=============Traitement pour l'emetteur=====================================

    //http://localhost:8080/emetteurs/search/findEmetteurByCni?cni=200 : permet de recupérer le client avec le cni=200
    @RestResource(path = "/findEmetteurByCni")
    public List<Emetteur> findEmetteurByCniEmetteur(@Param("cni") String cni);

    //pour afficher les données par page
    //http://localhost:8080/emetteurs/search/findEmetteurByCniPage?cni=200&page=2&size=1
    @RestResource(path = "/findEmetteurByCniPage")
    public Page<Emetteur> findEmetteurByCniEmetteur(@Param("cni") String cni, Pageable pageable);

}

