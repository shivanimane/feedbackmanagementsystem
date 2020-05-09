import { Injectable } from '@angular/core';
import { FacultyModel } from '../models/faculty.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FacultyService {
  faculties : FacultyModel[] = [];

  constructor(private http: HttpClient) { }

   //Add Faculty
   addFaculty(faculty : FacultyModel){
     console.log(faculty);
    return this.http.post<FacultyModel[]>("http://localhost:5053/faculty/addFaculty",faculty);
  }

  fetchAllFaculties(){
    return this.faculties;
  }

  deleteFaculty(index : number){
    return this.faculties.splice(index,1);
  }
}
