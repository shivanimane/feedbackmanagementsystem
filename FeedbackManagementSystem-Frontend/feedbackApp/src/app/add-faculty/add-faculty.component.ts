import { Component, OnInit } from '@angular/core';
import { FacultyModel } from '../models/faculty.model';
import { FacultyService } from '../service/faculty.service';
import { Router } from '@angular/router';
import { SkillsModel } from '../models/skills.model';
import { SkillService } from '../service/skill.service';

@Component({
  selector: 'app-add-faculty',
  templateUrl: './add-faculty.component.html',
  styleUrls: ['./add-faculty.component.css']
})
export class AddFacultyComponent implements OnInit {
  faculty : FacultyModel;
  skills : SkillsModel[] =[];
  selectedSkills : SkillsModel[] =[];
  flag : SkillsModel;
  index : number=0;
  constructor(
    private service : FacultyService,
    private route : Router,
    private skillsservice : SkillService  ) {

    this.faculty = new FacultyModel();
    this.flag = new SkillsModel();
   }

  ngOnInit() {
    this.skillsservice.getAllSkills().subscribe(data => this.skills=data);
  }

  add(index : number){
    this.selectedSkills.push(this.skills[index]);
  }

  saveFaculty(){
    this.service.addFaculty(this.faculty);
    this.faculty = new FacultyModel();
    this.route.navigate(['list-faculty']);
  }
}
