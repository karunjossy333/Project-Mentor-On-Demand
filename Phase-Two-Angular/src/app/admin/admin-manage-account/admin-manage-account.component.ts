import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-admin-manage-account',
  templateUrl: './admin-manage-account.component.html',
  styleUrls: ['./admin-manage-account.component.css']
})
export class AdminManageAccountComponent implements OnInit {

  userData;
  mentorData;

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get('/assets/users.json').subscribe(userdata => {   
      this.userData = userdata;
    });
    this.http.get('/assets/trainers.json').subscribe(mentordata => {   
      this.mentorData = mentordata;
    });
  }

  userblock(i) {
    this.userData[i].status = "block";
  }

  userunblock(i) {
    this.userData[i].status = "unblock";
  }

  mentorblock(i) {
    this.mentorData[i].status = "block";
  }

  mentorunblock(i) {
    this.mentorData[i].status = "unblock";
  }

}
