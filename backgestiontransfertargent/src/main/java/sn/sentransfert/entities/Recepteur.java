package sn.sentransfert.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
//on ajoute getteurs et setteurs et constructeurs lombok
@Data @NoArgsConstructor @AllArgsConstructor
public class Recepteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String nomRecepteur;
    @Column(length = 100)
    private String prenomRecepteur;
    @Column(length = 100)
    private String telRecepteur;
    @OneToMany(mappedBy = "recepteur", fetch = FetchType.LAZY)
    private List<Envoie> envoies = new ArrayList<>();
}
