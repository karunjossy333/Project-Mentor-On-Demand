import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HomeSearchComponent } from './home/home-search/home-search.component';
import { SignInComponent } from './home/sign-in/sign-in.component';
import { SignUpComponent } from './home/sign-up/sign-up.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [{ path: '', redirectTo: "/home", pathMatch: 'full'},
{ path: 'home', component: HomeComponent },
{ path: 'sign-in',component: SignInComponent },
{ path: 'sign-up',component: SignUpComponent },
{ path: 'user',component: UserComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
