import { Component, OnInit } from '@angular/core';
import { LoginServiceService } from 'src/app/login-service.service';

@Component({
  selector: 'app-home-search-result',
  templateUrl: './home-search-result.component.html',
  styleUrls: ['./home-search-result.component.css']
})
export class HomeSearchResultComponent implements OnInit {

  constructor(private loginService: LoginServiceService) { }

  ngOnInit() {
  }

}
