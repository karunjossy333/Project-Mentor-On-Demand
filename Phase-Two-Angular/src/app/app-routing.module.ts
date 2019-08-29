import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeSearchComponent } from './home/home-search/home-search.component';
import { SignInComponent } from './home/sign-in/sign-in.component';
import { SignUpComponent } from './home/sign-up/sign-up.component';
import { UserComponent } from './user/user.component';
import { UserSearchComponent } from './user/user-search/user-search.component';
import { UserInProgressComponent } from './user/user-in-progress/user-in-progress.component';
import { UserCompletedComponent } from './user/user-completed/user-completed.component';
import { MentorComponent } from './mentor/mentor.component';
import { MentorInProgressComponent } from './mentor/mentor-in-progress/mentor-in-progress.component';
import { MentorCompletedComponent } from './mentor/mentor-completed/mentor-completed.component';
import { MentorEditSkillComponent } from './mentor/mentor-edit-skill/mentor-edit-skill.component';
import { MentorPaymentsComponent } from './mentor/mentor-payments/mentor-payments.component';
import { UserSignUpComponent } from './home/sign-up/user-sign-up/user-sign-up.component';
import { MentorSignUpComponent } from './home/sign-up/mentor-sign-up/mentor-sign-up.component';
import { AdminComponent } from './admin/admin.component';
import { AdminSignInComponent } from './admin-sign-in/admin-sign-in.component';
import { AdminEditTechnologyComponent } from './admin-edit-technology/admin-edit-technology.component';
import { AdminPaymentReportComponent } from './admin-payment-report/admin-payment-report.component';
import { AdminTrainingReportComponent } from './admin-training-report/admin-training-report.component';
import { AdminManageAccountComponent } from './admin-manage-account/admin-manage-account.component';

const routes: Routes = [{ path: '', redirectTo: "/home", pathMatch: 'full' },
{
  path: 'home', children: [{ path: '', component: HomeSearchComponent },
  { path: 'sign-in', component: SignInComponent },
  { path: 'sign-up', component: SignUpComponent, children: [{ path: 'user', component: UserSignUpComponent},
  { path: 'mentor', component: MentorSignUpComponent}] }]
}, {
  path: 'user', component: UserComponent, children: [{ path: 'search', component: UserSearchComponent },
  { path: 'in-progress', component: UserInProgressComponent },
  { path: 'completed', component: UserCompletedComponent }]
},
{
  path: 'mentor', component: MentorComponent, children: [{ path: 'in-progress', component: MentorInProgressComponent },
  { path: 'completed', component: MentorCompletedComponent },
  { path: 'edit-skills', component: MentorEditSkillComponent },
  { path: 'payments', component: MentorPaymentsComponent }]
},
{
  path: 'admin', component: AdminComponent, children: [{ path: '' , component: AdminSignInComponent},
  { path: 'edit-technology' , component: AdminEditTechnologyComponent},
  { path: 'payments' , component: AdminPaymentReportComponent},
  { path: 'trainings' , component: AdminTrainingReportComponent},
  { path: 'accounts' , component: AdminManageAccountComponent}]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
