import { Component, OnInit } from '@angular/core';
import { TrainingProgramModel } from '../models/trainingprogram.model';
import { TrainingProgramService } from '../service/training-program.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-training-program',
  templateUrl: './list-training-program.component.html',
  styleUrls: ['./list-training-program.component.css']
})
export class ListTrainingProgramComponent implements OnInit {
  trainingList: TrainingProgramModel[] = [];
  constructor(private service: TrainingProgramService,
              private route:Router) { }

  ngOnInit() {
    setTimeout(() => { this.reloadData() }, 100);
  }
  reloadData() {
    this.service.fetchAlltrainingPrograms().subscribe(data => {
      this.trainingList = data;
      console.log(this.trainingList);
    })   
  }


  deleteTraining(id:number){
    this.service.deletetrainingProgram(id)
    .subscribe(response => {console.log(response);
    this.reloadData();
  },
     error => console.log(error));
  }

  showFeedback(tId:number){
    this.route.navigate(['list-feedback-training-program',tId]);
  }

}
