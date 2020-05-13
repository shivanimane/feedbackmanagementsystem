import { Component, OnInit } from '@angular/core';
import {ParticipantEnrolledModel} from '../models/participantEnrolled.model'
import {EnrollService} from '../service/enroll.service';
import { TrainingProgramModel } from '../models/trainingprogram.model';

@Component({
  selector: 'app-list-participant',
  templateUrl: './list-participant.component.html',
  styleUrls: ['./list-participant.component.css']
})
export class ListParticipantComponent implements OnInit {
enrolledList : ParticipantEnrolledModel[]=[];
//trainingP:TrainingProgramModel;

  constructor(private enrolledService : EnrollService ) { 
    //this.trainingP =new TrainingProgramModel();
  }

  ngOnInit() {
    setTimeout(() => { this.reloadData() }, 100);
    
    //console.log(this.enrolledList[0].trainingProgram.trainingCode);
  }

  reloadData() {
    this.enrolledService.fetchAllParticipantEnrolled().subscribe(data =>
       {this.enrolledList=data ;
      console.log(this.enrolledList);
    });
    
  }

}
