import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { DataTablesModule } from 'angular-datatables';

import { AppComponent } from './app.component';
import { CustomerComponent }  from './components/customer.component';
import { CustomerService }  from './service/customer.service';
import { routing }  from './app.routing';
@NgModule({
  declarations: [
    AppComponent,CustomerComponent],
  imports: [
    BrowserModule,FormsModule, HttpModule,DataTablesModule, routing
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
