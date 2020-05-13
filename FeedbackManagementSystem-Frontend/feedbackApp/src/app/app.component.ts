import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Feedback App';
  flag:boolean=false;
  
  
  constructor(private route: Router){
    if(localStorage.getItem('user')!=null){
      this.flag=true;
    }
  }

  logout(){
    localStorage.clear();
    this.route.navigate(['login']);
  }
 
}
