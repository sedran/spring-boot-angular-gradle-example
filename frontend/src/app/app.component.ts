import {Component, OnInit} from '@angular/core';
import {User, UserService} from "./user.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'frontend';
  user: User = null;

  constructor(private userService: UserService) {
  }

  ngOnInit(): void {
    this.userService.getCurrentUser()
      .subscribe(user => this.user = user);
  }
}
