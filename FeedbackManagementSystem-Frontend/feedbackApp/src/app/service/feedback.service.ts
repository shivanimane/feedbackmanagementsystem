import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FeedbackModel } from '../models/feedback.model';
import { TrainingProgramModel } from '../models/trainingprogram.model';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {

  constructor(private http: HttpClient) { }

  addFeedback(feedback : FeedbackModel){
    return this.http.post("http://localhost:5053/feedback/addFeedback" , feedback);
  }

  fetchAllFeedback(){
    return this.http.get<FeedbackModel[]>("http://localhost:5053/feedback/allFeedback");
  }

  fetchFeedbackByFacultyId(index:number){
    //return this.http.get<FeedbackModel>("http://localhost:5053/feedback/forEachFaculty/{facultyId}");
    return this.http.get<FeedbackModel>("http://localhost:5053/feedback/forEachFaculty/"+index);
  }

  fetchFeedbackByTrainingCode(index:number){
    return this.http.get<TrainingProgramModel>("http://localhost:5053/feedback/forEachTrainingProgram/{trainingCode}");
  }
}
