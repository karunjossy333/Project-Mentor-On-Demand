import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-nav-bar',
  templateUrl: './home-nav-bar.component.html',
  styleUrls: ['./home-nav-bar.component.css']
})
export class HomeNavBarComponent implements OnInit {

  constructor() {}

  ngOnInit() {
  }

  title="Mentor On Demand";
  navLink1="Home";
  user="Guest User";

}
