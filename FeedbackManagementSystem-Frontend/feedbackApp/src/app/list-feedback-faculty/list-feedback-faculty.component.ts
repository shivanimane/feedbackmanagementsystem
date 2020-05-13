import { Component, OnInit } from '@angular/core';
import { FeedbackModel } from '../models/feedback.model';
import { FeedbackService } from '../service/feedback.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-list-feedback-faculty',
  templateUrl: './list-feedback-faculty.component.html',
  styleUrls: ['./list-feedback-faculty.component.css']
})
export class ListFeedbackFacultyComponent implements OnInit {

  feedback:FeedbackModel;
  facultyId : number;

  constructor(private feedbackService: FeedbackService,
              private route:ActivatedRoute,
              private router: Router) {
              this.feedback = new FeedbackModel();
               }
            
  ngOnInit() {
    this.route.params.subscribe(x=>this.facultyId=x['id']);
    console.log(this.facultyId);
    this.feedbackService.fetchFeedbackByFacultyId(this.facultyId).subscribe(data =>{
      this.feedback=data;
      console.log(this.feedback);
    });
  }

  redirectToAdminr(){
    this.router.navigate(['admin']);
  }

}
