import { Component, OnInit } from '@angular/core';
import { PassengerRegistrationService } from '../passenger-registration.service';
import { Users } from '../users';
import {faUserAlt } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  message: any;
  users: Users = new Users("","","","","");
  faUserAlt=faUserAlt;

  constructor(private service:PassengerRegistrationService) { }

  ngOnInit(): void {
  }
  public registerNow(){
    let resp=this.service.doRegistration(this.users);
    resp.subscribe((data)=>this.message=data);
      }
}

