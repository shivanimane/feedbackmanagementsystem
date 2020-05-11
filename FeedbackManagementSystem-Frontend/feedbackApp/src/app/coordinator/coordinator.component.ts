import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-coordinator',
  templateUrl: './coordinator.component.html',
  styleUrls: ['./coordinator.component.css']
})
export class CoordinatorComponent implements OnInit {

  constructor(private route : Router) { }

  ngOnInit() {
  }

  clickOnAddTrainingProgram(){
    this.route.navigate(['add-training']);
  }

  clickOnListTrainingProgram(){
    this.route.navigate(['list-training']);
  }

  
}
