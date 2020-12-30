import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TransfertComponent } from './transfert/transfert.component';
import { AddTransfertComponent } from './add-transfert/add-transfert.component';

@NgModule({
  declarations: [
    AppComponent,
    TransfertComponent,
    AddTransfertComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
