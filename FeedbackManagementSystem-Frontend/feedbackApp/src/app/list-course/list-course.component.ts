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
   }

  ngOnInit() {
    this.service.fetchAllCourses().subscribe(data => {
      this.courses =data;
      console.log(this.courses);
    });
  }
  remove(index: number){
    var ans =confirm("Are you sure you want to delete?");
    if(ans){
      this.service.deleteCourse(index).subscribe(response=>{
         console.log(this.courses);
      });
    }
  }

}
