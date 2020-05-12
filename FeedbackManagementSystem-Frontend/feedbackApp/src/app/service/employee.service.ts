import { Injectable } from '@angular/core';
import {EmployeeModel} from '../models/employee.model';
import {HttpClient} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
Employee : EmployeeModel[]=[];
  constructor(private http : HttpClient) { }

  fetchAllParticipants(){
    return this.http.get<EmployeeModel[]>("http://localhost:5056/coordinator/getAllTrainingProgramList");
  }
}
