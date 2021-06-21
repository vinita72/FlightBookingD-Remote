import { Component, OnInit } from '@angular/core';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  payment: any;

  constructor(private service:PassengerRegistrationService) { }

  ngOnInit(): void {
  }


  onSubmit(){
    let resp= this.service.payemntDetails(this.payment);
    resp.subscribe((data)=>this.payment=data);
   }
  }

