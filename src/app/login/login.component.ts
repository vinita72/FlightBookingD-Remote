import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PassengerRegistrationService } from '../passenger-registration.service';
import { Users } from '../users';
import {faUserAlt } from '@fortawesome/free-solid-svg-icons';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 


  message: any;
  username!: string;
  password!: string;
  users: Users = new Users("","","","","");
  payment: any;
  faUserAlt=faUserAlt;



  contactForm!:FormGroup;
  contact={
    username:'',
    password:''
  };
  submitted=false;

  
  constructor(private service:PassengerRegistrationService, private router:Router) { 
    this.creatForm();

  }

  ngOnInit(): void {
  }
  //public loginNow(){
   // let resp=this.service.dologin(this.passenger);
   // resp.subscribe((data)=>this.message=data);
     // }

      loginNow(){
        let resp = this.service.dologin(this.username, this.password);
        resp.subscribe(data => {
          this.message = data;
         this.router.navigate(["/payment"])
        });
      }

  creatForm():void {
    this.contactForm = new FormGroup({
      'username': new FormControl(this.contact.username,[
        Validators.required,
        Validators.minLength(4)
      ]),
      'password': new FormControl(this.contact.password,[
        Validators.required,
        Validators.minLength(6)
      ]),
      
      });    
        }  

 
}
