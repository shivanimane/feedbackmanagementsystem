import { Component, OnInit } from '@angular/core';
import { TrainingProgramService } from '../service/training-program.service';
import { Router } from '@angular/router';
import { TrainingProgramModel } from '../models/trainingprogram.model';


@Component({
  selector: 'app-add-trainingprogram',
  templateUrl: './add-trainingprogram.component.html',
  styleUrls: ['./add-trainingprogram.component.css']
})
export class AddTrainingprogramComponent implements OnInit {
  trainingProgram: TrainingProgramModel;

  constructor(private service: TrainingProgramService, private route: Router) {
    this.trainingProgram = new TrainingProgramModel();
  }

  ngOnInit() {
  }


  savetrainingProgram() {

    console.log(this.trainingProgram.trainingCode, this.trainingProgram.course, this.trainingProgram.endDate, this.trainingProgram.faculty, this.trainingProgram.startDate);
    this.service.addtrainingProgram(this.trainingProgram).subscribe(response => {
      this.route.navigate(['list-trainingProgram']);
    });

  }
}
