import {Injectable} from '@angular/core';
import {Transfert} from '../model/transfert';

@Injectable({
    providedIn: 'root'
})
export class TransfertService {

    transferts: Transfert[]; /*un tableau de chaînes de caractères*/
    transfert: Transfert;

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

    supprimerTransfert(transfert: Transfert) {
        /*supprimer le transfert du tableau transferts*/
        const index = this.transferts.indexOf(transfert, 0);
        if (index > -1) {
            this.transferts.splice(index, 1);
        }
        /*ou Bien avec la méthode suivante*/

        /*this.transferts.forEach((cur, index) => {
        if(transfert.id === cur.id) {
        this.transferts.splice(index, 1);
        }
        });*/
    }

    consulterTransfert(id: number): Transfert {
        // tslint:disable-next-line:triple-equals
        this.transfert = this.transferts.find(t => t.id == id);
        return this.transfert;
    }

    trierTransferts() {
        this.transferts = this.transferts.sort((n1, n2) => {
            if (n1.id > n2.id) {
                return 1;
            }
            if (n1.id < n2.id) {
                return -1;
            }
            return 0;
        });
    }

    // tslint:disable-next-line:typedef
    updateTransfert(transfert: Transfert) {
        // console.log(p);
        this.supprimerTransfert(transfert);
        this.ajouterTransfert(transfert);
        this.trierTransferts();
    }
}
