import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class PassengerRegistrationService {

  constructor(private http: HttpClient) { }

  public doRegistration(users:any){
    return this.http.post("http://localhost:9091/api/v1/users",users,{responseType:'text' as 'json'});
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
  

    login(adminusername:string,adminpassword:string){
      const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(adminusername + ':' + adminpassword) });
      return this.http.get("http://localhost:8085/",{headers,responseType: 'text' as 'json'})
    }
      getPassengers() {
        let adminusername='Java'
        let adminpassword='Password'
        const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(adminusername + ':' + adminpassword) });
      return  this.http.get("http://localhost:9091/api/v1/findAllUsers/",{headers});
      }


      getFlight(){
        let adminusername='Java'
        let adminpassword='Password'
        const headers = new HttpHeaders({ Authorization: 'Basic ' + btoa(adminusername + ':' + adminpassword) });
      return  this.http.get("http://localhost:8989/FlightDetails/flight/findAllFlightDetails/",{headers});
      }

      deleteFlightDetails(id:number){
        return this.http.delete("http://localhost:8989/FlightDetails/flight/delete/"+id);

      }

      searchFlightDetailsbyid(date:string){
        return this.http.get("http://localhost:8081/flight/findAllFlightDetail/"+date);

      }

     
      searchFlightDetails(flight:any){

        return this.http.post("http://localhost:8081/flight/searchFlightDetails", flight);

      }


      
        public getPassengerByDate(date: string){
          return this.http.get("http://localhost:8989/FlightDetails/flight/findAllFlightDetail/"+date);
        }

        updateFlightDetails(flight:any){
          return this.http.put("http://localhost:8081/flight/update",flight);

        }
    
  }

