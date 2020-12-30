import {Component, OnInit} from '@angular/core';
import {Transfert} from '../model/transfert';
import {TransfertService} from '../services/transfert.service';

@Component({
    selector: 'app-transfert',
    templateUrl: './transfert.component.html',
    styleUrls: ['./transfert.component.css']
})
export class TransfertComponent implements OnInit {

    transferts: Transfert[]; /*un tableau de chînes de caractères*/
    constructor(private transfertService: TransfertService) {
        this.transferts = transfertService.listeTransfert();
    }

    ngOnInit(): void {
    }

}
