import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  passenger: any;
  flight: any;
  constructor() { }

  ngOnInit(): void {
  }

}
