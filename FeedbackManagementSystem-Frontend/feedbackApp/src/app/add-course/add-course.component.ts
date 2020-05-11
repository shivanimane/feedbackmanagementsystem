import { Component, OnInit } from '@angular/core';
import { CourseService } from '../service/course.service';
import { Router } from '@angular/router';
import { CourseModel } from '../models/course.model';

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.css']
})
export class AddCourseComponent implements OnInit {
  course : CourseModel;
  constructor(private service : CourseService, private route : Router) {
    this.course = new CourseModel();
   }

  ngOnInit() {
  }

  redirectToAdmin(){
    this.route.navigate(['admin']);
  }

  saveCourse(){
    
    console.log(this.course.courseName);
    this.service.addCourse(this.course).subscribe(response=>{
      this.route.navigate(['list-course']);
    });
    
  }

}
