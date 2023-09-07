import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService  {

  constructor() { }
  private isAuthenticated: boolean = false;

  login(username: string, password: string): boolean {
   
    if (username === 'ashish' && password === '1234') {
      this.isAuthenticated = true;
    } else {
      this.isAuthenticated = false;
    }
    return this.isAuthenticated;
  }

 
}
