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
  flight!:any;
 date!:string;
  message!: any;
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

  //public findUserByDate(){
    //let resp= this.service.getPassengerByDate(this.date);
  //  resp.subscribe((data)=>this.flight=data);
  // }
 
}
