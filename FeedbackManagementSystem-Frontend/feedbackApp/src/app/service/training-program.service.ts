import { Injectable } from '@angular/core';
import {TrainingProgramModel} from '../models/trainingprogram.model'
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TrainingProgramService {
trainingProgram : TrainingProgramModel[] = [];
  constructor(private http : HttpClient) { }

 //Add trainingPrograms
 addtrainingProgram(trainingProgram : TrainingProgramModel){
  return this.http.post("http://localhost:5056/coordinator/addTrainingProgram" , trainingProgram);
}

fetchAlltrainingPrograms(){
  return this.http.get<TrainingProgramModel[]>("http://localhost:5056/coordinator/getAllTrainingProgramList");
}

deletetrainingProgram(index : number){
  return this.http.delete("http://localhost:5056/coordinator/deleteTrainingProgram/"+index);
}


}
