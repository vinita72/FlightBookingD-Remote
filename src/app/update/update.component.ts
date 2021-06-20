import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Flight } from '../flight';
import { PassengerRegistrationService } from '../passenger-registration.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  id!: number;
  flight:any;
    constructor(private service:PassengerRegistrationService, private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.service.getFlightDetailsById(this.id).subscribe(data => {
      this.flight = data;
    }, error => console.log(error));
  }
  onSubmit(){
    this.service.updateFlightDetails(this.id, this.flight).subscribe( data =>{
      this.goToFlightList();
    }, error => console.log(error));
  }

  goToFlightList(){
    this.router.navigate(['/admin']);
  }

  }



  //updateFlight(){
  //  let resp= this.service.updateFlightDetails(this.flight);
    //resp.subscribe((data)=>this.flight=data);
  // }

