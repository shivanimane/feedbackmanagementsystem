import { Component, OnInit } from '@angular/core';
import { TrainingProgramService } from '../service/training-program.service';
import { Router } from '@angular/router';
import { TrainingProgramDateModel } from '../models/trainingProgramDate.model';
import { CourseModel } from '../models/course.model';
import { CourseService } from '../service/course.service';
import { FacultyService } from '../service/faculty.service';
import { FacultyModel } from '../models/faculty.model';



@Component({
  selector: 'app-add-trainingprogram',
  templateUrl: './add-trainingprogram.component.html',
  styleUrls: ['./add-trainingprogram.component.css']
})
export class AddTrainingprogramComponent implements OnInit {
  trainingProgramDate : TrainingProgramDateModel ;
  courses: CourseModel[] = [];
  faculty: FacultyModel[] = [];
  courseId: number;
  facultyId: number;


  constructor(private service: TrainingProgramService,
    private route: Router, private courseService: CourseService, private facultyService: FacultyService) {
    this.trainingProgramDate = new TrainingProgramDateModel();
  }

  ngOnInit() {
    this.courseService.fetchAllCourses().subscribe(data => {
      this.courses = data;
      console.log(this.courses);
    });

    this.facultyService.fetchAllFaculties().subscribe(data => {
      this.faculty = data;
      console.log(this.faculty);
    });

  }

  addCourse(cnumber: number) {
    this.courseId = cnumber;
    console.log(cnumber);

  }

  addFaculty(fnumber: number) {
    this.facultyId = fnumber;
    console.log(fnumber);

  }

  savetrainingProgram() {
    this.service.addtrainingProgram(this.trainingProgramDate , this.courseId ,this.facultyId).subscribe(response => {
      this.route.navigate(['list-training']);
    });

  }

 



}
