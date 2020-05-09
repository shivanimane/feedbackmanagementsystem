import { Injectable } from '@angular/core';
import { FacultyModel } from '../models/faculty.model';

@Injectable({
  providedIn: 'root'
})
export class FacultyService {
  faculties : FacultyModel[] = [];

  constructor() { }

   //Add Faculty
   addFaculty(f : FacultyModel){
    this.faculties.push(f);
  }

  fetchAllFaculties(){
    return this.faculties;
  }

  deleteFaculty(index : number){
    return this.faculties.splice(index,1);
  }
}
