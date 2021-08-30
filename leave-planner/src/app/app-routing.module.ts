import { NgModule } from '@angular/core';
import { MatTableModule } from '@angular/material';
import { Routes, RouterModule } from '@angular/router';


const routes: Routes = [];

@NgModule({
  imports: [
    RouterModule.forRoot(routes),
    MatTableModule],
  exports: [
    RouterModule,
    MatTableModule]
})
export class AppRoutingModule { }
