import { Component, OnInit } from '@angular/core';
import { faEnvelope } from '@fortawesome/free-solid-svg-icons';
import { faPlane } from '@fortawesome/free-solid-svg-icons';
import { faPhone } from '@fortawesome/free-solid-svg-icons';
import {faComment } from '@fortawesome/free-solid-svg-icons';
import {faHashtag } from '@fortawesome/free-solid-svg-icons';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  faEnvelope = faEnvelope;
  faPlane =faPlane;
  faPhone=faPhone;
  faHashtag=faHashtag;
  faComment=faComment;
  constructor() { }

  ngOnInit(): void {
  }

}
