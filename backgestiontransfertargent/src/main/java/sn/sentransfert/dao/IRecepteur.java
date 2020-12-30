package sn.sentransfert.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import sn.sentransfert.entities.Emetteur;
import sn.sentransfert.entities.Recepteur;

import java.util.List;

@RepositoryRestResource
public interface IRecepteur extends JpaRepository<Recepteur, Integer> {

    //http://localhost:8080/clients/search/findByTel?tel=123456789 : permet de recupérer le client avec le tel=123456789
    @RestResource(path = "/findRecepteurByTel")
    public List<Recepteur> findRecepteurByTelRecepteur(@Param("tel") String tel);

    //pour afficher les données par page
    //http://localhost:8080/clients/search/findByTelPage?cni=100&page=2&size=1
    @RestResource(path = "/findRecepteurByTelPage")
    public Page<Recepteur> findRecepteurByTelRecepteur(@Param("tel") String tel, Pageable pageable);

}

