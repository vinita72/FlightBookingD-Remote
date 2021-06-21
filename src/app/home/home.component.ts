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


  flight:any;
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

  public findFlightByDate(){
    let resp= this.service.searchFlightDetailsbyDate(this.date);
    resp.subscribe((data)=>this.flight=data);
    //this.router.navigate(["flight-search", date])

   }
  
   booking(id :number) {
    this.router.navigate(["booking", id])
 }
  //public findUserByDate(){
    //let resp= this.service.getPassengerByDate(this.date);
  //  resp.subscribe((data)=>this.flight=data);
  // }
 
}
