import {Component, OnInit} from '@angular/core';
import {Transfert} from '../model/transfert';
import {TransfertService} from '../services/transfert.service';

@Component({
    selector: 'app-add-transfert',
    templateUrl: './add-transfert.component.html',
    styleUrls: ['./add-transfert.component.css']
})
export class AddTransfertComponent implements OnInit {

    newTransfert = new Transfert();
    message: string;

    constructor(private transfertService: TransfertService) {
    }

    ngOnInit(): void {
    }

    // tslint:disable-next-line:typedef
    addTransfert() {
        /*console.log(this.newTransfert);*/
        this.transfertService.ajouterTransfert(this.newTransfert);
        this.message = 'Transfert ' + this.newTransfert.id + ' effectué avec succès';
    }
}
