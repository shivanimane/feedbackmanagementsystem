import { Component, OnInit } from '@angular/core';
import { TrainingProgramModel } from '../models/trainingprogram.model';
import { TrainingProgramService } from '../service/training-program.service';

@Component({
  selector: 'app-list-training-program',
  templateUrl: './list-training-program.component.html',
  styleUrls: ['./list-training-program.component.css']
})
export class ListTrainingProgramComponent implements OnInit {
  trainingList: TrainingProgramModel[] = [];
  constructor(private service: TrainingProgramService) { }

  ngOnInit() {
    this.service.fetchAlltrainingPrograms().subscribe(data => {
      this.trainingList = data;
      console.log(this.trainingList);
    })
  }

  remove(index: number) {
    var ans = confirm("Are you sure you want to delete?");
    if (ans) {
      this.service.deletetrainingProgram(index).subscribe(response => {
        console.log(this.trainingList);
      });
    }
  }

}
