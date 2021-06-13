import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Passenger } from './passenger';

@Injectable({
  providedIn: 'root'
})
export class PassengerRegistrationService {

  constructor(private http: HttpClient) { }

  public doRegistration(passenger:any){
    return this.http.post("http://localhost:8083/passenger/registerpassenger/",passenger,{responseType:'text' as 'json'});
  }

}
