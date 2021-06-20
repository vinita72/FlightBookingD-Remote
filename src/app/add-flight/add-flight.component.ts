import { Component, OnInit } from '@angular/core';
import { Flight } from '../flight';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})
export class AddFlightComponent implements OnInit {

  message: any;
  flight: Flight = new Flight();
  constructor(private service:PassengerRegistrationService) { }
  ngOnInit(): void {
  }
  addFlightNow(){
    let resp=this.service.addFlightDetails(this.flight);
    resp.subscribe((data)=>this.message=data);
      }
  }

