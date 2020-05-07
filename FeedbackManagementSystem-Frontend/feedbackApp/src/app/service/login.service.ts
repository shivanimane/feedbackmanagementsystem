import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from '../models/login.model';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  loginList : Login[] = [];

  constructor(public http : HttpClient) {
    this.http.get<Login[]>("../assets/login.json")
    .subscribe(data =>{
      this.loginList = data;
    });
   }

   fetchLoginList():Login[]{
     console.log(this.loginList);
    return this.loginList;
   }
}
