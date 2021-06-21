import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-flight-search',
  templateUrl: './flight-search.component.html',
  styleUrls: ['./flight-search.component.css']
})
export class FlightSearchComponent implements OnInit {
  flight: any;
  date:any;
  message:any;
  constructor(private service:PassengerRegistrationService, private router:Router) { }

  ngOnInit(): void {
  }
  getFlightDetails(){
    let resp=this.service.getFlight();
    resp.subscribe(data=>this.flight=data);
   }
 

   public findFlightByDate(){
    let resp= this.service.searchFlightDetailsbyDate(this.date);
    resp.subscribe((data)=>this.flight=data);
   }
 
   booking(id :number) {
     this.router.navigate(["booking", id])
  }

  }
