import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import{ HttpClientModule } from '@angular/common/http';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PassengerRegistrationService } from './passenger-registration.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AdminComponent } from './admin/admin.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AddFlightComponent } from './add-flight/add-flight.component';
import { FlightSearchComponent } from './flight-search/flight-search.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { BookingComponent } from './booking/booking.component';
import { UpdateComponent } from './update/update.component';
import { PaymentComponent } from './payment/payment.component';
import { HeaderComponent } from './header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    HomeComponent,
    AdminComponent,
    AdminLoginComponent,
    AddFlightComponent,
    FlightSearchComponent,
    LoginPageComponent,
    BookingComponent,
    UpdateComponent,
    PaymentComponent,
    HeaderComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    FontAwesomeModule
  ],
  providers: [PassengerRegistrationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
