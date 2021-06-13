import { Component, OnInit } from '@angular/core';
import{Passenger} from '../passenger'
import { PassengerRegistrationService } from '../passenger-registration.service';
@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  message: any;
  passenger: Passenger = new Passenger(0, "","","",0,0,"","","","");
  constructor(private service:PassengerRegistrationService) { }

  ngOnInit(): void {
  }
  public registerNow(){
    let resp=this.service.doRegistration(this.passenger);
    resp.subscribe((data)=>this.message=data);
      }
}

