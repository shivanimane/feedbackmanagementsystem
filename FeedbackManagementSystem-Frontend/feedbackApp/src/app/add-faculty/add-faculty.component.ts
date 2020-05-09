import { Component, OnInit } from '@angular/core';
import { FacultyModel } from '../models/faculty.model';
import { FacultyService } from '../service/faculty.service';
import { Router } from '@angular/router';
import { SkillsModel } from '../models/skills.model';

@Component({
  selector: 'app-add-faculty',
  templateUrl: './add-faculty.component.html',
  styleUrls: ['./add-faculty.component.css']
})
export class AddFacultyComponent implements OnInit {
  faculty : FacultyModel;
  skills : SkillsModel[] =[];
  constructor(
    private service : FacultyService,
    private route : Router  ) {

    this.faculty = new FacultyModel();
   }

  ngOnInit() {
  }

  saveFaculty(){
    this.service.addFaculty(this.faculty);
    this.faculty = new FacultyModel();
    this.route.navigate(['list-faculty']);
  }
}
