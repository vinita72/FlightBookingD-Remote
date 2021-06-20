import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminComponent } from './admin/admin.component';
import { BookingComponent } from './booking/booking.component';
import { FlightSearchComponent } from './flight-search/flight-search.component';
import { HomeComponent } from './home/home.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'registration', component:RegistrationComponent},
  {path:'admin-login', component:AdminLoginComponent},
  {path:'admin', component:AdminComponent},
  {path:'add-flight', component:AddFlightComponent},
  {path:'flight-search',component:FlightSearchComponent},
  {path:'login-page', component:LoginPageComponent},
  {path:'booking/:id', component:BookingComponent},
  {path:'update/:id', component:UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
