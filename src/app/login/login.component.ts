import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Passenger } from '../passenger';
import { PassengerRegistrationService } from '../passenger-registration.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  message: any;
  emailId:any;
  password:any;
  passenger: Passenger = new Passenger(0, "","","",0,0,"","","","");
  constructor(private service:PassengerRegistrationService, private router:Router) { }

  ngOnInit(): void {
  }
  //public loginNow(){
   // let resp=this.service.dologin(this.passenger);
   // resp.subscribe((data)=>this.message=data);
     // }

      loginNow() {
        let resp = this.service.dologin(this.passenger);
        resp.subscribe(data => {
          this.message = data;
         this.router.navigate(["/booking"])
        });
      }

}
