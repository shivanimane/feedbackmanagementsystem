import { Injectable } from '@angular/core';
import { CourseModel } from '../models/course.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  //courses : CourseModel[] = [];

  constructor(private http: HttpClient) { }

  //Add Courses
  addCourse(course : CourseModel){
    return this.http.post("http://localhost:5057/admin/addCourse" , course);
  }

  fetchAllCourses(){
    return this.http.get<CourseModel[]>("http://localhost:5057/admin/getAllCourseList");
  }

  deleteCourse(index : number){
    return this.http.delete("http://localhost:5057/admin/deleteCourse/"+index);
  }
}
