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

  trainingId: number;
  feedbackList: FeedbackModel[]=[];
  constructor(private service: FeedbackService,
                private route: ActivatedRoute,
                private router:Router) { 
                 // this.feedback = new FeedbackModel();
                }

  ngOnInit() {
    this.route.params.subscribe(x=>this.trainingId=x['tId']);
    console.log(this.trainingId);
    this.service.fetchFeedbackByTrainingCode(this.trainingId).subscribe(data =>{
      this.feedbackList=data;
      console.log(this.feedbackList);
      if(this.feedbackList.length==0){
        alert("No Feedback Available for this Training Program ");
        this.router.navigate(['list-training']);
      }
    });
  }

  redirectToCoordinator(){
    this.router.navigate(['coordinator'])
  }

}
