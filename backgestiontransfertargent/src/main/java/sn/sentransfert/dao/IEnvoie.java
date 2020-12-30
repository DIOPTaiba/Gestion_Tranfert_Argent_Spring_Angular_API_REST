package sn.sentransfert.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import sn.sentransfert.entities.Envoie;

@RepositoryRestResource
public interface IEnvoie extends JpaRepository<Envoie, Integer> {



}
