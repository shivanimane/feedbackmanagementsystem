import { Component, OnInit } from '@angular/core';
import {TrainingProgramModel} from '../models/trainingprogram.model';
import {TrainingProgramService} from '../service/training-program.service';
import { EmployeeModel } from '../models/employee.model';
import { EmployeeService } from '../service/employee.service';
import {EnrollService} from '../service/enroll.service';
import {Router} from '@angular/router';
import {ParticipantEnrolledModel} from '../models/participantEnrolled.model'

@Component({
  selector: 'app-enroll-participant',
  templateUrl: './enroll-participant.component.html',
  styleUrls: ['./enroll-participant.component.css']
})
export class AddParticipantComponent implements OnInit {
trainingList: TrainingProgramModel[] = [] ;
employeeList: EmployeeModel[] = [];
trainingCode : number ;
ParticipantId : number ;
participantEnrolled : ParticipantEnrolledModel ;
  constructor(private trainingService : TrainingProgramService ,private employeeService: EmployeeService ,
     private route : Router,private enrollService : EnrollService) { }

  ngOnInit() {
    this.trainingService.fetchAlltrainingPrograms().subscribe(data => {
      this.trainingList = data;
      //console.log(this.trainingList);
    });
    
    this.employeeService.fetchAllParticipants().subscribe(z => {
      this.employeeList = z;
      console.log(this.employeeList);
    });
    
    //setTimeout(() => { this.reloadData() }, 100);
  }

  // reloadData() {
  //   this.employeeService.fetchAllParticipants().subscribe(z => {
  //   this.employeeList = z;
  //     console.log(this.employeeList);
  //   });
  // }

  addTraining(tnumber: number) {
    this.trainingCode = tnumber;
    console.log(tnumber);

  }

  addparticipant(pnumber: number) {
    this.ParticipantId = pnumber;
    console.log(pnumber);

  }

  enrollParticipant(){
    this.enrollService.enrollParticipant(this.trainingCode , this.ParticipantId).subscribe(data => {
      this.participantEnrolled = data;
      console.log(this.participantEnrolled);
      this.route.navigate(['list-participant']);
    })   
  }

  
  clickOnAddTrainingProgram(){
    this.route.navigate(['add-training']);
  }

  clickOfListTrainingProgram(){
    this.route.navigate(['list-training']);
  }

  clickOnAddParticipantEnrolled(){
    this.route.navigate(['enroll-participant']);
  }
  clickOfListParticipantEnrolled(){
    this.route.navigate(['list-participant']);
  }
  logout(){
    //localStorage.clear();
    sessionStorage.clear();
    this.route.navigate(['login']);
  }

}
