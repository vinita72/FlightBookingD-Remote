import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PassengerRegistrationService {

  constructor(private http: HttpClient) { }

  public doRegistration(passenger:any){
    return this.http.post("http://localhost:8989/FlightPassenger/passenger/registerpassenger/",passenger,{responseType:'text' as 'json'});
  }

  public dologin(passenger:any){
    return this.http.post("http://localhost:8989/FlightPassenger/passenger/loginhere/",passenger,{responseType:'text' as 'json'});
  }

  public addFlightDetails(flight:any){
    return this.http.post("http://localhost:8989/FlightDetails/flight/addFlightDetails/",flight, {responseType:'text' as 'json'});

  }

     deletePassengers(id:number){
      return this.http.delete("http://localhost:8989/FlightPassenger/passenger/delete/"+id);

    }
  

    login(username:string,password:string){
      const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
      return this.http.get("http://localhost:8085/",{headers,responseType: 'text' as 'json'})
    }
      getPassengers() {
        let username='Java'
        let password='Password'
        const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
      return  this.http.get("http://localhost:8085/findAllPassenger",{headers});
      }


      getFlight(){
        let username='Java'
        let password='Password'
        const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(username + ':' + password) });
      return  this.http.get("http://localhost:8989/FlightDetails/flight/findAllFlightDetails/",{headers});
      }

      deleteFlightDetails(id:number){
        return this.http.delete("http://localhost:8989/FlightDetails/flight/delete/"+id);

      }
  }

