import { Component, OnInit } from '@angular/core';
import {ParticipantEnrolledModel} from '../models/participantEnrolled.model'
import {EnrollService} from '../service/enroll.service';

@Component({
  selector: 'app-list-participant',
  templateUrl: './list-participant.component.html',
  styleUrls: ['./list-participant.component.css']
})
export class ListParticipantComponent implements OnInit {
enrolledList : ParticipantEnrolledModel[]=[];

  constructor(private enrolledService : EnrollService ) { }

  ngOnInit() {
    setTimeout(() => { this.reloadData() }, 100);
  }

  reloadData() {
    this.enrolledService.fetchAllParticipantEnrolled().subscribe(data =>
       {this.enrolledList=data ;
      console.log(this.enrolledList)})
    
  }

}
