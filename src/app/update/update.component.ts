import { Component, OnInit } from '@angular/core';
import { Flight } from '../flight';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  flight:any;
  constructor(private service:PassengerRegistrationService) { }

  ngOnInit(): void {
  }
  updateFlight(){
    let resp= this.service.updateFlightDetails(this.flight);
    resp.subscribe((data)=>this.flight=data);
   }
}
