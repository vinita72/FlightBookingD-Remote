import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PassengerRegistrationService {

  constructor(private http: HttpClient) { }

  public doRegistration(passenger:any){
    return this.http.post("http://localhost:8083/passenger/registerpassenger/",passenger,{responseType:'text' as 'json'});
  }

  public dologin(passenger:any){
    return this.http.post("http://localhost:8083/passenger/loginhere/",passenger,{responseType:'text' as 'json'});
  }


   login(username:string,password:string){
    const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
    return this.http.get("http://localhost:8083/",{headers,responseType: 'text' as 'json'})
  }
    getPassengers() {
      let username='Java'
      let password='Password'
      const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
    return  this.http.get("http://localhost:8083/findAllPassenger",{headers});
    }


     deletePassengers(id:number){
      let username='Java'
      let password='Password'
      const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
      return  this.http.get("http://localhost:8083/delete/"+id,{headers});

    }

    public getPassengerById(id:number){
      return this.http.delete("http://localhost:8083/passenger/findAllPassenger/"+id);

    }   
  }

