import { Component, OnInit } from '@angular/core';
import { Passenger } from '../passenger';
import { PassengerRegistrationService } from '../passenger-registration.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  message: any;
  passenger: Passenger = new Passenger(0, "","","",0,0,"","","","");
  constructor(private service:PassengerRegistrationService) { }

  ngOnInit(): void {
  }
  public loginNow(){
    let resp=this.service.dologin(this.passenger);
    resp.subscribe((data)=>this.message=data);
      }


}
