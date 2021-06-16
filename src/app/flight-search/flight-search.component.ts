import { Component, OnInit } from '@angular/core';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-flight-search',
  templateUrl: './flight-search.component.html',
  styleUrls: ['./flight-search.component.css']
})
export class FlightSearchComponent implements OnInit {
  flight: any;
  date:any;
  constructor(private service:PassengerRegistrationService) { }

  ngOnInit(): void {
  }
  getFlightDetails(){
    let resp=this.service.getFlight();
    resp.subscribe(data=>this.flight=data);
   }
 

   public findUserByDate(){
    let resp= this.service.getPassengerByDate(this.date);
    resp.subscribe((data)=>this.flight=data);
   }
 
  }
