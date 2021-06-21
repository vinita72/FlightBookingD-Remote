import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Flight } from '../flight';
import { PassengerRegistrationService } from '../passenger-registration.service';
import { faPlaneDeparture } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  faPlaneDeparture = faPlaneDeparture;

  passenger: any;
  id!: number;
  flight:any;
  constructor(private service:PassengerRegistrationService, private route: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.service.getFlightDetailsById(this.id).subscribe(data => {
      this.flight = data;
    });
  }
  }


