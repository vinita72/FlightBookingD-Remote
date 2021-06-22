import { Component, OnInit } from '@angular/core';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  FlightBooking:any;
  id!:number;
  email!:string;
  password!:string;

  constructor(private service:PassengerRegistrationService) { }

  ngOnInit(): void {
  }


  google(){
    let resp= this.service.googlesign(this.id, this.email, this.password);
    resp.subscribe((data)=>this.FlightBooking=data);
   }


}
