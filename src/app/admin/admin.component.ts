import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  user: any;
  flight: any;

  constructor(private service:PassengerRegistrationService, private router:Router) { }

  ngOnInit(): void {
  }

  getPassenger(){
    let resp=this.service.getPassengers();
    resp.subscribe(data=>this.user=data);
      }

  public deletePassenger(id:number){
    let resp= this.service.deletePassengers(id);
    resp.subscribe((data)=>this.user=data);
   }
   
   getFlightDetails(){
    let resp=this.service.getFlight();
    resp.subscribe(data=>this.flight=data);
   }

   deleteFlight(id:number){
    let resp= this.service.deleteFlightDetails(id);
    resp.subscribe((data)=>this.flight=data);
   }


   update(){
    this.router.navigate(['update']);
  }
  

   booking(id :number) {
    this.router.navigate(["update", id])
 }
  
}
