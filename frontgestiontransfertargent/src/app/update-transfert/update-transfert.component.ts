import {Component, OnInit} from '@angular/core';
import {Transfert} from '../model/transfert';
import {ActivatedRoute, Router} from '@angular/router';
import {TransfertService} from '../services/transfert.service';

@Component({
    selector: 'app-update-transfert',
    templateUrl: './update-transfert.component.html',
    styles: []
})
export class UpdateTransfertComponent implements OnInit {
    // currentTransfert va recupérer le transfert courant (à modifier) et sera afficher dans un formulaire
    currentTransfert = new Transfert();

// On transmet des données avec ActivatedRoute en faisant de l'injection de dépendance
    constructor(private activatedRoute: ActivatedRoute,
                // on cré la variable router pour définir la route à retourner aprés update
                private router: Router,
                private transfertService: TransfertService) {
    }

    ngOnInit(): void {
        // params permet de recupèrer tous les paramètre transmis par le lien
        console.log(this.activatedRoute.snapshot.params.id);
        this.currentTransfert = this.transfertService.consulterTransfert(this.activatedRoute.snapshot.params.id);
        console.log(this.currentTransfert);
    }

    // tslint:disable-next-line:typedef
    updateTransfert() {
        // console.log(this.currentTransfert);
        this.transfertService.updateTransfert(this.currentTransfert);
        // après update on retourne vers la page tarnsfert
        this.router.navigate(['transferts']);
    }

}
