import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-header',
  templateUrl: './home-header.component.html',
  styleUrls: ['./home-header.component.css']
})
export class HomeHeaderComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  title="Mentor On Demand";
  navLink1="Home";
  user="Guest User";


}