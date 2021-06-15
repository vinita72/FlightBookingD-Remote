import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Flight } from '../flight';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

 date!:string;
 fromlocation!:string;
 tolocation!:string;
  message: any;
  flight: Flight = new Flight(0, "","",0,0,"",);
  constructor(private service:PassengerRegistrationService, private router:Router) { }
  ngOnInit(): void {
  }

  searchFlight(){
    let resp=this.service.searchFlightDetailsbyid( this.date);
    resp.subscribe(data => {
      this.message = data;
     this.router.navigate(["/flight-search"])
    });
  }
 
}
