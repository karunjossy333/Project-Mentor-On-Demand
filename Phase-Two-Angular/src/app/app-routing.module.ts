import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HomeSearchComponent } from './home/home-search/home-search.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';

const routes: Routes = [{ path: '', redirectTo: "/home", pathMatch: 'full'},
{ path: 'home', component: HomeComponent },
{ path: 'search',component: HomeSearchComponent },
{ path: 'sign-in',component: SignInComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
