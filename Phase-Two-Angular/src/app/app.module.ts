import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeHeaderComponent } from './home/home-header/home-header.component';
import { HomeFooterComponent } from './home/home-footer/home-footer.component';
import { HomeSearchComponent } from './home/home-search/home-search.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { MentorComponent } from './mentor/mentor.component';
import { AdminComponent } from './admin/admin.component';
import { SignInComponent } from './home/sign-in/sign-in.component';
import { SignUpComponent } from './home/sign-up/sign-up.component';
import { UserHeaderComponent } from './user/user-header/user-header.component';
import { UserFooterComponent } from './user/user-footer/user-footer.component';
import { UserSearchComponent } from './user/user-search/user-search.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeHeaderComponent,
    HomeFooterComponent,
    HomeSearchComponent,
    HomeComponent,
    UserComponent,
    MentorComponent,
    AdminComponent,
    SignInComponent,
    SignUpComponent,
    UserHeaderComponent,
    UserFooterComponent,
    UserSearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
