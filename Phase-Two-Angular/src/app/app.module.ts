import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeSearchComponent } from './home/home-search/home-search.component';
import { UserComponent } from './user/user.component';
import { MentorComponent } from './mentor/mentor.component';
import { AdminComponent } from './admin/admin.component';
import { SignInComponent } from './home/sign-in/sign-in.component';
import { SignUpComponent } from './home/sign-up/sign-up.component';
import { UserSearchComponent } from './user/user-search/user-search.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { HomeNavBarComponent } from './home-nav-bar/home-nav-bar.component';
import { UserMenuNavBarComponent } from './user/user-menu-nav-bar/user-menu-nav-bar.component';
import { UserInProgressComponent } from './user/user-in-progress/user-in-progress.component';
import { UserCompletedComponent } from './user/user-completed/user-completed.component';
import { MentorMenuNavBarComponent } from './mentor/mentor-menu-nav-bar/mentor-menu-nav-bar.component';
import { MentorInProgressComponent } from './mentor/mentor-in-progress/mentor-in-progress.component';
import { MentorCompletedComponent } from './mentor/mentor-completed/mentor-completed.component';
import { MentorEditSkillComponent } from './mentor/mentor-edit-skill/mentor-edit-skill.component';
import { MentorPaymentsComponent } from './mentor/mentor-payments/mentor-payments.component';
import { UserSignUpComponent } from './home/sign-up/user-sign-up/user-sign-up.component';
import { MentorSignUpComponent } from './home/sign-up/mentor-sign-up/mentor-sign-up.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeSearchComponent,
    UserComponent,
    MentorComponent,
    AdminComponent,
    SignInComponent,
    SignUpComponent,
    UserSearchComponent,
    HeaderComponent,
    FooterComponent,
    HomeNavBarComponent,
    UserMenuNavBarComponent,
    UserInProgressComponent,
    UserCompletedComponent,
    MentorMenuNavBarComponent,
    MentorInProgressComponent,
    MentorCompletedComponent,
    MentorEditSkillComponent,
    MentorPaymentsComponent,
    UserSignUpComponent,
    MentorSignUpComponent
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
