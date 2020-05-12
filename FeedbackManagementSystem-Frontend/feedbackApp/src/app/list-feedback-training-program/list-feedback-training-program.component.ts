import { Component, OnInit } from '@angular/core';
import { FeedbackService } from '../service/feedback.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FeedbackModel } from '../models/feedback.model';

@Component({
  selector: 'app-list-feedback-training-program',
  templateUrl: './list-feedback-training-program.component.html',
  styleUrls: ['./list-feedback-training-program.component.css']
})
export class ListFeedbackTrainingProgramComponent implements OnInit {

  trainingId; number;
  feedback: FeedbackModel
  constructor(private service: FeedbackService,
                private route: ActivatedRoute,
                private router:Router) { }

  ngOnInit() {
    this.route.params.subscribe(x=>this.trainingId=x['tId']);
    console.log(this.trainingId);
    this.service.fetchFeedbackByTrainingCode(this.trainingId).subscribe(data =>{
      this.feedback=data;
      console.log(this.feedback);
    });
  }

  redirectToCoordinator(){
    this.router.navigate(['coordinator'])
  }

}
