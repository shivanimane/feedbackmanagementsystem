import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { ParticipantEnrolledModel } from '../models/participantEnrolled.model';



@Injectable({
  providedIn: 'root'
})
export class EnrollService {
participantEnrolled : ParticipantEnrolledModel[]=[] ;
  constructor(private http : HttpClient) { }

  //Enroll Participant
  enrollParticipant(trainingCode : number , participantId : number){
  return this.http.get<ParticipantEnrolledModel>("http://localhost:5056/coordinator/participantenroll/"+participantId+"/"+trainingCode);
}

 // Getting all enrolled Participant list
 fetchAllParticipantEnrolled(){
  return this.http.get<ParticipantEnrolledModel[]>("http://localhost:5056/coordinator/getAllParticipantEnrolled");
}
 




}
