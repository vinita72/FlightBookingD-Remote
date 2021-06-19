import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Flight } from '../flight';
import { PassengerRegistrationService } from '../passenger-registration.service';
import { faEnvelope } from '@fortawesome/free-solid-svg-icons';
import { faPlane } from '@fortawesome/free-solid-svg-icons';
import { faPhone } from '@fortawesome/free-solid-svg-icons';
import {faComment } from '@fortawesome/free-solid-svg-icons';
import {faHashtag } from '@fortawesome/free-solid-svg-icons';



@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  faEnvelope = faEnvelope;
  faPlane =faPlane;
  faPhone=faPhone;
  faHashtag=faHashtag;
  faComment=faComment;


  flights:any;
 flight: Flight = new Flight(0,"","",0,0,"");
 date!:string;
  message!: any;
  constructor(private service:PassengerRegistrationService, private router:Router) { }
  ngOnInit(): void {
  }

  searchFlight(){
    let resp=this.service.searchFlightDetails( this.flight);
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
