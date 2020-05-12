import { Component, OnInit } from '@angular/core';
import {TrainingProgramModel} from '../models/trainingprogram.model';
import {TrainingProgramService} from '../service/training-program.service';

@Component({
  selector: 'app-add-participant',
  templateUrl: './add-participant.component.html',
  styleUrls: ['./add-participant.component.css']
})
export class AddParticipantComponent implements OnInit {
trainingList: TrainingProgramModel[] = [];
  constructor(private trainingProgramService : TrainingProgramService) { }

  ngOnInit() {
    setTimeout(() => { this.reloadData() }, 100);
  }

  reloadData() {
    this.trainingProgramService.fetchAlltrainingPrograms().subscribe(data => {
      this.trainingList = data;
      console.log(this.trainingList);
    })   
  }




}
