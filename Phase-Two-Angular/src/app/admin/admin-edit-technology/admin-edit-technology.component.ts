import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-admin-edit-technology',
  templateUrl: './admin-edit-technology.component.html',
  styleUrls: ['./admin-edit-technology.component.css']
})
export class AdminEditTechnologyComponent implements OnInit {

  technologyData;
  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get('/assets/technology.json').subscribe(technologydata => {   
      this.technologyData = technologydata;
    });
  }

}
