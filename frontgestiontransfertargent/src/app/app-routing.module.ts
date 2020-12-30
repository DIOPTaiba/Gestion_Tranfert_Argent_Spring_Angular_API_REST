import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TransfertComponent} from './transfert/transfert.component';
import {AddTransfertComponent} from './add-transfert/add-transfert.component';

const routes: Routes = [
    /*quand on click sur un lien vers transferts il va afficher le composant TransfertComponent*/
    {path: 'transferts', component : TransfertComponent},
    {path: 'add-transfert', component: AddTransfertComponent},
    /*pour ajouter un composant par défaut qui se charge au démarrage de l'appli*/
    { path: '', redirectTo: 'transferts', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
