import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PassengerRegistrationService } from '../passenger-registration.service';
import { Users } from '../users';
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
  constructor(private service:PassengerRegistrationService, private router:Router) { }

  ngOnInit(): void {
  }
  //public loginNow(){
   // let resp=this.service.dologin(this.passenger);
   // resp.subscribe((data)=>this.message=data);
     // }

      loginNow() {
        let resp = this.service.dologin(this.username, this.password);
        resp.subscribe(data => {
          this.message = data;
         this.router.navigate(["/payment"])
        });
      }

}
