import {Injectable} from '@angular/core';
import {Transfert} from '../model/transfert';

@Injectable({
    providedIn: 'root'
})
export class TransfertService {

    transferts: Transfert[]; /*un tableau de chaînes de caractères*/
    constructor() {
        this.transferts = [
            {id: 1, montant: 200000, dateTransfert: '30/12/2020'},
            {id: 2, montant: 150000, dateTransfert: '1/1/2020'}
        ];
    }

    listeTransfert(): Transfert[] {
        return this.transferts;
    }

    // tslint:disable-next-line:typedef
    ajouterTransfert(transfert: Transfert) {
        this.transferts.push(transfert);
    }
}
