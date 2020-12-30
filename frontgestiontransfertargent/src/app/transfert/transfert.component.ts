import {Component, OnInit} from '@angular/core';

@Component({
    selector: 'app-transfert',
    templateUrl: './transfert.component.html',
    styleUrls: ['./transfert.component.css']
})
export class TransfertComponent implements OnInit {

    transferts: string[]; /*un tableau de chînes de caractères*/
    constructor() {
        this.transferts = ['T1', 'T2', 'T3'];
    }

    ngOnInit(): void {
    }

}
