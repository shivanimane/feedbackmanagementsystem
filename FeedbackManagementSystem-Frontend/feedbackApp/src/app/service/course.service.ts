import { Injectable } from '@angular/core';
import { CourseModel } from '../models/course.model';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  courses : CourseModel[] = [];

  constructor() { }

  //Add Courses
  addCourse(c : CourseModel){
    this.courses.push(c);
  }

  fetchAllCourses(){
    return this.courses;
  }

  deleteCourse(index : number){
    return this.courses.splice(index,1);
  }
}
