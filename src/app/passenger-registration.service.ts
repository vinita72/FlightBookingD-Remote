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
      return  this.http.get("http://localhost:8085/findAllPassengers",{headers});
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

      searchFlightDetailsbyid(date:string){
        return this.http.get("http://localhost:8081/flight/findAllFlightDetail/"+date);

      }

     
      searchFlightDetails(date :string, fromlocation: string, tolocation: string){
        const updateData = { date:date, fromlocation: fromlocation, tolocation: tolocation };

        return this.http.post("http://localhost:8081/flight/searchFlightDetails/", updateData);

      }


      
        public getPassengerByDate(date: string){
          return this.http.get("http://localhost:8989/FlightDetails/flight/findAllFlightDetail/"+date);
        }

        updateFlightDetails(flight:any){
          return this.http.put("http://localhost:8989/FlightDetails/flight/update/",flight);

        }
    
  }

