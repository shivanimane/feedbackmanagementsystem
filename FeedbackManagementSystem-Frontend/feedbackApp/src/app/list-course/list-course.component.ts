import { Component, OnInit } from '@angular/core';
import { CourseModel } from '../models/course.model';
import { CourseService } from '../service/course.service';

@Component({
  selector: 'app-list-course',
  templateUrl: './list-course.component.html',
  styleUrls: ['./list-course.component.css']
})
export class ListCourseComponent implements OnInit {

  courses: CourseModel[] =[];
  constructor(private service: CourseService) {
    this.courses = this.service.fetchAllCourses();
   }

  ngOnInit() {
    this.courses = this.service.fetchAllCourses();
  }
  remove(index: number){
    var ans =confirm("Are you sure you want to delete?");
    if(ans){
      this.service.deleteCourse(index);
    }
  }

}
