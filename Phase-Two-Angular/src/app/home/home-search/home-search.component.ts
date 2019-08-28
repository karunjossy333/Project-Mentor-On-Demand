import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';


@Component({
  selector: 'app-home-search',
  templateUrl: './home-search.component.html',
  styleUrls: ['./home-search.component.css']
})
export class HomeSearchComponent implements OnInit {

  searchMentor = new FormGroup({
    searchTechnology : new FormControl(''),
    timeSlot : new FormControl('')
  });

  constructor() { }

  ngOnInit() {
  }

  search() {
    
  }
}
