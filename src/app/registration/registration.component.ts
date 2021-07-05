import { Component, OnInit } from '@angular/core';
import { PassengerRegistrationService } from '../passenger-registration.service';
import { Users } from '../users';
import {faUserAlt } from '@fortawesome/free-solid-svg-icons';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  message: any;
  users: Users = new Users("","","","","");
  faUserAlt=faUserAlt;


  contactForm!:FormGroup;
  contact={
    id:'',
    username:'',
    password:'',
    email:''
  };
  submitted=false;

  

  constructor(private service:PassengerRegistrationService) { 
    this.creatForm();
  }

  ngOnInit(): void {
  }
  public registerNow(){
    let resp=this.service.doRegistration(this.users);
    resp.subscribe((data)=>this.message=data);
      }


      creatForm():void {
        this.contactForm = new FormGroup({
          'id': new FormControl(this.contact.id,[
            Validators.required,
            Validators.minLength(1)
          ]),
          'username': new FormControl(this.contact.username,[
            Validators.required,
            Validators.minLength(4)
          ]),
          'password': new FormControl(this.contact.password,[
            Validators.required,
            Validators.minLength(6)
          ]),
          'email': new FormControl(this.contact.email,[
            Validators.required,
            Validators.email
          ]),
          });    
            }  
    
}

