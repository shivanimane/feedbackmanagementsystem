import { Component, OnInit } from '@angular/core';
import { Login } from '../models/login.model';
import { Router } from '@angular/router';
import { LoginService } from '../service/login.service';
import { EmployeeModel } from '../models/employee.model';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  login : Login; 
 // loginList : Login;
  employee : EmployeeModel;

  constructor(private route: Router, private loginservice: LoginService) { 
    this.login = new Login();
    this.employee = new EmployeeModel();
  }

  ngOnInit() {
    // this.loginList = this.loginservice.fetchLoginList();
    
    // setTimeout(()=>{this.loginList = this.loginservice.fetchLoginList()},100);
  }

  
  // checkLogin(){
  //   console.log(this.loginList["username"]);
  //   if(this.login.username==this.loginList[0].username && this.login.password==this.loginList[0].password){
  //     this.route.navigate(['admin']);
  //   }else if(this.login.username==this.loginList[1].username && this.login.password==this.loginList[1].password){
  //     this.route.navigate(['coordinator'])
  //   }else if(this.login.username==this.loginList[2].username && this.login.password==this.loginList[2].password){
  //     this.route.navigate(['participant'])
  //   }
  //   else{
  //     alert("Invalid Username or Password");
  //   }
  // }

  checkLogin(){
    console.log(this.login);
    this.loginservice.getEmployee(this.login).subscribe(data => this.employee = data);
    console.log(this.employee);

  }

}
