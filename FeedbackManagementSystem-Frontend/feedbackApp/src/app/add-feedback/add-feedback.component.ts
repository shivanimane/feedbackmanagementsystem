import { Component, OnInit } from '@angular/core';
import { FeedbackModel } from '../models/feedback.model';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-feedback',
  templateUrl: './add-feedback.component.html',
  styleUrls: ['./add-feedback.component.css']
})
export class AddFeedbackComponent implements OnInit {

  feedback : FeedbackModel[]=[];
  //fbClrfyDbts:number;
  constructor() { }

  ngOnInit() {
  }

  onSubmit(form : NgForm){
    console.log(this.feedback);
  }

}
