package sn.sentransfert.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
//on ajoute getteurs et setteurs et constructeurs
@Data @NoArgsConstructor @AllArgsConstructor
public class Emetteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String nomEmetteur;
    @Column(length = 100)
    private String prenomEmetteur;
    @Column(length = 100)
    private String telEmetteur;
    @Column(length = 100)
    private String cniEmetteur;
    @OneToMany(mappedBy = "emetteur", fetch = FetchType.LAZY)
    private List<Envoie> envoies = new ArrayList<>();
}
