import { Component } from '@angular/core';
import { UserService } from './user.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  username: string = '';
  password: string = '';
  constructor(private userService: UserService) {}

  login(): void {
    const isAuthenticated = this.userService.login(this.username, this.password);
    if (isAuthenticated) {
      alert("Login SucessFull")
      
    } else {
      
      alert('Login failed');
    }

  }



  
}