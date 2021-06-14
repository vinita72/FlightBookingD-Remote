import { Component, OnInit } from '@angular/core';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  passenger: any;

  constructor(private service:PassengerRegistrationService) { }

  ngOnInit(): void {
  }

  getPassenger(){
    let resp=this.service.getPassengers();
    resp.subscribe(data=>this.passenger=data);
      }

  public deletePassenger(id:number){
    let resp= this.service.deletePassengers(id);
    resp.subscribe((data)=>this.passenger=data);
   }
   
   
}
